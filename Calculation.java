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
         int position1 = calculateMarks(92);
         int position2 = calculateMarks(80);
         int position3 = calculateMarks(55);
         int position4 = calculateMarks(40);
         displayPosition("Joey" , position1);
         displayPosition("Chandler" , position2);
         displayPosition("Monica" , position3);
         displayPosition("Ross" , position4);
    }
}
         
         