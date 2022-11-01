import java.util.Arrays;

public class Player implements PlayerType {
    private String firstName;
    private String lastName;
    private String position;
    private int status = -1;
    private int goals;
    public Player() {

    }
    public Player(String position, int status) {
        this.position = position;
        this.status = status;
    }

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Player(String firstName, String lastName, int nr) {
    }

    public String findPlayerStatus(int status) {
        String returnValue = switch (status) {
            case 0 -> "ACTIVE";
            case 1 -> "INACTIVE";
            case 2 -> "INJURY";
            default -> "ON_BEACH";
        };
        return returnValue;
    }
    public String playerString() {
        return getFirstName() + " " + getLastName() + " - " + getPosition();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 30) {
            this.firstName = firstName.substring(0, 29);
        } else {
            this.firstName = firstName;
        }
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

    public void setGoals(int goals) { this.goals = goals; }

    public int getGoals() { return goals; }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static int compareByGoal(Player a, Player b) {
        int eval;
        if (a.getGoals() > b.getGoals()) {
            eval = 1;
        } else if (a.getGoals() < b.getGoals()) {
            eval = -1;
        } else {
            eval = 0;
        }
        return eval;
    }

    public static void main(String[] args) {
        Player[] teamArray = new Player[3];
        Arrays.sort(teamArray, Player::compareByGoal);

    }
}
