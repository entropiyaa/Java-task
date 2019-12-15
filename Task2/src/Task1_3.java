public class Task1_3 {
    public static void main(String[] args) {

        // Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой

        int number = Integer.parseInt(args[0]);
        int result = 1;

        System.out.println(number);

        while(number > 0)
        {
            int digit = number % 10;
            number /= 10;
            result *= digit;
        }
        System.out.println(result);
    }
}
