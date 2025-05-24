package Exam;

import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Double> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
        // Adding initial student grades
        studentGrades.put("Angel",85.9);
        studentGrades.put("Bubba", 90.0);
        studentGrades.put("Chris", 76.3);
        studentGrades.put("Srikant", 88.2);
        studentGrades.put("Chaithra", 94.1);
        studentGrades.put("Gwladys", 81.7);
        studentGrades.put("Leena", 79.4);
        studentGrades.put("Jamie", 84.6); 
        studentGrades.put("John", 91.8);
        studentGrades.put("Levi", 87.9);

    }

    public void search(String studentName) {
        // Print all students and their grades
        System.out.println("All students and their grades:");
        studentGrades.forEach((name, grade) ->
            System.out.println(name + ": " + grade));

        // Retrieve a student's grade given their name
        if (studentGrades.containsKey(studentName)) {
            System.out.println(studentName + "'s grade: " + studentGrades.get(studentName));
        } else {
            System.out.println("Student " + studentName + " is missing from the list.");
        }

        // Remove a student from the hashmap
        studentGrades.remove(studentName);
        System.out.println("After removing " + studentName + ":");

        // Print all students and their grades again
        System.out.println("All students and their grades after removal:");
        studentGrades.forEach((name, grade) ->
            System.out.println(name + ": " + grade));
    }
}
