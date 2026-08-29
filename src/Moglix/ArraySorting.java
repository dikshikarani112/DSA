package Moglix;

public class ArraySorting {

    private static int[] sortArr(int[] arr) {
        int sortIndex = arr.length - 1;

        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[sortIndex];
                arr[sortIndex] = arr[i-1];
                arr[i-1] = temp;
                sortIndex--;
            }
        }

      /*  System.out.println("sorted array :");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }*/

        return arr;

    }

    public static void printArray(int[] arr) {
        System.out.println("sorted array :");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,1,0,0,1,0};
       // sortArr(arr);
        printArray(sortArr(arr));
    }


}
