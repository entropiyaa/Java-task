import java.io.Serializable;

public class Student implements Serializable {

    private String FIO;
    private int mark;
    private static final long serialVersionUID = 1L;

    public Student()
    {
        this.FIO = generateName();
        this.mark = (int)(Math.random()*10 + 1);
    }

    public String getFIO() {
        return FIO;
    }

    public int getMark() {
        return mark;
    }

    private String generateName()
    {
        String symbolsName = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randName = new StringBuilder();
        for(int j = 0; j < 3; j++)
        {
            int count = (int) (Math.random() * 10) + 1;
            for(int i = 0; i < count; i++)
            {
                randName.append(symbolsName.charAt((int)(Math.random()*symbolsName.length())));
            }
            if(j == 2) continue;
            randName.append(" ");
        }
        return randName.toString();
    }

    @Override
    public String toString() {
        return "Student{" +
                "FIO ='" + FIO + '\'' +
                ", mark = " + mark +
                '}';
    }
}