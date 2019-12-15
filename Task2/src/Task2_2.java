import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {

        // Вывести каждый второй элемент массива

        int size = 5;
        int[] arr = new int[size];

        System.out.println("Введите " + size + " элементов массива");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }

        for(int i = 1; i < size; i += 2)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
