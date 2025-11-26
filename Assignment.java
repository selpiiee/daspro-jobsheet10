
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] responses = new int[10][6];
        int i = 0, j = 0;

        System.out.println("===== CUSTOMER SATISFACTION SURVEY =====");

        i = 0;
        while (i < 10) {
            System.out.println("\nRespondent " + (i + 1) + ": ");
            j = 0;
            while (j < 6) {
                System.out.print("Question " + (j + 1) + " (1-5): ");
                int answer = sc.nextInt();

                if (answer < 1 || answer > 5) {
                    System.out.println("Invalid input! Please enter 1-5");
                } else {
                    responses[i][j] = answer;
                    j++;
                }
            }
            i++;
        }
        System.out.println("\n===== ALL SURVEY RESPONSES =====");
        for (i = 0; i < 10; i++) {
            System.out.print("Respondent " + (i + 1) + ": ");
            for (j = 0; j < 6; j++) {
                System.out.print(responses[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n===== AVERAGE PER RESPONDENT =====");
        i = 0;
        while (i < 10) {
            int sum = 0;
            j = 0;
            while (j < 6) {
                sum += responses[i][j];
                j++;
            }
            double average = (double) sum / 6;
            System.out.printf("Respondent %d: %.2f\n", (i + 1), average);
            i++;
        }

        System.out.println("\n===== AVREAGE PER QUESTION =====");
        j = 0;
        while (j < 6) {
            int sum = 0;
            i = 0;
            while (i < 10) {
                sum += responses[i][j];
                i++;
            }
            double average = (double) sum / 10;
            System.out.printf("Question %d: %.2f\n", (i + 1), average);
            j++;
        }

        System.out.println("\n===== OVERALL AVERAGE =====");
        i = 0;
        int totalSum = 0;
        j = 0;
        while (i < 10) {
            while (j < 6) {
                totalSum += responses[i][j];
                j++;
            }
            i++;
        }

        double overallAverage = (double) totalSum / (10 * 6);
        System.out.printf("Overall Average: %.2f\n", overallAverage);

        sc.close();
    }
}
