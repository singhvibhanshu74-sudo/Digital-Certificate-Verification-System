public class Main {

    public static void main(String[] args) {

        DocumentManager manager = new DocumentManager();

        Document document1 = new Document(
                "DOC001",
                "Aadhaar Card",
                "Rahul",
                "Identity Document"
        );

        Document document2 = new Document(
                "DOC002",
                "Driving License",
                "Aman",
                "License"
        );

        manager.addDocument(document1);
        manager.addDocument(document2);

        System.out.println("DIGITAL DOCUMENT VERIFICATION SYSTEM");
        System.out.println("====================================");

        System.out.println("\nAll Documents:");

        manager.displayAllDocuments();

        System.out.println("\nSearching for DOC001:");

        Document result = manager.searchDocument("DOC001");

        if (result != null) {
            result.displayDetails();
        } else {
            System.out.println("Document not found.");
        }
    }
}
