package com.brandonburrus.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractApp implements App {

    private List<Document> documents;

    AbstractApp(List<Document> documents) {
        this.documents = documents;
    }

    AbstractApp() {
        this(new ArrayList<>());
    }

    @Override
    public List<Document> getDocuments() {
        return documents;
    }

    @Override
    public void addDocument() {
        documents.add(newDocument());
    }
}
