package com.example.practice_spring_boot.Service;

public class Photo {
    private String id;
    private String fileName;


    public Photo() {
        
    }

    public Photo(String id, String FileName) {
        this.id = id;
        this.fileName = FileName;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getFileName() {
        return fileName;
    }


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
