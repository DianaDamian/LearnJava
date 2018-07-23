// find all numbers within range that can divide with 3 and 5 and gather their sum
public class ForChallenge {

    public static void main(String args[]){
        int count=0;
        int sum=0;
        for (int i=1; i<=1000; i++){
            if((i%3==0)&&(i%5==0)){
                count++;
                sum += i;
                System.out.println("Found number "+ i);
                if(count==5){
                    System.out.println("Reached 5 numbers");
                    break;
                }
            }
        }
        System.out.println("Sum of numbers"+ sum);
    }

}
