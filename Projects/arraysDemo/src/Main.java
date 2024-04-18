public class Main {
    public static void main(String[] args) {

        String student1 = "memed";
        String student2 = "ahmed";
        String student3 = "muhammed";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("-----------------------");

        String[] students = new String[4];
        students[0] = "memed";
        students[1] = "ahmed";
        students[2] = "muhammed";
        students[3] = "samed";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("-----------------------");

        for (String student : students) {
            System.out.println(student);
        }


    }
}