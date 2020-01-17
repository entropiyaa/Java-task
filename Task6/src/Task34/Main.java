package Task34;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];
        System.out.println("Введите " + array.length + " целочисленных элементов массива");

        inputArray(array);

        for(int elem : array)
        {
            System.out.print(elem + " ");
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int elem : array)
        {
            arrayList.add(elem);
        }
        System.out.println();

        Collections.sort(arrayList);

        for(Integer elem : arrayList)
        {
            System.out.print(elem + " ");
        }
    }

    private static void inputArray(int[] array)
    {
        int counterTry = 0;
        int counter = 0;

        for(int j = 0; j < 3; j++)
        {
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < array.length; i++)
            {
                try {
                    array[i] = scanner.nextInt();
                    counterTry++;
                } catch(InputMismatchException e) {
                    System.out.println("Ошибка ввода");
                    counter++;
                    break;
                } finally {
                    if(counterTry == array.length)
                    {
                        System.out.println("Массив заполнен");
                        j = 3;
                    }
                    if(counter == 3)
                    {
                        System.out.println("Попыток больше нет..");
                    }
                }
            }
            counterTry = 0;
        }
    }
}