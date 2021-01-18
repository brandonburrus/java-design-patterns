package com.brandonburrus.designpatterns.factorymethod;

import java.util.List;

public interface App {

    Document newDocument();
    void addDocument();
    List<Document> getDocuments();

}
