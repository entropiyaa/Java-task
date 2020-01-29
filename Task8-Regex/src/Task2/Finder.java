package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {

    private String word;

    public void searchByString(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        choiceWord();
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] words = line.split(" +");
            for(String word : words)
            {
                if(word.equals(this.word))
                {
                  count++;
                }
            }
        }
        System.out.println("Слово " + this.word + ". Количество: " + count);
    }

    public void searchByRegex(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        choiceWord();
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] words = line.split(" +");
            for(String word : words)
            {
                Pattern p = choiceRegex(this.word);
                Matcher m = p.matcher(word);
                if(m.find())
                {
                    //System.out.println(word);
                    count++;
                }
            }
        }
        System.out.println("Слово " + this.word + ". Количество: " + count);
    }

    private void choiceWord()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите слово для поиска\n1 - война, 2 - и, 3 - мир");
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
            {
                word = "война";
                break;
            }
            case 2:
            {
                word = "и";
                break;
            }
            case 3:
            {
                word = "мир";
                break;
            }
        }
    }

    private Pattern choiceRegex(String word)
    {
        if(word.equals("война"))
        {
            return Pattern.compile("^[\"(]*([Вв])ойна[.,?!:;)\"]*$");
        } else if(word.equals("и")) {
            return Pattern.compile("^[\"(]*([Ии])[.,?!:;)\"]*$");
        } else {
            return Pattern.compile("^[\"(]*([Мм])ир[.,?!:;)\"]*$");
        }
    }
}