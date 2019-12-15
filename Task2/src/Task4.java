import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Написать код который будет получать значения элементов массива из консоли.
        // Далее массив нужно отсортировать любым способом из прошлого задания.
        // В случае нахождения одинаковых элементов массива дубликат требуется удалить

        // Создание массива
        int size = 5;
        int[] arr = new int[size];

        System.out.println("Введите " + arr.length + " элементов массива");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        // Сортировка выбором
        for(int j = 0; j < arr.length; j++)
        {
            for(int i = j; i < arr.length; i++)
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
        System.out.println();

        int count = 1;

        for(int i = 0; i < arr.length - 1; i++) // считаем значения, которые не повторяются
        {
            if(arr[i] != arr[i + 1])
            {
                count++;
            }
        }

        int[] arr2 = new int[count]; // создаём новый массив
        arr2[0] = arr[0];

        for(int i = 1, j = 1; i < arr.length; i++) // записываем в него неповторяющиеся значения
        {
            if(arr[i] != arr[i - 1])
            {
                arr2[j] = arr[i];
                j++;
            }
        }

        for(int elem : arr2)
        {
            System.out.print(elem + " ");
        }
    }
}
