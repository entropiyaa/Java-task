import Builder.Builder;
import Builder.ComputerBuilder1;
import Builder.ComputerBuilder2;
import Builder.Director;

public class Main2 {
    public static void main(String[] args) {

        Builder builder1 = new ComputerBuilder1();
        Director director = new Director();
        director.setBuilder(builder1);
        director.buildComputer();
        builder1.getComputer().start();

        Builder builder2 = new ComputerBuilder2();
        director.setBuilder(builder2);
        director.buildComputer();
        builder2.getComputer().start();
    }
}
