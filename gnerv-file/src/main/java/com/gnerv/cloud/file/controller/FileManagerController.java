package com.gnerv.cloud.file.controller;

import com.gnerv.cloud.file.common.FileManagerR;
import com.gnerv.cloud.file.entity.FileManager;
import com.gnerv.cloud.file.service.FileManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @description:
 * @author: Gnerv LiGen
 * @date: 2018-05-15
 **/
@RestController
public class FileManagerController {

    @Autowired
    FileManagerService fileManagerService;

    @RequestMapping(value = "/uploadSingleFile")
    public FileManagerR uploadSingleFile(MultipartFile file) {
        FileManager fileManager = fileManagerService.saveFile(file);
        return FileManagerR.ok().data("fileManager", fileManager);
    }

    @RequestMapping(value = "/downloadSingleFile/{md5}")
    public FileManagerR downloadSingleFile(@PathVariable(value = "md5") String md5, HttpServletResponse response) {
        FileManager fileManager = fileManagerService.getFileByMd5(md5);
        try {
            /**
             * 设置文件为直接下载 不可在线打开
             * 设置文件名和编码
             */
            response.setContentType("application/octet-stream");
            String fileName = URLEncoder.encode(fileManager.getFileName(), "UTF-8");
            response.setHeader( "Content-Disposition", "attachment;filename=" +fileName);
            FileCopyUtils.copy(new FileInputStream(fileManager.getFile()), response.getOutputStream());
        } catch (Exception e) {

        }
        return FileManagerR.ok().data("fileManager", fileManager);
    }
}
