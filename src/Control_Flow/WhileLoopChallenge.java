package Control_Flow;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int i=5;
        int evenCount =0;
        int oddCount = 0;
        while(i>4){
            if(isEvenNumber(i) == true){
                System.out.println("Even: " + i);
                evenCount += 1 ;
            }
            if(isEvenNumber(i) == false){
                System.out.println("Odd: " + i);
                oddCount += 1 ;
            }

            if(i>=20 || evenCount == 5){
                break;
            }
            i++;
        }
        System.out.println("Even Number Count: " + evenCount);
        System.out.println("Odd Number Count: " + oddCount);
    }

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        else return false;
    }

}
