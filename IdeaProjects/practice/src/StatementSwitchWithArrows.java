public class StatementSwitchWithArrows {
    public static void main (String[]args) {
        int line1count = 0;
        int line2count = 0;
        int line3count = 0;

        int productionLine;

        for(int i = 1; i < 10; i++) {
            productionLine = (i % 3) + 1;
            switch (productionLine) {
                case 1 -> {
                    line1count++;
                    System.out.println("Line 1 produced a unit.");
                }
                case 2 -> {
                    line2count++;
                    System.out.println("Line 2 produced a unit.");
                }
                case 3 -> {
                    line3count++;
                    System.out.println("Line 3 produced a unit.");
                }
            }
        }
        System.out.println("Total counts for Line 1, 2 and 3: " + line1count + ", " +line2count + ", " + line3count);
    }
}
