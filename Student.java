class Student {
    String name;
    int rollNo;
    String department;

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Anvi";
        s.rollNo = 101;
        s.department = "CSE";

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Department: " + s.department);
    }

    public void display() {
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}