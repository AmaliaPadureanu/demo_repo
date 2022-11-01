import java.io.*;
import java.util.List;

public class Team implements TeamType, Cloneable, Serializable {
    private List<Player> players;
    private String name;
    private String city;
    private int wins;
    private int losses;
    private int ties;
    private volatile int cachedHashCode = 0;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFullName() {
        return this.name + " " + this.city;
    }

    /*public Team clone() {
        Team obj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            obj = (Team) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
        return obj;
    }

    public Team shallowCopyClone() {
        try {
            return (Team) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj instanceof Team) {
            Team other = (Team) obj;
            return other.getName().equals(this.getName()) && other.getCity().equals(this.getCity());
        } else {
            return false;
        }
    }*/

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof  Team) {
            Team other = (Team) obj;
            return other.getName().equals(this.getName())
                    && other.getCity().equals(this.getCity())
                    && other.getPlayers().equals(this.getPlayers());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = cachedHashCode;
        if (hashCode == 0) {
            String concatStrings = name + city;
            if (players.size() > 0) {
                for (Player player : players) {
                    concatStrings = concatStrings
                            + player.getFirstName()
                            + player.getLastName()
                            + player.getPosition()
                            + String.valueOf(player.getStatus());
                }
            }
            hashCode = concatStrings.hashCode();
        }
        return hashCode;
    }
    public static void main (String[] args) {
        /*Team team1 = new Team();
        Team team2 = new Team();
        team1.setCity("Boston");
        team1.setName("Bandits");
        team2.setCity("Cicago");
        team2.setName("Wildcats");
        Team team3 = team1;
        Team team4 = team2.clone();
        Team team5 = team1.shallowCopyClone();
        System.out.println("Team 3:");
        System.out.println(team3.getCity());
        System.out.println(team3.getName());
        System.out.println("Team 4:");
        System.out.println(team4.getCity());
        System.out.println(team4.getName());
        team1.setCity("St. Louis");
        team2.setCity("Orlando");
        System.out.println("Team 3:");
        System.out.println(team3.getCity());
        System.out.println(team3.getName());
        System.out.println("Team 4:");
        System.out.println(team4.getCity());
        System.out.println(team4.getName());
        System.out.println("Team 5:");
        System.out.println(team3.getCity());
        System.out.println(team3.getName());

        if (team1 == team3) {
            System.out.println("team1 and team3 are equal");
        } else {
            System.out.println("team1 and team3 are not equal");
        }
        if (team1 == team5) {
            System.out.println("team1 and team5 are equal");
        } else {
            System.out.println("team1 and team5 are not equal");
        }

        Team team1 = new Team();
        Team team2 = new Team();
        team1.setName("Jokers");
        team1.setCity("Crazyville");
        team2.setName("Jokers");
        team2.setCity("Crazyville");

        if (team1 == team2) {
            System.out.println("These object references refer to the same object");
        } else {
            System.out.println("These object references do NOT refer to the same object");
        }

        Team team3 = team1;
        Team team4 = team1;
        if (team3 == team4) {
            System.out.println("These object references refer to the same object");
        } else {
            System.out.println("These object references do NOT refer to the same object");
        }*/


        }

    }


