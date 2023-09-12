public class Main {
    public static void main(String[] args) {

        int[][] array3 = {{0,1,2},{3,4,5}};

        /*int[][] array4 = array3.clone();
        array4[0][0] = 6;*/

        int[][] array4 = new int[array3.length][array3.length];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                array4[i][j] = array3[i][j];

            }
        }
        array4[0][0] = 6;

        System.out.println(array3[0][0]);

    }
}
