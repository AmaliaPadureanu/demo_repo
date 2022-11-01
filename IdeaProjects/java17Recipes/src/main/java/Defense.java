public class Defense extends Player {
    private int totalSaves;
    public Defense() {
        this.setPosition("DEFENSE");
    }

    public int getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }
}
