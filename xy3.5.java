public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        float z = 0;

        x = 6;
        y = 3;

        z = x / y;

        System.out.println("x / y = " + z);

        
        x = 7;
        y = 2;

        z = (float)x / (float)y;
        
        System.out.println("x / y = " + z);
    }
}
