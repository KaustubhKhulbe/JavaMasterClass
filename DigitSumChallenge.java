public class DigitSumChallenge {

    public static void main(String[] args){
        System.out.println("Sum of digits of 12 is: " + sumDigits(12));
        System.out.println("Sum of digits of 1782 is: " + sumDigits(1782));
        System.out.println("Sum of digits of 3 is: " + sumDigits(3));
        System.out.println("Sum of digits of -2 is: " + sumDigits(-2));
    }

    public static int sumDigits(int n){
        int sum = 0, multiplier = 10;
        if(n < 10) return -1;
        while(n >= 10){
            sum += n % multiplier;
            n /= 10;
        }
        sum += n;
        return sum;
    }

}
