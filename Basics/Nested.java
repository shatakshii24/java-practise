public class Nested{
    public static void main(String[] args){
         int number = 90;
         String member = "yes";
         
         if(number > 100){
            if(member == "yes"){
                 System.out.println("You are eligible for 10% discount");
            }
            else{
                System.out.println("You are eligible for 5% discount");
            }
         }
         else{
            System.out.println("You are not eligible for discount");
         }
     }
}