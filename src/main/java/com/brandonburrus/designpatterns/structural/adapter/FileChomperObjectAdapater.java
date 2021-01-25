package com.brandonburrus.designpatterns.structural.adapter;

import java.io.File;

public class FileChomperObjectAdapater implements ChompableResource {

    private final File underlyingFile;

    public FileChomperObjectAdapater(File underlyingFile) {
        this.underlyingFile = underlyingFile;
    }


    @Override
    public Object getChompableResource() {
        return underlyingFile.getName();
    }
}
