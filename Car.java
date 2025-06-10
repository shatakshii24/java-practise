class Car {
    
    public static String carFunctions(double distance, double fuel){
        return "Mileage: " + (distance / fuel) + " km/l";
    }
    
    public static String carFunctions(double distance, int time){
        return "Speed: " + (distance / time) + " km/h";
    }
    
    public static String carFunctions(){
        return carFunctions(100.0, 5.0) + "\n" + carFunctions(200.0, 2);
    }
    
    public static void main(String[] args) {
       String result = carFunctions();    
       System.out.println(result);
    }
}