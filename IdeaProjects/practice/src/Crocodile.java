public class Crocodile extends Reptile {
    protected int speed = 20;
    public int getSpeed() {
        return super.speed;
    }
    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed());
    }
}
