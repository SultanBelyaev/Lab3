import java.util.InputMismatchException;
import java.util.Scanner;
public class lab3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 0;
        try {
            System.out.println("Размерность массива:");
            N = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        if (N > 0) {
        } else {
            System.out.println("Размерность не может быть равна 0 или быть отрицательной.");
            return;
        }
        int[] arr = new int[N];
        System.out.println("Массив :");
        for (int i = 0; i < arr.length; i++) {
            if (in.hasNextInt()) {
                arr[i] = in.nextInt();
            } else {
                System.out.println("В массив должны вводиться только целые числа!");
                return;
            }
        }
        if (arr[0] < arr[1]) {
            System.out.print(arr[0] + " ");
        } else {
            System.out.print(arr[0]);
        }
        int previousElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > previousElement) {
                System.out.print(arr[i] + " ");
                previousElement = arr[i];
            }
        }
        in.close();
    }
}