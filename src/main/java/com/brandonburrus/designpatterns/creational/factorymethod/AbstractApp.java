package com.brandonburrus.designpatterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Abstract app.
 */
public abstract class AbstractApp implements App {

    private List<Document> documents;

    /**
     * Instantiates a new Abstract app.
     *
     * @param documents the documents
     */
    AbstractApp(List<Document> documents) {
        this.documents = documents;
    }

    /**
     * Instantiates a new Abstract app.
     */
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
