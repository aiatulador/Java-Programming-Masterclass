package Expressions_Statements;

public class MethodOverloading {

    public static void main(String[] args) {
        // For Overloaded Method 1
        int newScore = calculateScore("Solly March", 500);
        System.out.println("New score is "+ newScore);

        //For Overloaded Method 2
        newScore = calculateScore(500, "Solly March");
        System.out.println("New score is "+ newScore);

        //For Overloaded Method 3
        newScore = calculateScore(500,"Solly March", 12300);
        System.out.println("New score is " + newScore);

        //For Overloading Method 4
        newScore = calculateScore();
        System.out.println("New score is " + newScore);

        //For Overloading Method 5
        calculatescore();
        // newScore = calculatescore();



    }

    //Overloaded Method 1

    public static int calculateScore(String playerName, int score){
        System.out.println(" 1. Player " + playerName + " scored " + score + " points");
        return score * 100;

    }

    //Overloaded Method 2
    public static int calculateScore(int score, String playerName){
        System.out.println(" 2. Player " + playerName + " scored " + score + " points");
        return score * 100;

    }

    //Overloaded Method 3
    public static int calculateScore(int score, String playerName, int gems){
        System.out.println(" 3. Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    //Overloaded Method 4

    public static int calculateScore(){
        String playerName = "Solly March"; int score = 500;
        System.out.println(" 4. Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    //Overloading Method 5
    public static void calculatescore(){
        String playerName = "Solly March"; int score = 500;
        System.out.println(" 5. Player " + playerName + " scored " + score + " points");
        System.out.println(" Void Method");
    }
}

