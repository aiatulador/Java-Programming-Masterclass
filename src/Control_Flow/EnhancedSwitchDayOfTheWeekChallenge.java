package Control_Flow;

public class EnhancedSwitchDayOfTheWeekChallenge {
    public static void main(String[] args) {

        printDayOftheWeek(1);
        printDayOftheWeek(2);
        printDayOftheWeek(3);
        printDayOftheWeek(4);
        printDayOftheWeek(5);
        printDayOftheWeek(6);
        printDayOftheWeek(7);
        printDayOftheWeek(8);
        printDayOftheWeek(9);
        printDayOftheWeek(156);
        printDayOftheWeek(5);




    }
    public static void printDayOftheWeek(int day){

        switch (day){
          case 1 -> System.out.println("Saturday");
          case 2 -> System.out.println("Sunday");
          case 3 -> System.out.println("Monday");
          case 4 -> System.out.println("Tuesday");
          case 5 -> System.out.println("Wednesday");
          case 6 -> System.out.println("Thursday");
          case 7 -> System.out.println("Friday");
          case 8 -> System.out.println("Red Friday");

          default -> System.out.println("Invalid Day");
        };
    }
}
