package Back;

public class User {
    public String ismi;
    public int rate;
    public BBVA_Teams team;
    public String pozzition;
    public int narxi;

    public User(String ismi, int rate, BBVA_Teams team, String pos,int narx) {
        this.ismi = ismi;
        this.rate = rate;
        this.team = team;
        this.narxi = narx;

    }

    @Override
    public String toString() {
        return ismi;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public BBVA_Teams getTeam() {
        return team;
    }

    public void setTeam(BBVA_Teams team) {
        this.team = team;
    }

    public String getPozzition() {
        return pozzition;
    }

    public void setPozzition(String pozzition) {
        this.pozzition = pozzition;
    }

    public int getNarxi() {
        return narxi;
    }

    public void setNarxi(int narxi) {
        this.narxi = narxi;
    }
}
