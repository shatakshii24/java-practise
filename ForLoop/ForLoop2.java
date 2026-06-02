public class ForLoop2 {
  public static void main(String[] args) {
    System.out.println("0 is" + (isPrime(0)? "" : " Not" ) + " a prime number.");
    System.out.println("1 is" + (isPrime(1)? "" : " Not") + " a prime number.");
    System.out.println("2 is" + (isPrime(2)? "" : " Not") + " a prime number.");
    System.out.println("7 is" + (isPrime(7)? "" : " Not") + " a prime number.");
    System.out.println("11 is" + (isPrime(11)? "" : " Not") + " a prime number.");
  }
  public static boolean isPrime(int wholeNumber){
    if(wholeNumber <= 2){
      return (wholeNumber == 2);
    }
    for (int divisor = 2; divisor < wholeNumber; divisor++){
      if(wholeNumber % divisor == 0){
        return false;
      } 
    }
    return true;
  }
}

