public class Main {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop");
        while (x <= 4){
            System.out.println("In the loop" + "Value of x: " + x);
            x = x + 1;
        }
        System.out.println("After the loop");
    }
}