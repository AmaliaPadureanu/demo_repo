public class CityTZDemo {
    enum TZ {Eastern, Central, Mountain, Pacific, Other}

    public static void main(String[] args) {
        String[] cities = {
                "New York", "Boston", "Miami", "Chicago", "St. Louis",
                "Des Moines", "Denver", "Albuquerque", "Seattle",
                "San Francisco", "Los Angeles", "Portland", "Honolulu"
        };

        for (String city : cities) {
            TZ zone = switch (city) {
                case "New York", "Boston", "Miami" -> TZ.Eastern;
                case "Chicago", "St. Louis", "Des Moines" -> TZ.Central;
                case "Denver", "Albuquerque" -> TZ.Mountain;
                case "Seattle", "San Francisco", "Los Angeles", "Portland" -> TZ.Pacific;
                default -> TZ.Other;
            };
            if(zone == TZ.Other)
                System.out.println(city + " is outside the Continental US");
            else
                System.out.println(city + " is in the " + zone + " time zone");
        }
    }

}
