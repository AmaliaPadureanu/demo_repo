import java.util.ArrayList;
import java.util.List;

public class TeamInner {
    private Player player;
    private List<Player> playerList;
    private int size = 4;

    class Player {
        private String firstName;
        private String lastName;
        private String position;
        private int status = -1;
        public Player() {

        }
        public Player(String position, int status) {
            this.position = position;
            this.status = status;
        }

        protected String playerStatus() {
            String returnValue = null;
            switch (getStatus()) {
                case 0: returnValue = "ACTIVE";
                case 1: returnValue = "INACTIVE";
                case 2: returnValue = "INJURY";
                default: returnValue = "ON_BEACH";
            }
            return returnValue;
        }
        public String playerString() {
            return getFirstName() + " " + getLastName() + " - " + getPosition();
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
            }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public  int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String toString() {
            return this.firstName + " " + this.lastName + " - " + this.position + ": " + this.playerStatus();
        }
    }

    public TeamInner() {
        final int ACTIVE = 0;
        playerList = new ArrayList<>();
        playerList.add(constructPlayer("Josh", "Juneau", "Right Wing", ACTIVE));
        playerList.add(constructPlayer("Joe", "Blow", "Left Wing", ACTIVE));
        playerList.add(constructPlayer("John", "Smith", "Center", ACTIVE));
        playerList.add(constructPlayer("Bob", "Coder", "Defense", ACTIVE));
        playerList.add(constructPlayer("Jonathan", "Gennick", "Goalie", ACTIVE));
    }

    public Player constructPlayer(String first,String last, String position, int status) {
        Player player = new Player();
        player.firstName = first;
        player.lastName = last;
        player.position = position;
        player.status = status;
        return player;
    }

    public List<Player> getPlayerList() {
        return this.playerList;
    }

    public static void main (String[] args) {
        TeamInner inner = new TeamInner();
        System.out.println("Team Roaster");
        System.out.println("===========");
        for (Player player:inner.getPlayerList()) {
            System.out.println(player.playerString());
        }
    }
}
