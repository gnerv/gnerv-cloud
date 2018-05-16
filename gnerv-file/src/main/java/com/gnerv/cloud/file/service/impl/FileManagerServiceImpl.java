package com.gnerv.cloud.file.service.impl;

import com.gnerv.cloud.file.entity.FileManager;
import com.gnerv.cloud.file.service.FileManagerService;
import com.gnerv.cloud.file.storage.LocalStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: Gnerv LiGen
 * @date: 2018-05-15
 **/
@Service
public class FileManagerServiceImpl implements FileManagerService {

    @Autowired
    LocalStorage localStorage;

    @Override
    public FileManager saveFile(MultipartFile file) {
        FileManager fileManager = localStorage.saveFile(file);
        return fileManager;
    }

    @Override
    public FileManager getFileByMd5(String md5) {
        FileManager fileManager = localStorage.getFileByMd5(md5);
        return fileManager;
    }
}
