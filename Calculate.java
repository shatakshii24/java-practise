public class Calculate {
    public static int calculateScore(String playerName , int score){
        int calculatedScore = (score*1000);
        System.out.println(playerName + " scored " + score + " in the match ");
        return calculatedScore;
    }
    public static int calculateScore(int score){
        return calculateScore("Unkown" , score);
    }
    public static int calculateScore(){
        System.out.println("No player name or score was provided");
        return 0;
    }
    public static void main(String[] args){
        int A = calculateScore("Karan" , 12);
        int B = calculateScore("Mayur" , 14);
        int C = calculateScore(13); 
        int D = calculateScore();
        
        System.out.println("Final scores are : ");
        System.out.println("Karan : " + A);
        System.out.println("Mayur : " + B);
        System.out.println("Unkown : " + C);
        System.out.println("No player : " + D);
    }


}