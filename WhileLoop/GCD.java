public class GCD {
  public static int findgcd(int first,int second){
    if(first < 10 || second < 10){
      return -1;
    }
  
  while(second != 0 ){
    int temp = second;
    second = first % second;
    first = temp;
  }
  return first;
}

  public static void main(String[] args){
    int a = 48;
    int b = 34;
    int result = findgcd(a , b);
    System.out.println("The GCD of " +a+ " and " +b+ " is : " +result);
  }
}
