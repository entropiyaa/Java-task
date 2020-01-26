package Task2;

import Task1.Passport;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        Passport passport1 = new Passport("MC109", new Date(), "Tanya");
        Passport passport2 = new Passport("MC151", new Date(), "Masha");

        List<Passport> arrayList = new ArrayList<>();
        arrayList.add(passport1);
        arrayList.add(passport2);
        System.out.println("Размер списка до удаления " + arrayList.size());

        Iterator<Passport> iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            iterator.next();
            iterator.remove();
        }

        System.out.println("Размер списка после удаления " + arrayList.size());
    }
}