package Enum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Сравниваем результат valueOf и элемент enum
        Country c1 = Country.valueOf("BELARUS");
        if(c1 == Country.BELARUS)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
       // Country c2 = Country.valueOf("JAPAN");      Exception in thread "main" java.lang.IllegalArgumentException:
                                                      // No enum constant Enum.Country.JAPAN
        // своя функция сравнения двух стран
        Country.ENGLAND.compareTwoCountry(Country.ESTONIA);

        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(c1);
        countries.add(Country.SPAIN);
        countries.add(Country.UKRAINE);
        countries.add(Country.GREECE);
        countries.add(Country.CHINA);
        countries.add(Country.LATVIA);
        countries.add(Country.RUSSIA);
        countries.add(Country.NORWAY);

        // элементы ArrayList до сортировки
        for(Country c : countries)
        {
            System.out.println(c);
        }

        CountryComparator myComparator = new CountryComparator();
        countries.sort(myComparator);
        System.out.println();

        // элементы ArrayList до сортировки через компаратор
        for(Country c : countries)
        {
            System.out.println(c);
        }
    }
}
