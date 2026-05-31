public class DistanceConversion{
     
public static double milesToKilometers(double miles) {
    return miles * 1.609344;
  }
  
  public static double metersToKilometers(double meters) {
    return meters / 1000;
  }
  
  public static double kilometersToMiles(double kilometers) {
    return kilometers / 1.609344;
  }
  
  public static void PrintDistance(double firstValue, String valueType, double secondValue, String convertedValue ){
       System.out.println(firstValue + " " + valueType + "  is equal to " + secondValue + " " + convertedValue);
  }

  public static void main(String[] args) {
 
    double miles = 400;
    double kilometers = milesToKilometers(miles);
    PrintDistance(miles,"Miles",kilometers,"Kilometers");

    double meters = 4000;
    kilometers = metersToKilometers(meters);
    PrintDistance(meters,"meters",kilometers,"Kilometers");

    kilometers = 200;
    miles = kilometersToMiles(kilometers);
    PrintDistance(kilometers,"kilometers",miles,"miles");

  }
}