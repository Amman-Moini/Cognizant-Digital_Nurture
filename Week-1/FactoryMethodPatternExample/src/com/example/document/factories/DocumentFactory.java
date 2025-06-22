package com.example.document.factories;

import com.example.document.Document;

public abstract class DocumentFactory {

    public abstract Document createDocument();

    public void manageDocument() {
        Document doc = createDocument();
        System.out.println("--- Managing new " + doc.getType() + " document ---");
        doc.open();
        doc.save();
        doc.close();
        System.out.println("--- Finished managing " + doc.getType() + " document ---\n");
    }
}
