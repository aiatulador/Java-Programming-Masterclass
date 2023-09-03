package Control_Flow;

public class SwitchTraditional {
    public static void main(String[] args) {

        char alphabet = 'j';

        switch(alphabet){
            case 'a' :
                System.out.println("alaba");
                break;
            case 'n':
                System.out.println("Nacho");
                break;
            case 'j':
                System.out.println("Jude");
                //break;
            case 'c': case 'r': case 'd':
                System.out.println("Cristiano Dos Santos Ronaldo");
                break;
            default:
                System.out.println("Zidane");
        }

    }

}
