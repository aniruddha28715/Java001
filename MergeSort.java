import java.util.*;

public class MergeSort {
    private void merg(int arr[], int low, int mid,int high){
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low; 
    int right = mid+1;



    while(left <= mid && right <=high){
        if(arr[left] <= arr[right]){
            left++;
    }
    
    }
    while(right <= high){
        temp.add(arr[right]);
        right++;
        
    }
          
    for(int i = low; i <=  high; i++){
        arr[i] = temp.get(i-low);
    }
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }
}
public class tUf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
