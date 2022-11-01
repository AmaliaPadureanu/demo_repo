public class RightWing extends Player {
    private int totalSaves;
    public RightWing() {
        this.setPosition("RIGHT");
    }

    public int getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }
}
