package task2;

import java.util.Random;

public class Internship {
   private String name;
   private String mingrade;

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setMingrade(String mingrade) {
        this.mingrade = mingrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Student[] students = new Student[4];

    public Student chooseCandidateRandomly() {
        Random random = new Random();
        return students[random.nextInt(students.length)];
    }

    public void chooseCandidateForInterview() {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() >= Integer.parseInt(mingrade)) {
                System.out.println("Candidate " + students[i].getName() + " got a phone interview at " + name + '\n');
            }
        }
    }
}