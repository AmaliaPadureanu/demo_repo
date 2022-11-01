public record Item(String name, int itemNum, double price) {
    public Item {
        name = name.trim();
    }

    static double pricePending = -1;

    public Item(String name, int itemNum,String price) {
        this(name, itemNum, Double.parseDouble(price));
    }

    double discountPrice(double percentage) {
        return price - (price * percentage / 100.0);
    }
}
