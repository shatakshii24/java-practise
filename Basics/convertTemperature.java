public class convertTemperature{
  public static double CalculateTemperature(char tempChar , double temperature){
    double result;
    if(tempChar == 'F'){
      result = (temperature - 32)*5/9;
    }
    else if (tempChar == 'C'){
      result = (temperature * 9/5)+32;
    }
    else{
      result = 0;
    }
    return result;
  }
  public static void displayResult(char tempname , double result){
    System.out.println("Temperature is : " +result+" "+tempname);
  }

  public static void main(String args[]){
    double calculatedTemperature = CalculateTemperature('C' , 80);
    displayResult('F' , calculatedTemperature);
  }
}