package Expressions_Statements;

public class MethodsSecondsAndMinutesChallenge {
    public static void main(String[] args) {
        int seconds = 19600;
        String A =  getDurationString(seconds);
        System.out.println(A);
        System.out.println(getDerurationString(733,40));
    }

    public static String getDurationString (int seconds){
        int minutes = seconds / 60;
        int hours = minutes /60;
        int remMinutes = minutes % 60;
        int remSeconds = seconds % 60;
        return hours +" hours "+ remMinutes +" minutes "+ remSeconds+" seconds";
    }

    public static String getDerurationString (int minutes , int seconds){
        int hours = minutes /60;
        int remMinutes = minutes % 60;
        return hours + " hours "+ remMinutes + " minutes "+ seconds+ " seconds";
    }


}
