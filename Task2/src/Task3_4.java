import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {

        // Создание массива
        int size = 4;
        int[] arr = new int[size];

        System.out.println("Введите " + size + " элементов массива");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }

        //Сортировка слиянием
        sort(arr, 0, arr.length - 1);
        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }

    private static void sort(int[] arr, int  start, int end)
    {
        if (end <= start)
            return;
        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);


        int[] buf = new int[arr.length];
        System.arraycopy(arr, 0, buf, 0, arr.length);

        for (int k = start; k <= end; k++)
            buf[k] = arr[k];

        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {

            if (i > mid) {
                arr[k] = buf[j];
                j++;
            } else if (j > end) {
                arr[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                arr[k] = buf[j];
                j++;
            } else {
                arr[k] = buf[i];
                i++;
            }
        }
    }
}
