package Enum;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    public int compare(Country c1, Country c2) {
        if(c1.getArea() == c2.getArea())
        {
            return 0;
        }
        if(c1.getArea() > c2.getArea())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}