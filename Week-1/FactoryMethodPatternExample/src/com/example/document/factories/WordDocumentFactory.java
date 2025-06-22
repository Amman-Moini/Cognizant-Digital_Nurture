package com.example.document.factories;

import com.example.document.Document;
import com.example.document.products.WordDocument;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}