public interface TeamBuilder {
    void buildPlayerList();
    void buildNewTeam(String teamName);
    void designateTeamCity(String city);
    Team getTeam();
}
