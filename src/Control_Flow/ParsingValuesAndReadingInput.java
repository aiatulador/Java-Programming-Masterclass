package Control_Flow;
import java.time.Year;
import java.util.*;

public class ParsingValuesAndReadingInput {
    public static void main(String[] args) {


        try {
            System.out.println(getAgeByConsole());
        }catch (NullPointerException e){
            System.out.println(getAgeByScanner());
        }

    }

    public static String getAgeByConsole(){
        String currentYear = String.valueOf(Year.now().getValue());

        String name = System.console().readLine("Hey Gentlemen What's your name? ");

        String dateOfBirthYear = System.console().readLine("Okay " + name + ", What year were you born? ");

        int age = Integer.parseInt(currentYear) - Integer.parseInt(dateOfBirthYear);

        return "So " + name + ", you are " + age +" years old.";
    }

    public static String getAgeByScanner(){
        int currentYear = Year.now().getValue();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey Gentlemen What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Okay " + name + ", What year were you born? ");
        String dateOfBirthYear = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirthYear);

        return "So " + name + ", you are " + age +" years old.";
    }


}