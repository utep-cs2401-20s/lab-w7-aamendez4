public class SortOfSort {
    public static void sortOfSort(int[] arr) {
        int max = Integer.MAX_VALUE;
        int temp;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                temp = arr[arr.length-1];
                arr[arr.length-1] = max;
                arr[i] = temp;
            }
        }
    }
}

