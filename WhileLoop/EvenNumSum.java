public class EvenNumSum{
  public static int EvenSum(int number){
    if(number < 0){
      return -1;
    }
    int sum = 0;
    while(number > 0){
      int digit = number % 10;
      if(digit % 2 == 0){
        sum += digit;
      }
      number /= 10;
    }
    return sum;
  }

  public static void main(String[] args){
    int num = EvenSum(-986446);
    System.out.println("The sum of even numbers of is : " + num );
  }
}
