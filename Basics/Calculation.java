public class Calculation{
    public static int calculateMarks(int marks){
         if(marks > 85){
             return 1;
         }
         else if(marks > 65){
             return 2;
         }
         else if(marks > 45){
             return 3;
         }
         else{
             return 4;
         }
    }
    public static void displayPosition(String student , int position){
         String suffix = getPositionSuffix(position);
         System.out.println(student + " secured " + position + suffix + " position in class. ");
    }
    public static String getPositionSuffix(int position){
         if(position == 1){
            return "st";
         }
         else if(position == 2){
            return "nd";
         }
         else if(position == 3){
            return "rd";
         }
         else{
            return "th";
         }
    }
    public static void main(String[] args){
         int pa = calculateMarks(92);
         int pb = calculateMarks(80);
         int pc = calculateMarks(55);
         int pd = calculateMarks(40);
         displayPosition("Joey" , pa);
         displayPosition("Chandler" , pb);
         displayPosition("Monica" , pc);
         displayPosition("Ross" , pd);
    }
}
         
         