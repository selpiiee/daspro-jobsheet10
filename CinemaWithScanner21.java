
import java.util.Scanner;

public class CinemaWithScanner21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] audience = new String[4][2];
        int row, column, choice;
        String name, next;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter a name: ");
                name = sc.nextLine();
                System.out.print("Enter row number: ");
                row = sc.nextInt();
                System.out.print("Enter column number: ");
                column = sc.nextInt();
                sc.nextLine();

                if (row < 1 || row > 4 || column < 1 || column > 2) {
                    System.out.println("Seat not available!");
                    continue;
                }

                if (audience[row - 1][column - 1] != null) {
                    System.out.print("Seat already taken!");
                    continue;
                }

                audience[row - 1][column - 1] = name;
                System.out.println("Data saved!");

            } else if (choice == 2) {
                System.out.println("\nAudience List: ");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (audience[i][j] == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(audience[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Wrong choice!");
            }
        }
        System.out.println("Peogram finished!!!");
        sc.close();
    }
}
