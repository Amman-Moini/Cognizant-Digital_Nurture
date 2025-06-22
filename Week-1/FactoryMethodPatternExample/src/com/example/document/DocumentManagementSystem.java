package com.example.document;

import com.example.document.factories.DocumentFactory;
import com.example.document.factories.ExcelDocumentFactory;
import com.example.document.factories.PdfDocumentFactory;
import com.example.document.factories.WordDocumentFactory;

public class DocumentManagementSystem {

    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        System.out.println("=== Creating documents directly via factory method ===");
        Document wordDoc = wordFactory.createDocument();
        System.out.println("Created: " + wordDoc.getType() + " Document");
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();
        System.out.println();

        Document pdfDoc = pdfFactory.createDocument();
        System.out.println("Created: " + pdfDoc.getType() + " Document");
        pdfDoc.open();
        pdfDoc.close();
        System.out.println();

        Document excelDoc = excelFactory.createDocument();
        System.out.println("Created: " + excelDoc.getType() + " Document");
        excelDoc.open();
        excelDoc.close();
        System.out.println();

        System.out.println("\n=== Managing documents using the creator's common operation ===");
        wordFactory.manageDocument();
        pdfFactory.manageDocument();
        excelFactory.manageDocument();
    }
}