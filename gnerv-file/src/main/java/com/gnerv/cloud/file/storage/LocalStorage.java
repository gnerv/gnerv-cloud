package com.gnerv.cloud.file.storage;

import com.alibaba.fastjson.JSON;
import com.gnerv.cloud.file.entity.FileManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @description:
 * @author: Gnerv LiGen
 * @date: 2018-05-15
 **/
@Component
public class LocalStorage {

    private final String CATALOG = "_catalog";

    @Value("${com.gnerv.cloud.filemanager.path}")
    private String filemanagerPath;

    public FileManager saveFile(MultipartFile file) {
        FileManager filemanager = new FileManager();
        if (file.isEmpty()) {
            return filemanager;
        }
        try {
            byte[] bytes = file.getBytes();
            String md5DigestAsHex = DigestUtils.md5DigestAsHex(bytes);

            String storagePath = filemanagerPath + md5DigestAsHex;
            Path path = Paths.get(storagePath);
            Files.write(path, bytes);

            String originalFilename = file.getOriginalFilename();
            String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));

            filemanager.setMd5(md5DigestAsHex);
            filemanager.setFileName(originalFilename);
            filemanager.setFilePath(storagePath);
            filemanager.setFileSize(file.getSize());
            filemanager.setFileSuffix(fileSuffix);

            String jsonString = JSON.toJSONString(filemanager);
            bytes = jsonString.getBytes();
            storagePath = filemanagerPath + md5DigestAsHex + CATALOG;
            path = Paths.get(storagePath);
            Files.write(path, bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return filemanager;
    }

    public FileManager getFileByMd5(String md5) {
        String storagePath = filemanagerPath + md5 + CATALOG;
        Path path = Paths.get(storagePath);
        List<String> readLines = null;
        try {
            readLines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileManager fileManager = JSON.parseObject(readLines.get(0), FileManager.class);
        File file = new File(filemanagerPath, md5);
        fileManager.setFile(file);
        return fileManager;
    }
}
