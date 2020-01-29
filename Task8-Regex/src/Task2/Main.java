package Task2;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Таня\\Downloads\\Война и мир.txt");
        Finder finder = new Finder();
        finder.searchByString(file);
        finder.searchByRegex(file);
    }
}
