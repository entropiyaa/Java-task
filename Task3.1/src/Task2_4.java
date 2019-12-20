import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        //Найти все простые делители заданного натурального числа
        System.out.println("Введите натуральное число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number == 0 || number == 1)
        {
            System.out.println("Нет простых делителей");
        }

        int del = 1, count = 0;
        for(int i = 2; i <= number; i++)
        {
            if(number % i == 0)
            {
                del = i;
                for(int j = 1; j <= del; j++)
                {
                    if(del % j == 0)
                    {
                        count++;
                    }
                }
            }
            if(count == 2)
            {
                System.out.println("Простой делитель " + del);
            }
            count = 0;
        }
    }
}
