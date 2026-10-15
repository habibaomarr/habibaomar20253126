
package javaapplication34;
import java.util.Scanner;
public class JavaApplication34 {
    public static void main(String[] args) {
      System.out.println("enter a positive number");
    Scanner Scan = new Scanner(System.in);
    int x = Scan.nextInt();
    int largest = 0 ;
  
    while (x!=0) {
        if ( x > largest ) {
            largest = x ;
    }
       System.out.println("enter 0 to stop");
       x = Scan.nextInt();
    }
    System.out.println(largest);
    }
}