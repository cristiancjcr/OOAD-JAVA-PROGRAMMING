// FactoryMethodExample.java (MAIN)
public class FactoryMethodExample {
    public static void main(String[] args) {
        // Crearea unui creator de documente PDF
        DocumentCreator pdfCreator = new PDFDocumentCreator();
        pdfCreator.openAndPrint();  // Va crea și va imprima un document PDF
        
        // Crearea unui creator de documente Word
        DocumentCreator wordCreator = new WordDocumentCreator();
        wordCreator.openAndPrint();  // Va crea și va imprima un document Word
    }
}
