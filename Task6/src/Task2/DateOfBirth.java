package Task2;

public class DateOfBirth {

    protected int date;

    public void setDate(int date) {
       try {
           if(date < 0 || date > 31)
           {
               throw new MyException(date);
           }
           this.date = date;
           System.out.println("Число вашего рождения " + date);
       } catch (MyException e) {
           System.out.println("Неправильно ввели дату");
           e.checkParam();
       }
    }

    public int getDate()
    {
        return date;
    }
}
