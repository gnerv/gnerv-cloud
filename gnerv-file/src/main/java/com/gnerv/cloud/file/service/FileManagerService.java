package com.gnerv.cloud.file.service;

import com.gnerv.cloud.file.entity.FileManager;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: Gnerv LiGen
 * @date: 2018-05-15
 **/
public interface FileManagerService {

    FileManager saveFile(MultipartFile file);

    FileManager getFileByMd5(String md5);
}
