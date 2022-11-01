import java.util.random.RandomGenerator;
import java.util.Random;

public class UseNewPRNGs implements RandomGenerator{
    static UseNewPRNGs testGen = new UseNewPRNGs();
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println(testGen.nextBoolean());
            System.out.println(testGen.nextDouble());
            System.out.println(testGen.nextInt());
            System.out.println(testGen.nextLong());
        }
    }

    @Override
    public long nextLong() {
        Random r = new Random();
        return  r.nextLong();
    }

}
