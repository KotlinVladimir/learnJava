import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите размер 1 массива: ");
        int size = sc.nextInt();
        int[] arrayFirst = new int[size];
        System.out.println("¬ведите " + size + " чисел: ");
        for (int i = 0; i < size; i++) {
            arrayFirst[i] = sc.nextInt();
        }
        System.out.println("¬ведите размер 2 массива: ");
        int sizeSecond = sc.nextInt();
        int[] arraySecond= new int[sizeSecond];
        System.out.println("¬ведите " + sizeSecond + " чисел: ");
        for (int j = 0; j < sizeSecond; j++) {
            arraySecond[j] = sc.nextInt();
        }
        int[] united;
        united = new int[arrayFirst.length + arraySecond.length];
        System.out.println("—оздаю массив размером суммы длин 2 предыдущих");
        System.out.println(Arrays.toString(united));
        int count = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            united[i] = arrayFirst[i];
            count++;
        }
        System.out.println("ƒобавл€ю элементы из 1 массива");
        System.out.println(Arrays.toString(united));
        for (int j = 0; j < arraySecond.length; j++) {
            united[count] = arraySecond[j];
            count++;
        }
        System.out.println("ƒобавл€ю элементы из 2 массива");
        System.out.println(Arrays.toString(united));
    }
}
