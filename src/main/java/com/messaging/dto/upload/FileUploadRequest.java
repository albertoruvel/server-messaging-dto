package com.messaging.dto.upload;

public class FileUploadRequest {

    private String fileName;
    private String fileType;

    public FileUploadRequest() {
    }

    public FileUploadRequest(String currentFilePath, String fileType) {
        this.fileName = currentFilePath;
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String currentFilePath) {
        this.fileName = currentFilePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}
