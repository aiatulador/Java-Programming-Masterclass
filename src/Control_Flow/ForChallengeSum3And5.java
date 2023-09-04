package Control_Flow;

public class ForChallengeSum3And5 {
    public static void main(String[] args) {

        int count = 0;
        int sum =0;
        for(int i = 1; i<=1000 ; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                if(count>5){
                    break;
                }
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }

    public static void sum3And5(){

    }
}
