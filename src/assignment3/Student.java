package assignment3;

public class Student {
    // Variables
    private int SID;
    private String Sname;
    private int Sub1;
    private int Sub2;
    private int Sub3;

    // Constructor
    public Student(int SID, String Sname, int Sub1, int Sub2, int Sub3) {
        this.SID = SID;
        this.Sname = Sname;
        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
    }

    // Method to get student data
    public void getStudData() {
        System.out.println("Student ID: " + SID);
        System.out.println("Student Name: " + Sname);
    }

    // Method to get student marks
    public void getStuMarks() {
        System.out.println("Marks in Subject 1: " + Sub1);
        System.out.println("Marks in Subject 2: " + Sub2);
        System.out.println("Marks in Subject 3: " + Sub3);
    }

    // Method to calculate total marks
    public int totalMarks() {
        return Sub1 + Sub2 + Sub3;
    }

    public static void main(String[] args) {
        // Create Student objects
        Student stu1 = new Student(1, "Chris", 85, 90, 78);
        Student stu2 = new Student(2, "Bubba", 88, 92, 80);

        // Call methods for stu1
        System.out.println("Details for Student 1:");
        stu1.getStudData();
        stu1.getStuMarks();
        System.out.println("Total Marks: " + stu1.totalMarks());

        // Call methods for stu2
        System.out.println("\nDetails for Student 2:");
        stu2.getStudData();
        stu2.getStuMarks();
        System.out.println("Total Marks: " + stu2.totalMarks());
    }
}
