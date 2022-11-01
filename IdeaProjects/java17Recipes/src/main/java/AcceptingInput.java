import java.io.*;

public class AcceptingInput {
    public static void main (String[] args) {
        BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));
        String numberAsString = "";
        long numberAsLong = 0;
        boolean numbersIsValid = false;

        do {
            System.out.println("Please enter a number: ");
            try {
                numberAsString = readIn.readLine();
                System.out.println("You entered " + numberAsString);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            try {
                numberAsLong = Long.parseLong(numberAsString);
                numbersIsValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Not a number!");
            }
        } while (numbersIsValid == false);

    }
}
