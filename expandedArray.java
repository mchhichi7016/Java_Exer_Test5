public class Main{
    public static void main(String[] args) {

        int[] array = {1,2,3};

        addLength(array,4);

        int[] newArray = addLength(array,4);

        System.out.println("新数组的内容：");
        printArray(newArray);


    }



    static int[] addLength(int[] array, int i) {

        int[] newArray = new int[array.length + 1];
        for (int j = 0; j < array.length; j++) {
            newArray[j] = array[j];

        }
        newArray[array.length] = i;

        return newArray;

    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
