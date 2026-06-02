// public class Palindrome {
//   public static boolean isPalindrome(int number){
//     int palindrome = number;
//     int reverse = 0;
//     while(palindrome != 0){
//       int remainder = palindrome % 10;
//       reverse = reverse*10 + remainder;
//       palindrome = palindrome/10;
//     }
//     return number == reverse;
//   }
//   public static void main(String[] args) {
//     int num = 16461;
//     if(isPalindrome(num)){
//       System.out.println(num + " is a palindrome number");
//     }
//     else{
//       System.out.println(num + " is not a palindrome");
//     }
//   }
  
// }


import java.util.Scanner;

class Palindrome {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day : ");
        int day = sc.nextInt();

        switch(day){

            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;

                default :
                System.out.println("Invalid day");

                
        }
        sc.close();
    }
    
}
