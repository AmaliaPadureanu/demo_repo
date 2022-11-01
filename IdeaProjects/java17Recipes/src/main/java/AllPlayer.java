public class AllPlayer extends Player {
    private int totalSaves;
    public AllPlayer() {
        this.setPosition("ALL");
    }

    public int getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }
}
