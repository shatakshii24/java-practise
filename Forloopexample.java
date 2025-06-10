public class ForLoopExample{
public static double calculateInterest(double principalAmount , double interestRate){
    return principalAmount*(interestRate/100);
}

    public static void main(String[] args) {
        System.out.println("Loop from 1 to 7 :");
        for(int i =1;i<=7;i++){
            System.out.println("Iteration : "+i);
        }

        System.out.println("\n Interest on $8000 from 2% to 5% : ");
        for(int rate=2;rate<=5;rate++){
            double interest = calculateInterest(8000,rate);
            System.out.println("Interest at " + rate + "% = $" + interest);
        }

        System.out.println("\n Interest on $300 from 6% to 9% step 0.5%, stop if interest > $12 : ");
        for(double rate = 6.0; rate <= 9.0;rate += 0.5){
            double interest = calculateInterest(300,rate);
            if(interest>12.0){
                System.out.println("Interest exceeded $12 at rate " + rate +"% stopping loop.");
                break;
            }
            System.out.println("Interest at " + rate + "% = $" + interest);
        }
    }
}