import java.util.ArrayList;
import java.util.List;

public enum StatisticsSingleton {
    INSTANCE;
    private List<String> teams = new ArrayList<>();
    public List<String> getTeams() {
        return teams;
    }
    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public static void main(String[] args) {
        StatisticsSingleton stats = StatisticsSingleton.INSTANCE;
        System.out.println("Adding objects to the list using stats object");
        List<String> myList = stats.getTeams();
        myList.add("One");
        myList.add("Two");
        System.out.println("Reading objects from the list using stats2 object");
        StatisticsSingleton stats2 = StatisticsSingleton.INSTANCE;
        List<String> myList2 = stats2.getTeams();
        for (Object name : myList2) {
            System.out.println(name.toString());
        }
    }
}
