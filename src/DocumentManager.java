import java.util.ArrayList;

public class DocumentManager {

    private ArrayList<Document> documents;

    // Constructor
    public DocumentManager() {
        documents = new ArrayList<>();
    }

    // Add a document
    public void addDocument(Document document) {
        documents.add(document);
    }

    // Search for a document using its ID
    public Document searchDocument(String documentId) {

        for (Document document : documents) {

            if (document.getDocumentId().equals(documentId)) {
                return document;
            }
        }

        return null;
    }

    // Display all documents
    public void displayAllDocuments() {

        for (Document document : documents) {
            document.displayDetails();
            System.out.println("----------------------------");
        }
    }
}
