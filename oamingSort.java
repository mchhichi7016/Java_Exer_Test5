public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 2, 1};
        int al = arr.length;

        for (int i = 0; i < al - 1; i++) {
            for (int j = 0; j < al - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j+1] 的位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i : arr) {

            System.out.println(i);
        }
    }

}
