public class DogPlay {
    public static boolean isDogPlaying(boolean summer , int temperature){
        if(!summer){
            return(temperature > 25 && temperature <= 35);
        }
        else{
                return (temperature>25 && temperature <= 45);
            }
    }
    public static void main (String[] args) {
        boolean A = isDogPlaying(false , 30);
        boolean B = isDogPlaying(true , 40);
        boolean C = isDogPlaying(true , 30);
        
        System.out.println("Scenario 1 : " + A);
        System.out.println("Scenario 2 : " + B);
        System.out.println("Scenario 3 : " + C);
        
    }

    
}