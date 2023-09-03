package Expressions_Statements;

public class MethodsSecondsAndMinutesChallenge {
    public static void main(String[] args) {
        int seconds = 19600;
        String A =  getDurationString(seconds);
        System.out.println(A);
        System.out.println(getDerurationString(756,57));
    }

    public static String getDurationString (int seconds){

        if(seconds>=0){
            int minutes = seconds / 60;
            int hours = minutes /60;
            int remMinutes = minutes % 60;
            int remSeconds = seconds % 60;
            return hours +" hours "+ remMinutes +" minutes "+ remSeconds+" seconds";
        }
        else return "Time can't be Negative";

    }

    public static String getDerurationString (int minutes , int seconds){
        if(minutes>=0 && seconds >=0 && seconds<=59){
            int hours = minutes /60;
            int remMinutes = minutes % 60;
            return hours + " hours "+ remMinutes + " minutes "+ seconds+ " seconds";
        }
        else return "Time can't be Negative";

    }


}
