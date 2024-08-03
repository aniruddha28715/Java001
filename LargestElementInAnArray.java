public class LargestElementInAnArray {
    int n ;
    int[] arr = new int[];
    int largest = arr[0];
    for(int i = 0; i <n; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }


    }
    return largest;

}




