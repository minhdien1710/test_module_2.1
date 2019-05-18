import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
        int choice;
        boolean cancel = false;
        Manager_student manager_student = new Manager_student();
        do {
            System.out.println("menu");
            System.out.println("1.Add");
            System.out.println("2.Edit");
            System.out.println("3.Delete");
            System.out.println("4.Sort");
            System.out.println("5.Show list");
            System.out.println("0.Cancel");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager_student.add();
                case 2:
                    manager_student.edit();
                case 3:
                    manager_student.delete();
                case 4:
                    manager_student.sort();
                case 5:
                    manager_student.show();
                case 0:
                    System.exit(0);
                    cancel = true;
            }
        }
        while (choice != 0);
    }
}
