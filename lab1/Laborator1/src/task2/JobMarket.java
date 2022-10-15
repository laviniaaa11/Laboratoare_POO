package task2;

public class JobMarket {
    public static void main(String[] args) {

        // Task1
        Student[] students = new Student[4];
        for (int i = 0; i < 4; i++) {
            students[i] = new Student();
        }

        Internship[] internships = new Internship[4];
        for (int i = 0; i < 4; i++) {
            internships[i] = new Internship();
        }
        students[0].setName("Gigel");
        students[1].setName("Dorel");
        students[2].setName("Marcel");
        students[3].setName("Ionel");

        students[0].setGrade(7);
        students[1].setGrade(2);
        students[2].setGrade(8);
        students[3].setGrade(4);

        for (int i = 0; i < 4; i++) {
            internships[i].setStudents(students);
        }

        internships[0].setName("Google");
        internships[1].setName("Amazon");
        internships[2].setName("Facebook");
        internships[3].setName("Microsoft");


        for (int i = 0; i < 4; i++) {
            internships[i].setMingrade("5");
            internships[i].chooseCandidateForInterview();
        }

        // Task 2
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Daniel");
        student2.setName("Daniel");
        student1.setGrade(4);
        student2.setGrade(4);

        if (student1.equals(student2)) {
            System.out.println("Studentii au acelasi nume si aceeasi nota.");
        } else {
            System.out.println("Studentii nu au acelasi nume si aceeasi nota.");
        }

    }
}
