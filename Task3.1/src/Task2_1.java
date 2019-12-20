import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        //Найти наибольшую цифру натурального числа
        System.out.println("Введите натуральное число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int digit, maxDigit = 0;

        while(number > 0)
        {
            digit = number % 10;
            number /= 10;
            if(digit > maxDigit)
            {
                maxDigit = digit;
            }
        }
        System.out.println("Самая большая цифра числа = " + maxDigit);
    }
}
