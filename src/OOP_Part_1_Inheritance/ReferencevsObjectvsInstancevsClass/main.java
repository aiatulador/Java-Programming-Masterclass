package OOP_Part_1_Inheritance.ReferencevsObjectvsInstancevsClass;

public class main {

    public static void main(String[] args) {

        FootballClub realMadrid = new FootballClub("Courtois","Carvajal","Jude", "Vini");

        System.out.println(realMadrid.getGoalkeeper());
        System.out.println(realMadrid.getDefender());
        System.out.println(realMadrid.getMidfielder());
        System.out.println(realMadrid.getForward());
        System.out.println(" ");


        FootballClub uclChampion = realMadrid;

        System.out.println(uclChampion.getGoalkeeper());
        System.out.println(uclChampion.getDefender());
        System.out.println(uclChampion.getMidfielder());
        System.out.println(uclChampion.getForward());
        System.out.println(" ");

        uclChampion.setGoalkeeper("Lunin");
        uclChampion.setDefender("Nacho");
        uclChampion.setMidfielder("Modric");
        uclChampion.setForward("Rodrygo");

        System.out.println(uclChampion.getGoalkeeper());
        System.out.println(uclChampion.getDefender());
        System.out.println(uclChampion.getMidfielder());
        System.out.println(uclChampion.getForward());
        System.out.println(" ");

        System.out.println(realMadrid.getGoalkeeper());
        System.out.println(realMadrid.getDefender());
        System.out.println(realMadrid.getMidfielder());
        System.out.println(realMadrid.getForward());
        System.out.println(" ");


        FootballClub brighton = new FootballClub("Steel","Dunk","Gross","Ferguson");

        System.out.println(brighton.getGoalkeeper());
        System.out.println(brighton.getDefender());
        System.out.println(brighton.getMidfielder());
        System.out.println(brighton.getForward());
        System.out.println(" ");

        System.out.println(uclChampion.getGoalkeeper());
        System.out.println(uclChampion.getDefender());
        System.out.println(uclChampion.getMidfielder());
        System.out.println(uclChampion.getForward());
    }

}
