import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        double[] a = new double[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextDouble();
        }
        Arrays.sort(a);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double average = sum / n;
        System.out.println("Sorted Array: " + Arrays.toString(a));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        keyboard.close();
    }
}

