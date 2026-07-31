import java.util.Scanner;

class StudentDetails {
    String name;
    int rollNo;

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        StudentDetails s = new StudentDetails();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();

        s.display();
    }
}