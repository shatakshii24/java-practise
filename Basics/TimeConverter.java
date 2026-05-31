public class TimeConverter {
  public static String timeConvert(int seconds) {
    int calulateMinutes = seconds / 60;
    int calulateHours = calulateMinutes / 60;
    int remainingSecond = seconds % 60;
    int remainingMinutes = calulateMinutes % 60;
    return calulateHours + "H " +remainingMinutes + "M " + remainingSecond + "S";
  }
  
  public static String timeConvert() {
     return timeConvert(12350);
  }

  public static void main(String[] args) {
    String result = timeConvert();
    System.out.println(result);
  }
}