import java.util.Random;

public class RandomExample {
    public static void randomExamples() {
        Random random = new Random();
        System.out.println("Random: " + random);

        int myInt = random.nextInt();
        System.out.println("Random int: " + myInt);

        double myDouble = random.nextDouble();
        System.out.println("Random double: " + myDouble);

        float myFloat = random.nextFloat();
        System.out.println("Random float: " + myFloat);

        double gausDouble = random.nextGaussian();
        System.out.println("Random Gaussian double: " + gausDouble);

        long myLong = random.nextLong();
        System.out.println("Random long: " + myLong);

        boolean myBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + myBoolean);
    }

    public static void main (String[] args) {
        randomExamples();
    }
}
