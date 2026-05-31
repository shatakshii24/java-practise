public class ShapeCalculator {
    // Method to calculate rectangle perimeter
    public static int rectanglePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    // Method to calculate rectangle area
    public static int rectangleArea(int length, int width) {
        return length * width;
    }

    // Method to calculate square perimeter
    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    // Method to calculate square area
    public static int squareArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        int rectangleLength = 5;
        int rectangleWidth = 10;
        int squareSide = 5;

        System.out.println("Rectangle Perimeter: " + rectanglePerimeter(rectangleLength, rectangleWidth));
        System.out.println("Rectangle Area: " + rectangleArea(rectangleLength, rectangleWidth));
        System.out.println("Square Perimeter: " + squarePerimeter(squareSide));
        System.out.println("Square Area: " + squareArea(squareSide));
    }
}