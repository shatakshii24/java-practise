import java.util.Scanner;
public class AndOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    if(age>=18 && age<=28)
    System.out.println("You can donate blood!");
    else
      System.out.print("You are not eligible to donate blood");

    sc.close();
    }
}
