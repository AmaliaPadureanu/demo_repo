public class Center extends Player {
    private int totalSaves;
    public Center() {
        this.setPosition("CENTER");
    }

    public int getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }
}
