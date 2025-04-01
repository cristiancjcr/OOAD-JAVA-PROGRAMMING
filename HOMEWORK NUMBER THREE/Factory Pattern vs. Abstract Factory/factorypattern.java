public interface Document {
    void open();
    void save();
}

public class PDFDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document");
    }

    public void save() {
        System.out.println("Saving PDF document");
    }
}

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document");
    }

    public void save() {
        System.out.println("Saving Word document");
    }
}

public abstract class DocumentFactory {
    public abstract Document createDocument();
}

public class PDFDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PDFDocument();
    }
}

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
