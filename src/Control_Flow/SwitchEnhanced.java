package Control_Flow;

public class SwitchEnhanced {
    public static void main(String[] args) {
        char alphabet = 'e';

        switch (alphabet) {
            case 'a' -> System.out.println("This is 'a'");
            case 'b' -> System.out.println("This is 'b'");
            case 'c', 'd', 'e', 'f' -> {
                System.out.println("This is 'c' 'd' 'e' 'f'");
                System.out.println("Actually it was " + alphabet);
            }

        }
    System.out.println(getQuarter("SEPTEMBER "));
    }
    public static String getQuarter (String month){
        return switch(month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";

            case "APRIL", "MAY", "JUNE" -> {
                yield "2nd";
            }
            case "JULY", "AUGUST", "SEPTEMBER" -> {
                yield "3rd";
            }
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                yield "4rt";
            }
            default ->{
                yield "Invalid Month";
            }
        };

    }
}
