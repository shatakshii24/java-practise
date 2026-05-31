public class Leaderboard {

  public static int calculatePosition(int playerScore) {
    if(playerScore >= 1000){
      return 1;
    }
    if(playerScore >= 500){
      return 2;
    }
    if(playerScore >= 100){
      return 3;
    }
    if(playerScore >= 50){
      return 4;
    }
    else{
      return 5;
    }
  }

  public static void displayPosition(String playerName , int position){
    String suffix = getPositionSuffix(position);
    System.out.println(playerName + " managed to get " + position + suffix + " position on the leaderboard");
  }

  public static String getPositionSuffix(int position){
    if(position == 1){
      return "st";
    }
    if(position == 2){
      return "nd";
    }
    if(position == 3){
      return "rd";
    }
    else{
      return "th";
    }
  }

  public static void main(String[] args) {
    int position = calculatePosition(1500);
    displayPosition("Joey", position);
  }
  
}
