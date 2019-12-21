import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        //Проверить, является ли заданное натуральное число палиндромом(без массива)
        System.out.println("Введите натуральное число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int num = number;
        int digit, digit2, count = 0;

        while(number > 0)
        {
            number /= 10;
            count++;
        }

        int right = count;
        int left = 0;
        int c = count - 1;

        while(left < right)
        {
            digit = num % 10;
            digit2 = (int) (Math.floor(num / Math.pow(10, c))) % 10;
            System.out.println(digit + " " + digit2);
            if (digit == digit2)
            {
                num /= 10;
                left++;
                right--;
                c -= 2;
            }
            else
            {
                System.out.println("Число не является палиндромом");
                break;
            }
        }
        if(left >= right)
        {
            System.out.println("Число является палиндромом");
        }
    }
}
