public class AreaCalculator{
    public static double areaRectangle(int length , int breadth){
          return length * breadth;
    }
    public static double perimeterRectangle(int length , int breadth){
          return 2(length + breadth);
    }
    public static double areaCircle(int radius){
          return 3.14 * radius * radius;
    }
    public static double perimeterCircle(int radius){
          return 2 * 3.14 * radius;
    }
    public static double volumeCube(int radius){
          return ((4/3)* 3.14 * radius * radius * radius);
    }
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in){
           

          System.out.println("---- Geometry Calculator ----");
          System.out.println("1. Calculate area and perimeter of a rectangle");
          System.out.println("2. Calculate area and perimeter of a circle");
          System.out.println("3. Calculate volume of a cube");
          System.out.println("4. Exit");
          System.out.print("Enter your choice (1-4): ");
          int choice = scanner.nextInt();
                  if (choice == 1) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();

            if (length < 0 || width < 0) {
                System.out.println("Error: Length and width must be non-negative.");
            } else {
                System.out.println("Area of rectangle: " + rectangleArea(length, width));
                System.out.println("Perimeter of rectangle: " + rectanglePerimeter(length, width));
            }

        } else if (choice == 2) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Error: Radius must be non-negative.");
            } else {
                System.out.printf("Area of circle: %.2f%n", circleArea(radius));
                System.out.printf("Perimeter (circumference) of circle: %.2f%n", circlePerimeter(radius));
            }

        } else if (choice == 3) {
            System.out.print("Enter side length of the cube: ");
            double side = scanner.nextDouble();

            if (side < 0) {
                System.out.println("Error: Side length must be non-negative.");
            } else {
                System.out.println("Volume of cube: " + cubeVolume(side));
            }

        } else if (choice == 4) {
            System.out.println("Exiting program. Goodbye!");
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}
    



