//Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), которая бы «подбрасывала» условно монету,
// к примеру, 1000 раз и сообщала, сколько раз выпал орёл, а сколько – решка.
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), которая бы «подбрасывала» условно монету,
        // к примеру, 1000 раз и сообщала, сколько раз выпал орёл, а сколько – решка.
	    boolean coin = false;
	    int tails = 0;
	    int n = 1000;
        Random random = new Random();
	    for(int i = 0; i < n; i++)
        {
            coin = random.nextBoolean();
            if(coin)
            {
                tails++;
            }
        }
	    System.out.println("Решка выпала " + tails + " раз");
	    System.out.println("Орёл выпал " + (n - tails) + " раз");
        }
}
