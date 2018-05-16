package com.gnerv.cloud.file.entity;

import java.io.File;
import java.io.Serializable;

/**
 * <p>
 * 文件管理类实体
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public class FileManager implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean fileIs = true;

    private String md5;

    private String fileName;

    private String filePath;

    private long fileSize;

    private String fileSuffix;

    private String storageSpace = "local";

    private File file;

    public boolean isFileIs() {
        return fileIs;
    }

    public void setFileIs(boolean fileIs) {
        this.fileIs = fileIs;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public String getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "FileManager{" +
                "fileIs=" + fileIs +
                ", md5='" + md5 + '\'' +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", fileSuffix='" + fileSuffix + '\'' +
                ", storageSpace='" + storageSpace + '\'' +
                '}';
    }
}
