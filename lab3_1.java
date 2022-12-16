import java.util.InputMismatchException;
import java.util.Scanner;
public class lab3_1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int N = 0;
        try {
            System.out.println("Размерность массива:");
            N = a.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        if (N > 0) {
        } else {
            System.out.println("Размерность не может быть равна 0 или быть отрицательной.");
            return;
        }
        double[] arr = new double[N];
        System.out.println("Массив :");
        for (int i = 0; i < arr.length; i++) {
            if (a.hasNextDouble()) {
                arr[i] = a.nextDouble();
            }else { System.out.println("В массив должны вводиться только целые числа!");
                return;
            }
        }double sum = 0.0;
        for (int q = 0; q < arr.length; q++) {
            sum += arr[q];
            arr[q] = sum / (q + 1);
            System.out.println(arr[q] + " ");
        }a.close();
    }
}