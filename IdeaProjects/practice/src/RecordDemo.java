public class RecordDemo {
    public static void main(String[] args) {
        Item[] items = new Item[4];

        items[0] = new Item("Hammer", 257, 10.99);
        items[1] = new Item("Wrench", 18, 19.99);
        items[2] = new Item("Drill", 903, "22.25");
        items[3] = new Item("Saw", 27, "34.59");

        for(Item i : items) {
            System.out.println(i.name() + ", Item Number " + i.itemNum() + ", " + "Price: " + i.price());
        }
    }
}
