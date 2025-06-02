package assignment4;

//ComputerTeacher class extending Teacher
public class ComputerTeacher extends TeacherA {
public static void main(String[] args) {
   ComputerTeacher ct = new ComputerTeacher();
   System.out.println("Designation: " + ct.designation);
   System.out.println("College Name: " + ct.collegeName);
   ct.does();
}
}