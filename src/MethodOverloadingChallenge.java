public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        int heightInInch = 68;
        int heightInFirstFoot = 5; int heightInSecondFoot = 8;
        System.out.println(convertToCentimeters(heightInInch));
        System.out.println(convertToCentimeter(heightInFirstFoot,heightInSecondFoot));


    }

    public static double convertToCentimeters(int height){
        double h = height*2.54;
        //return height * 2.54;
        return h;
    }

    public static double convertToCentimeter(int heightFisrt, int heightSecond){

        return (heightFisrt*12+heightSecond)*2.54;
    }
}
