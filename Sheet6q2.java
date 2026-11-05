package sheet6q2;
import java.util.Scanner;

class Location {
    private double maxValue;
    private int column;
    public Location() {
        this.maxValue = 0.0;
        this.column = 0;
    }
    public void locateLargest(double[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        maxValue = values[0];
        column = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                column = i;
            }
        }
    }
    public double getMaxValue() {
        return maxValue;
    }

    public int getColumn() {
        return column;
    }
}
public class Sheet6q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of columns in the array: ");
        int cols = scanner.nextInt();
        double[] values = new double[cols];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < cols; i++) {
            values[i] = scanner.nextDouble();
        }
        Location location = new Location();
        location.locateLargest(values);
        System.out.println("The location of the largest element is " + 
                           location.getMaxValue() + " at position (" + 
                           location.getColumn() + ")");

        scanner.close();
    }
}
