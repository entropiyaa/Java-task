import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        //Найти количество различных цифр у заданного натурального числа(без массива)
        System.out.println("Введите натуральное число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int num = number;
        int num2 = number;
        int digit, digit2, count = 0;

        while(number > 0)
        {
            number /= 10;
            count++;
        }
        System.out.println(count);

        int n2 = count, n;

        for(int i = n2; i > 0; i--)
        {
           digit = num2 % 10;
           n = i - 1;
           while(n > 0)
           {
               digit2 = (num / 10) % 10;
               if(digit == digit2)
               {
                   count--;
               }
               num /= 10;
               n--;
           }
           num2 /= 10;
           num = num2;
        }
        System.out.println(count);
    }
}
