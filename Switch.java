public class Switch {

    public static void main(String[] args){
        int value = 1;
        if (value == 1) System.out.println("Value was 1");
        else if (value == 2) System.out.println("Value was 2");
        else System.out.println("Was not 1 or 2");

        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        //more code here

        char switchChar = 'A';
        switch(switchChar){
            case 'A':
                System.out.println("Was A");
                break;
            case 'B':
                System.out.println("Was B");
                break;
            case 'C':
                System.out.println("Was C");
                break;
            case 'D':
                System.out.println("Was D");
                break;
            case 'E':
                System.out.println("Was E");
                break;
            default:
                System.out.println("Not A, B, C, or D");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Month is January");
                break;
            case "february":
                System.out.println("Month is February");
                break;
            //. . .
            default:
                System.out.println("Not sure which planet you're on!");
                break;
        }
    }

}
