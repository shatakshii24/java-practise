public class FindLargestPrime {
  public static int findPrimeFactor(int number){
    if(number < 2){
      return -1;
    }

    int largestPrime = -1;
    for(int i = 2; i <= number; i++){
      while(number % i == 0){
        largestPrime = i;
        number /= i;
      }
    }
    return largestPrime;
  }
  public static void main(String[] args){
    System.out.println(findPrimeFactor(30));
    System.out.println(findPrimeFactor(17));
    System.out.println(findPrimeFactor(21));
  }
  
}
