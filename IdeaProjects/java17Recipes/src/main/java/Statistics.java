import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Statistics implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Statistics INSTANCE = new Statistics();
    private List<String> teams = new ArrayList<>();
    private Statistics() {}
    public static Statistics getInstance() {
        return INSTANCE;
    }
    public List<String> getTeams() {
        return teams;
    }
    public void setTeams(List<String> teams) {
        this.teams = teams;
    }
}
