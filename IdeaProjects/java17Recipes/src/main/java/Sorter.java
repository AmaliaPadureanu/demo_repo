import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Sorter {
    static List<Player> team;

    public static void loadTeam() {
        System.out.println("Loading team...");
        team = new ArrayList<>();
        Player player1 = new Player();
        player1.setFirstName("Josh");
        player1.setLastName("Juneau");
        player1.setGoals(5);
        Player player2 = new Player();
        player2.setFirstName("Duke");
        player2.setLastName("Java");
        player2.setGoals(15);
        Player player3 = new Player();
        player3.setFirstName("Jonathan");
        player3.setLastName("Gennick");
        player3.setGoals(1);
        Player player4 = new Player();
        player4.setFirstName("Bob");
        player4.setLastName("Smith");
        player4.setGoals(18);
        Player player5 = new Player();
        player5.setFirstName("Steve");
        player5.setLastName("Adams");
        player5.setGoals(7);
        team.add(player1);
        team.add(player2);
        team.add(player3);
        team.add(player4);
        team.add(player5);
    }

    public static void main(String[] args) {
        loadTeam();
        Comparator<Player> byGoals = Comparator.comparing(Player::getGoals);
        team.stream().sorted(byGoals).map(p -> p.getFirstName() + " " +
                p.getLastName() + " " + p.getGoals()).forEach(element -> System.out.println(element));

        Collections.sort(team, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        team.stream().forEach((p) -> {
            System.out.println(p.getLastName());
        });

    }
}
