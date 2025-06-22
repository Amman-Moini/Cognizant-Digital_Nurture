package com.example.document.factories;

import com.example.document.Document;
import com.example.document.products.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
