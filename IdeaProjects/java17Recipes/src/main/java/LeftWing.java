public class LeftWing extends Player{
    private int totalSaves;
    public LeftWing() {
        this.setPosition("LEFT");
    }

    public int getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }
}
