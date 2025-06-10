public class EvenCode{
   public static boolean isEven(int num){
      if(num % 2 == 0){
         return true;
      }
      else{
         return false;
      }
   }
   public static void main(String[] args){
        int myNum = 7;
        boolean result = isEven(myNum);
        if(result){
           System.out.println("The number is even");
        }
        else{
           System.out.println("The number is odd");
        }
   }
}