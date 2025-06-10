public class MySwitch {
    public static void main(String[] args){
        char letter = 'A';
        switch(letter){
            case 'A' : System.out.println("A is alpha");
            break;
            case 'B' : System.out.println("B is brvo");
            break;
            case 'C' : System.out.println("C is charlie");
            break;
            case 'D' : System.out.println("D is delta");
            break;
            case 'E' : System.out.println("E is echo");
            break;
            default: System.out.println("Letter " + letter + " was not found in the switch statement");
        }
    }

    
}