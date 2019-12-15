public class Task1_2 {
    public static void main(String[] args) {

        // Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе

        int firstArg = Integer.parseInt(args[0]);
        long result = 1;

        for(int i = 1; i <= firstArg; i++)
        {
            result *= i;
        }
        System.out.println(result);
    }
}
