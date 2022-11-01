public class Roster {
    public Team createTeam(String teamName, String city) {
        TeamBuilder builder = new HockeyTeamBuilder();
        builder.buildNewTeam(teamName);
        builder.designateTeamCity(city);
        builder.buildPlayerList();
        return builder.getTeam();
    }
}
