import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        String str = "Я люблю JAVA";
        System.out.println(str.matches("h*")); // false (matches смотрит соответствет ли вся строка регулярному выражению,
        System.out.println(str.matches("h+")); // false   у нас ыся строка не совпадает с выражением)
        System.out.println(str.matches("h?")); // false

        Pattern p = Pattern.compile("h*");  // (в строке есть подстрока, которая совпадает с шаблоном.
        Matcher m = p.matcher(str);         // Каждый символ соответствует h*(0 или более раз использования символа h))
        System.out.println(m.find()); // true

        p = Pattern.compile("h+");
        m = p.matcher(str);            // Ничего не соответствует h+(1 или более раз использования символа h))
        System.out.println(m.find()); // false

        p = Pattern.compile("h?");
        m = p.matcher(str);            // Каждый символ соответствует h?(0 или 1 раз использования символа h))
        System.out.println(m.find()); // true
    }
}