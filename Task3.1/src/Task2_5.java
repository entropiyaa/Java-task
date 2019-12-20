import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        //Найти НОД и НОК двух натуральных чисел a и b
        System.out.println("Введите два натуральных числа");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number2 = in.nextInt();
        int NOD = 1;

        for(int i = 1; i <= Math.min(number,number2); i++)
        {
            if(number % i == 0 && number2 % i == 0)
            {
                NOD = i;
            }
        }
        System.out.println("НОД = " + NOD);

        int NOK = NOD;
        while(!(NOK % number == 0 && NOK % number2 == 0))
        {
            NOK += NOD;
        }
        System.out.println("НОК = " + NOK);
    }
}
