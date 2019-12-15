
// Написать класс в котором будут сожержаться все методы сортировок которые были заданы ранее.
// Начать их использовать в вашем коде.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int size = 5;
        int[] arr = new int[size];

        Scanner in = new Scanner(System.in);
        System.out.println("Введите " + size + " элементов массива");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("Выберите способ сортировки\n1 - выбором, 2 - пузырьковая, 3 - шейкерная, 4 - вставками," +
                " 5 - слиянием, 6 - быстрая");
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:
                sortByChoice(arr);
                break;
            case 2:
                bubbleSort(arr);
                break;
            case 3:
                shakerSort(arr);
                break;
            case 4:
                insertionSort(arr);
                break;
            case 5:
                mergeSort(arr, 0, arr.length - 1);
                break;
            case 6:
                quickSort(arr, 0, arr.length - 1);
                break;
            default:
                System.out.println("Неправильно введено число\nМассив не отсортирован");
        }

        for(int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }

    // Сортировка выбором
    private static void sortByChoice(int[] arr)
    {
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
    }

    // Пузырьковая сортировка
    private static void bubbleSort(int[] arr)
    {
        for(int j = 1; j < arr.length; j++)
        {
            for(int i = 0; i < arr.length - j; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int change = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]  = change;
                }
            }
        }
    }

    // Шейкерная сортировка
    private static void shakerSort(int[] arr)
    {
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
    }

    // Сортировка с помощью включения
    private static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int elem = arr[i];
            while(i > 0 && arr[i - 1] > elem)
            {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = elem;
        }
    }

    //Сортировка слиянием
    private static void mergeSort(int[] arr, int start, int end)
    {
        if (end <= start)
            return;
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);


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

    private static void quickSort(int[] arr, int left, int right)
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
        if (left < j) { quickSort(arr, left, j); }
        if (i < right) { quickSort(arr, i, right); }
    }
    }













