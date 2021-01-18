package com.brandonburrus.designpatterns.creational.factorymethod;

import java.util.List;

/**
 * The interface App.
 */
public interface App {

    /**
     * New document document.
     *
     * @return the document
     */
    Document newDocument();

    /**
     * Add document.
     */
    void addDocument();

    /**
     * Gets documents.
     *
     * @return the documents
     */
    List<Document> getDocuments();

}
