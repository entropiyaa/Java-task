package Task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean value = random.nextBoolean();
        try {
            func(value);
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        } catch (Error e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        try {
            func(value);
        } catch (Exception | Error e) {
            if(e.getClass() == Exception.class)
            {
                System.out.println("Exception");
            }
            else
            {
                System.out.println("Error");
            }
            e.printStackTrace();
        }
    }

    private static void func(boolean value) throws Exception {
        if(value)
        {
            throw new Exception();
        }
        else
        {
            throw new Error();
        }
    }
}