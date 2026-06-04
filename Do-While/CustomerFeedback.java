public class CustomerFeedback {
    public static void main(String[] args) {

        String response = "no";

        do {
            System.out.println("Please give your feedback.");

            response = "yes"; // customer gives positive response

        } while (response.equals("no"));

        System.out.println("Thank you for your feedback.");
    }
}