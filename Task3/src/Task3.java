//Сравнить две строки: "Мама мыла раму" и ввести эту же строку через консоль.
// При помощи оператора == и получить результаты сравнения true (да это возможно, как?)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String str = "Мама мыла раму"; // та строка находится в String Pool
        Scanner in = new Scanner(System.in);
        String str2 = in.nextLine();  // для этой строки выделяли новую область памяти, она не попадает в String Pool

        System.out.println(str == str2.intern()); // метод intern смотрит, если ли содержимое строки str2 в String Pool,
        // находит, что такой же текст у str, возвращает ссылку на str, таким образом ссылки равны и опретор == даёт true
    }
}

