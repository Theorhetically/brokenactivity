package ph.dlsu.mobdeve.s18.de_veyra.ryan.data.model;

public class user {
    private String name = "";
    private int kills = 0;
    private int wins = 0;

    public user(String name, int kills, int wins) {
        this.name = name;
        this.kills = kills;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
