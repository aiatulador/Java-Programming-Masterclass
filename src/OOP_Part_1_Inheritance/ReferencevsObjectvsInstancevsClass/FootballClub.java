package OOP_Part_1_Inheritance.ReferencevsObjectvsInstancevsClass;

public class FootballClub {

    private String defender;
    private String midfielder;
    private String forward;
    private String goalkeeper;

    public FootballClub(String goalkeeper,String defender, String midfielder, String forward) {

        this.goalkeeper = goalkeeper;
        this.defender = defender;
        this.midfielder = midfielder;
        this.forward = forward;
    }

    public String getDefender() {
        return defender;
    }

    public String getMidfielder() {
        return midfielder;
    }

    public String getForward() {
        return forward;
    }

    public String getGoalkeeper() {
        return goalkeeper;
    }

    public void setDefender(String defender) {
        this.defender = defender;
    }

    public void setMidfielder(String midfielder) {
        this.midfielder = midfielder;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public void setGoalkeeper(String goalkeeper) {
        this.goalkeeper = goalkeeper;
    }
}
