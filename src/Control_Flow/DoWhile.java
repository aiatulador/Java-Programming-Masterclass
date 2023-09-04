package Control_Flow;

public class DoWhile {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }*/

        int j =0;
/*        while(j >=0){
            j++;
            if(j>10){
                break;
            }
            System.out.println(j);
        }*/
        boolean isReady = false;
        do{
            if(j>10){
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j>=0);
        }while(isReady);


    }

}
