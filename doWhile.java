public class doWhile {

    public static void main(String[] args){
        int count = 0;
        do{
            System.out.println("Count =  " + count);
            count++;
        } while(count != 5);

        int number = 4, finish = 20, evenNumbersFound = 0;

        while(number <= finish){
            number++;
            if(!isEvenNumber(number)) continue;
            System.out.println("Even number = " + number);

            evenNumbersFound++;
            if(evenNumbersFound > 5) break;
        }

    }

    public static boolean isEvenNumber(int n){
        if(n < 0) return false;
        return n % 2 == 0;
    }


}
