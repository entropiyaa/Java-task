import java.util.Scanner;

public class Task3_5 {
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

        QuickSort(arr, 0, arr.length - 1);

        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }

    // быстрая сортировка
    private static void QuickSort(int[] arr, int left, int right)
    {
        int i = left, j = right;
        int mid = arr[(left + right) / 2];
        do
        {
            while (arr[i] < mid) i++;
            while (arr[j] > mid) j--;
            if (i <= j)
            {
                int change = arr[i];
                arr[i] = arr[j];
                arr[j] = change;
                i++; j--;
            }
        } while (i < j);
        if (left < j) { QuickSort(arr, left, j); }
        if (i < right) { QuickSort(arr, i, right); }
    }
}
