package Expressions_Statements;

import java.util.UUID;

public class MethodChallenge {
    public static void main(String[] args) {
        String playersName = nameGenerate();
        int playersPosition = calculateHighScorePosition(500);
        displayHighScorePosition(playersName,playersPosition);
    }
    public static void displayHighScorePosition(String playersName, int playersPosition){
        System.out.println(playersName +  " managed to get into position " + playersPosition + " on the high score list.");
        return ;

    }

    public static int  calculateHighScorePosition(int playersScore){
        if(playersScore>=1000) {
            return 1;
        }
        else if(playersScore>=500 &&  playersScore<1000){
            return 2;
        }
        else if(playersScore>=100 && playersScore<500){
            return 3;
        }
        else return 4;
    }

    public static String nameGenerate(){
        String name = UUID.randomUUID().toString().substring(0,5);
        return name;
    }




}


