

package habibasheet5q2;
import java.util.Scanner;

public class Habibasheet5q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] students = new String[3][2];

        System.out.println("Enter name and grade for 3 students:");
        for (int i = 0; i < 3; i++) {
            students[i][0] = scanner.next();
            students[i][1] = scanner.next(); 
        }

        for (int i = 0; i < 3; i++) {
            String displayString = students[i][0].concat(": ").concat(students[i][1]);
            System.out.println(displayString);
        }
        int countA = 0;
        for (int i = 0; i < 3; i++) {
            if (students[i][1].equalsIgnoreCase("A")) {
                countA++;
            }
        }
        System.out.println("Students with grade A: " + countA);

        System.out.print("Enter first letter: ");
        String prefix = scanner.next();
        int countPrefix = 0;
        for (int i = 0; i < 3; i++) {
            if (students[i][0].startsWith(prefix)) {
                countPrefix++;
            }
        }
        System.out.println("Names starting with " + prefix + ": " + countPrefix);

        scanner.close();
    }
}
   