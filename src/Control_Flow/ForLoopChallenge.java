package Control_Flow;

public class ForLoopChallenge {
    public static void main(String[] args) {

        int num = 17;
        for(int i=2; i<500;i++){
            boolean primeCheck = isPrime(i);
            if(primeCheck == true){

                System.out.println(i);
            }
        }

        }

        public static boolean isPrime(int integer){
            int count= 0;
            for( int j = 2; j<integer ; j++){
                if(integer%j == 0){
                    count ++;
                }
            }
        if(count ==0){
            return true;
        }
        else return false;
        }

    }




//System.out.println(i+"   "+j);

