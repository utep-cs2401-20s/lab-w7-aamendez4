public class SortOfSort {
    private int[] arr;
    private int length;

    public SortOfSort(int[] inputArr){
        arr = inputArr;
    }

    public void sortOfSort(){
        int max = 0;
        int count = 0;
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(count < 2) {
                max = start;
                for (int i = start; i <= end; i++){
                    if(arr[i] >= arr[max]){
                        max = i;
                    }
                }
                int temp = arr[max];
                arr[max] = arr[end];
                arr[end] = temp;
                count++;
                end--;
            }
            else{
                max = start;
                for(int i = start; i <= end; i++){
                    if(arr[i] >= arr[max]){
                        max = i;
                    }
                }
                int temp = arr[max];
                arr[max] = arr[start];
                arr[start] = temp;
                start++;
                count++;
            }
            if(count == 4){
                count = 0;
            }
        }
    }

}

