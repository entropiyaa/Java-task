package Task1;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        long start, finish;
        List<Passport> arrayList = new ArrayList<>();

        start = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++)
        {
            arrayList.add(generatePassport());
        }
        finish =  System.currentTimeMillis();
        System.out.println("Time to add elements to the ArrayList = " + (finish - start));

        start = System.currentTimeMillis();
        // удаление с первого элемента
//        for(int i = 0; i < arrayList.size(); i++)
//        {
//            arrayList.remove(i);
//        }

        //удаление с последнего элемента
        for(int i = arrayList.size() - 1; i >= 0; i--)
        {
            arrayList.remove(i);
        }
        // удаление с помощью итератора
//        Iterator<Passport> iterator = arrayList.iterator();
//        while (iterator.hasNext())
//        {
//            iterator.next();
//            iterator.remove();
//        }
        finish = System.currentTimeMillis();
        System.out.println("Time to remove elements = " + (finish - start));





        List<Passport> linkedList = new LinkedList<>();

        start = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++)
        {
            linkedList.add(generatePassport());
        }
        finish = System.currentTimeMillis();
        System.out.println("Time to add elements to the LinkedList = " + (finish - start));

        start = System.currentTimeMillis();
        // удаление с первого элемента
//        for(int i = 0; i < linkedList.size(); i++)
//        {
//            linkedList.remove(i);
//        }

        // удаление с последнего элемента
//        for(int i = linkedList.size() - 1; i >= 0; i--)
//        {
//            linkedList.remove(i);
//        }

        // удаление с помощью итератора
        Iterator<Passport> iterator1 = linkedList.iterator();
        while (iterator1.hasNext())
        {
            iterator1.next();
            iterator1.remove();
        }
        finish = System.currentTimeMillis();

        System.out.println("Time to remove elements = " + (finish - start));
    }
    private static Passport generatePassport() {
        String symbolsId = "qwertyuiopasdfghjklzxcvbnm1234567890";
        StringBuilder randId = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            randId.append(symbolsId.charAt((int)(Math.random()*symbolsId.length())));
        }

        String symbolsName = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randName = new StringBuilder();
        int count = (int) (Math.random() * 10) + 1;
        for(int i = 0; i < count; i++)
        {
            randName.append(symbolsName.charAt((int)(Math.random()*symbolsName.length())));
        }

        Passport passport = new Passport();
        passport.setId(randId.toString());
        passport.setEffectiveAt(new Date());
        passport.setFio(randName.toString());

        return passport;
    }
}