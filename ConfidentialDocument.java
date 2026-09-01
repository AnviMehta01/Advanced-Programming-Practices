package week6;

interface Confidential {
}

class PublicDocument {
    String name;

    PublicDocument(String name) {
        this.name = name;
    }
}

class ConfidentialDocumentData implements Confidential {
    String name;

    ConfidentialDocumentData(String name) {
        this.name = name;
    }
}

public class ConfidentialDocument {
    public static void main(String[] args) {

        Object[] documents = {
            new PublicDocument("College Notice"),
            new ConfidentialDocumentData("Student Records"),
            new PublicDocument("Event Schedule"),
            new ConfidentialDocumentData("Salary Details")
        };

        for (Object document : documents) {

            if (document instanceof Confidential) {
                System.out.println("Confidential Document");
            } else {
                System.out.println("Public Document");
            }
        }
    }
}
