package model;

public class Certificate {

    private String certificateId;
    private String holderName;
    private String course;
    private String issueDate;
    private String expiryDate;
    private String status;

    public Certificate(String certificateId,
                       String holderName,
                       String course,
                       String issueDate,
                       String expiryDate,
                       String status) {

        this.certificateId = certificateId;
        this.holderName = holderName;
        this.course = course;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.status = status;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getCourse() {
        return course;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void displayDetails() {

        System.out.println("Certificate ID: " + certificateId);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Course: " + course);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }
}