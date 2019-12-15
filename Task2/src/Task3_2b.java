import java.util.Scanner;

public class Task3_2b {
    public static void main(String[] args) {

        // Создание массива
        int size = 5;
        int[] arr = new int[size];

        System.out.println("Введите " + arr.length + " элементов массива");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        // Шейкерная сортировка
        for(int j = 1; j < arr.length; j++)
        {
            for(int i = 0; i < arr.length - j; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int change = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = change;
                }
            }
            for(int i = arr.length - j - 1; i > j - 1; i--)
            {
                if(arr[i] < arr[i-1])
                {
                    int change = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = change;
                }
            }
        }

        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }
}
