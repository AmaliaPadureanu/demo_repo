import java.util.ArrayList;
import java.util.List;

public class HockeyTeamBuilder implements TeamBuilder {
    private Team team;

    public HockeyTeamBuilder() {
        this.team = new Team();
    }

    public void buildPlayerList() {
        List players = new ArrayList();
        for (int x = 0; x <= 10; x++) {
            players.add(PlayerFactory.createPlayer("RIGHT"));
        }
        team.setPlayers(players);
    }

    public void buildNewTeam(String teamName) {
        team.setName(teamName);
    }

    public void designateTeamCity(String city) {
        team.setCity(city);
    }

    public Team getTeam() {
        return this.team;
    }
}
