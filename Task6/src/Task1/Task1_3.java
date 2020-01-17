package Task1;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {

        int digit = 555;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целочисленный делитель ");

        try {
            int del = scanner.nextInt();
            try {
                int result = digit / del;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль не допускается!!");
            } finally {
                System.out.println("inner finally");
            }
        } catch (Exception e) {
            System.out.println("Введено не целочисленное значение!!");
        } finally {
            System.out.println("outer finally");
        }
    }
}
