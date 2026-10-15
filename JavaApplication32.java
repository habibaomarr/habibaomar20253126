
package javaapplication32;
import java.util.Scanner;
public class JavaApplication32 {
            public static void main(String[] args) {
                System.out.println("enter a number");
                Scanner Scan = new Scanner(System.in);
                int x = Scan.nextInt();
                if (x%3==0) {
                    System.out.println("Divisible by 3");
                }
                else if (x%5==0) {
                 System.out.println("Divisible by 5");
            }
                else if (x%3==0 && x%5==0) {
                     System.out.println("Divisible by 3 and 5");
                }
                else {
                     System.out.println("Not Divisible by 3 or 5");
                }
    }
    
}
