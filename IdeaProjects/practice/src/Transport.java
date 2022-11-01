public enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT;
}

class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;

        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN) {
            System.out.println("tp contains TRAIN.\n");
        }

        switch (tp) {
            case CAR:
                System.out.println("A car carries people");
                break;
            case TRUCK:
                System.out.println("A truck carries freight.");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;

        }
    }
}

class EnumDemo2{
        public static void main(String[]args) {
            Transport tp;
            System.out.println("Here are all transport constants");
            for(Transport t : Transport.values()) {
                System.out.println(t);
            }
            System.out.println();

            tp = Transport.valueOf("AIRPLANE");
            System.out.println("tp contains " + tp);
        }
}

class EnumDemo4 {
    public static void main(String[]args) {
        Transport tp, tp2, tp3;

        System.out.println("Here are all Transport constants and their ordinal values: ");

        for (Transport t :Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        System.out.println();

        if (tp.compareTo(tp2) < 0) {
            System.out.println(tp + " comes before " + tp2);
        }
        if (tp.compareTo(tp3) == 0) {
            System.out.println(tp + " equals " + tp3);
        }

        if (tp.compareTo(tp2) > 0) {
            System.out.println(tp2 + " comes before " + tp);
        }
    }
}

