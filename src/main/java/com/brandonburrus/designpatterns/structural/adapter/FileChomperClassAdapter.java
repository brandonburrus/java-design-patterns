package com.brandonburrus.designpatterns.structural.adapter;

import java.io.File;

public class FileChomperClassAdapter extends File implements ChompableResource {
    public FileChomperClassAdapter(String pathname) {
        super(pathname);
    }

    @Override
    public Object getChompableResource() {
        return getName();
    }
}
