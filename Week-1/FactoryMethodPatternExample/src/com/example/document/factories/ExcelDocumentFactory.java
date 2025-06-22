package com.example.document.factories;

import com.example.document.Document;
import com.example.document.products.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
