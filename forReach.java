public class Main {
    public static void main(String[] args) {

        int[][] array = { { 1, 3, 5},{4, 9, 2},{9, 4, 7}};

        for (int[] i : array) {
            for (int element : i) {
                System.out.println(element);
            }
        }
    }
}
