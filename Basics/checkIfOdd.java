public class checkIfOdd {
  public static boolean isEven(int num){
    if(num % 2 == 0){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String[] args) {
    if(!(isEven(24))){
      System.out.print("The number is odd");
    }
    else{
      System.out.print("The number is even");
    }
  }
}
