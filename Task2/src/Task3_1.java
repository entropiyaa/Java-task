import java.util.Scanner;

public class Task3_1 {
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

        // Сортировка выбором
        for(int j = 0; j < size; j++)
        {
            for(int i = j; i < size; i++)
            {
                int min = arr[j];
                if (arr[i] < min)
                {
                    int change = arr[i];
                    arr[i] = min;
                    arr[j] = change;
                }
            }
        }

        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }
}
