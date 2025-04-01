// DocumentCreator.java
public abstract class DocumentCreator {
    // Factory Method
    public abstract Document createDocument();
    
    public void openAndPrint() {
        Document document = createDocument();
        document.print();
    }
}
