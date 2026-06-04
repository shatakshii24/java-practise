public class AllLoops {
    public static void main(String[] args){
      System.out.println("For loop: ");
        for(int i = 1 ; i < 6; i++){
            System.out.println("Iteration "+i+":"+i);
        }
        
        System.out.println(" ");
        
      System.out.println("While loop: ");
        int i = 1;
        while(i < 6){
            System.out.println("Iteration "+i+":"+i);
            i++;
        }
        System.out.println(" ");
        
      System.out.println("DoWhile loop: "); 
        i = 1;
        do{
          System.out.println("Iteration "+i+":"+i);
          i++;
        }while(i < 6);
    }
    
}