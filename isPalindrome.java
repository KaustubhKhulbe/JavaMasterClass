public class isPalindrome {

    public static void main(String[] args){
        System.out.println("is 1551 a palindrome: " + isPalindrome(1551));
        System.out.println("is 15351 a palindrome: " + isPalindrome(15351));
        System.out.println("is 32 a palindrome: " + isPalindrome(32));
        System.out.println("is -222 a palindrome: " + isPalindrome(-222));

    }

    //Goes through the number, does fancy math to get the digits and connects them to form the revers
    //Then checks if they are equal and returns that

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int temp = number, placeVal = 0;
        while(temp > 0){
            placeVal += temp%10;
            placeVal *= 10;
            temp /= 10;
        }
        placeVal/=10;
        System.out.println(placeVal);
        return placeVal == number;
    }

}
