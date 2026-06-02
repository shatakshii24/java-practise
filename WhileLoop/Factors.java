public class Factors {
public static void getFactors(int number){
  if(number < 1){
    System.out.print("Invalid number");
    return;
  }
  int i = 1;
  System.out.print("The factors of "+number+" are : ");
  while(i <= number){
    if(number % i == 0){
      System.out.print(i + " ");
    }
    i++;
  }
}
public static void main(String[] args){
  int number = 234;
  getFactors(number);
}
}

