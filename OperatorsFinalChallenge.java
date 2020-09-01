public class OperatorsFinalChallenge {

    public static void main(String[] args){
        double firstDouble = 20.0d;
        double secondDouble = 80.0d;
        double thirdDouble = (firstDouble + secondDouble) * 100.0d;

        double remainderTotal = thirdDouble % 40.0d;

        boolean isZero = remainderTotal == 0 ? true : false;
        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }
    }

}
