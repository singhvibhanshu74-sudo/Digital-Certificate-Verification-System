public class Document {

    private String documentId;
    private String documentName;
    private String ownerName;
    private String documentType;

    // Constructor
    public Document(String documentId, String documentName,
                    String ownerName, String documentType) {

        this.documentId = documentId;
        this.documentName = documentName;
        this.ownerName = ownerName;
        this.documentType = documentType;
    }

    // Getter methods
    public String getDocumentId() {
        return documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getDocumentType() {
        return documentType;
    }

    // Display document details
    public void displayDetails() {

        System.out.println("Document ID: " + documentId);
        System.out.println("Document Name: " + documentName);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Document Type: " + documentType);
    }
}
