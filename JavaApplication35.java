package javaapplication35;
import java.util.Scanner;
public class JavaApplication35 {
    public static void main(String[] args) {
      System.out.println("enter a positive number");
    Scanner Scan = new Scanner(System.in);
    int x = Scan.nextInt();
    for (int i = 1 ;i<=x ; i++) {
        for (int j = 1 ;j<=i ; j++){
            System.out.print(j);
        }
         
    
    System.out.println();
    }
}
}
