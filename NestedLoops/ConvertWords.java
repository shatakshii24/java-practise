public class ConvertWords {
  public static void main(String[] args) {
    numberToWords(12345);
    numberToWords(0);
    numberToWords(-12345);
  }

  public static void numberToWords(int number){
    if(number < 0){
      System.out.println("Invalid Value");
      return;
    }

  if(number == 0){
    System.out.println("Zero");
    return;
  }
  String result = "";
  int digit, temp;
  for(int i =1, j = 10; number > 0; i*=10 , j*=10){
    temp = number % j;
    digit = temp / i;
    for(int k = 0;k < 10; k++){
      if(digit == k){
        String word = "";
        switch(digit) {
          case 0:
            word = "Zero";
            break;
          case 1:
            word = "One";
            break;
          case 2:
            word = "Two";
            break;
          case 3:
            word = "Three";
            break;
          case 4:
            word = "Four";
            break;
          case 5:
            word = "Five";
            break;
          case 6:
            word = "Six";
            break;
          case 7:
            word = "Seven";
            break;
          case 8:
            word = "Eight";
            break;
          case 9:
            word = "Nine";
            break;
        }
        result = word + " " + result;
        break;
      }
    }
    number -= temp;
  }
  System.out.println(result.trim());
  }
}
