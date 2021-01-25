package com.brandonburrus.designpatterns.structural.adapter;

import java.io.File;

public class FileChomperAdapater implements ChompableResource {

    private final File underlyingFile;

    public FileChomperAdapater(File underlyingFile) {
        this.underlyingFile = underlyingFile;
    }


    @Override
    public Object getChompableResource() {
        return underlyingFile.getName();
    }
}
