package Task1;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {

        int digit = 555;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целочисленный делитель ");

        try {
            int del = scanner.nextInt();
            try {
                int result = digit / del;
                System.out.println(result);
            } finally {
                System.out.println("Деление на ноль не допускается!!");
            }
        } finally {
            System.out.println("Введено не целочисленное значение!!");
        }
    }
}
