import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Group university = new Group();

        System.out.println("Write data.\npress 0 for finish\npress 1 for continue");
        while (true) {

            System.out.println("Enter student name: ");
            String name = scanner.next();
            System.out.println("Enter student surname: ");
            String surname = scanner.next();
            System.out.println("Enter average grade: ");
            double averageGrade = scanner.nextDouble();
            Student s1 = new Student(name, surname, averageGrade);
            university.add(s1);
            Integer input = scanner.nextInt();
            if (input == 0)
                break;
        }
        while (true) {
            System.out.println("press 0 for print\npress 1 for delete the student");
            System.out.println("press 2 for change student's name\npress 3 for change student's surname");
            System.out.println("press 4 for change student's mark");
            Integer input = scanner.nextInt();
            switch (input) {
                case 0:
                    university.printAllStudents();
                    break;
                case 1: {
                    System.out.println("Enter the number of student which will be removed from the list: ");
                    int num = scanner.nextInt();
                    university.delete(num);
                    break;
                }
                case 2: {
                    System.out.println("Enter the number of student which will be rename: ");
                    int num = scanner.nextInt();
                    System.out.println("Enter new name: ");
                    String newName = scanner.next();
                    university.changeStudentName(num, newName);
                    break;
                }
                case 3: {
                    System.out.println("Enter the number of student which will be rename: ");
                    int num = scanner.nextInt();
                    System.out.println("Enter new surname: ");
                    String newSurname = scanner.next();
                    university.changeStudentName(num, newSurname);
                    break;
                }
                case 4: {
                    System.out.println("Enter the number of student which will have a new mark: ");
                    int num = scanner.nextInt();
                    System.out.println("Enter new mark: ");
                    Integer newMark = scanner.nextInt();
                    university.changeStudentGrade(num, newMark);
                    break;
                }
            }
        }
    }
}