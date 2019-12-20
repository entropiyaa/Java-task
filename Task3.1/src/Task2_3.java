import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        //Определить является ли заданное натуральное число простым
        System.out.println("Введите натуральное число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;

        for(int i = 1; i <= number; i++)
        {
            if(number % i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Простое число");
        }
        else
        {
            System.out.println("Число не является простым");
        }
    }
}
