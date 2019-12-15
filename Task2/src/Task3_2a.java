import java.util.Scanner;

public class Task3_2a {
    public static void main(String[] args) {

        // Создание массива
        int size = 5;
        int[] arr = new int[size];

        System.out.println("Введите " + size + " элементов массива");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }

        // Пузырьковая сортировка
        for(int j = 1; j < size; j++)
        {
            for(int i = 0; i < size - j; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int change = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]  = change;
                }
            }
        }

        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }
}
