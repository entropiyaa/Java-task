import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        // Вывести все элементы в консоль при помощи do....while, while, for, foreach.
        // Элементы массива вводить через консоль. Массив хранит в себе числа.

        int size = 5;
        int[] arr = new int[size];

        System.out.println("Введите " + size + " элементов массива");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }

        // вывод через do....while
        int i = 0;
        do {

            System.out.print(arr[i] + " ");
            i++;

        } while(i < size);

        //вывод через while
        i = 0;
        System.out.println();
        while(i < size)
        {
            System.out.print(arr[i] + " ");
            i++;
        }

        // вывод через for
        System.out.println();
        for( i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // вывод через foreach
        System.out.println();
        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }
}
