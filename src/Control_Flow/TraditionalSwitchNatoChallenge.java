package Control_Flow;

public class TraditionalSwitchNatoChallenge {
    public static void main(String[] args) {
        System.out.println("Alphabet must be in CAPITAL LETTER:");
        char alphabet = 'A';
        System.out.println(getNatoMessage(alphabet));
        System.out.println(getNatoMessage('B'));
        System.out.println(getNatoMessage('C'));
        System.out.println(getNatoMessage('D'));
        System.out.println(getNatoMessage('E'));

    }

    public static String getNatoMessage(char a) {
        switch (a){
            case 'A':
               return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";

            default:
                return "Invalid Method";
        }
    }
}

