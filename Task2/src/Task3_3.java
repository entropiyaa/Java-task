import java.util.Scanner;

public class Task3_3 {
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

        // Сортировка с помощью включения
        for(int i = 1; i < size; i++)
        {
            int elem = arr[i];
            while(i > 0 && arr[i - 1] > elem)
            {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = elem;
        }

        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }
}
