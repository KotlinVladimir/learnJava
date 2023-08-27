import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1 array:");
        int size = sc.nextInt();
        int[] arrayFirst = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arrayFirst[i] = sc.nextInt();
        }
        System.out.println("Enter the size of 2 array:");
        int sizeSecond = sc.nextInt();
        int[] arraySecond= new int[sizeSecond];
        System.out.println("Enter " + sizeSecond + " numbers:");
        for (int j = 0; j < sizeSecond; j++) {
            arraySecond[j] = sc.nextInt();
        }
        int[] united;
        united = new int[arrayFirst.length + arraySecond.length];
        System.out.println("Creating an array with the size of the sum of the lengths of the previous 2");
        System.out.println(Arrays.toString(united));
        int count = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            united[i] = arrayFirst[i];
            count++;
        }
        System.out.println("Adding elements from 1 array");
        System.out.println(Arrays.toString(united));
        for (int j = 0; j < arraySecond.length; j++) {
            united[count] = arraySecond[j];
            count++;
        }
        System.out.println("Adding elements from 2 array");
        System.out.println(Arrays.toString(united));
    }
}
