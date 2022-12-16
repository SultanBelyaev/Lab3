import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
public class lab3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] newArr = null;
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
            }else { System.out.println("В массив должны вводиться только целые числа!");
                return;
            }
        }
        int z = 0;
        try {
            System.out.println("Число к удалению :");
            z = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == z) {
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                break;
            }
        }
        System.out.println("Исходный массив:" + Arrays.toString(arr));
        System.out.println("Массив после обработки:" + Arrays.toString(newArr));
        in.close();
    }
}