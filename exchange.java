public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        x = 10;
        y = 20;

        int temp  = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
