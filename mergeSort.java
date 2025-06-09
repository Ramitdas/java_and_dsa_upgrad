//Merge Sort Code

public class mergeSort {
    

    static void merge(int[] arr, int l, int mid, int r){
        //Find the sizes of the two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = r - mid;

        //Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copy data to temporary arrays
        for(int i = 0;i < n1;i++){
            L[i] = arr[l + i];
        }
        
        for(int j = 0 ;j<n2;j++){
            R[j] = arr[mid + 1 + j];
        }


        //merge the temporary arrays
        int i = 0, j = 0;

        int k = l;


        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy the remaining elements of L[] if there are any
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

         //Copy the remaining elements of L[] if there are any
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }


    static void sort(int[] arr, int l, int r){
        if(l < r){
            int mid = (l + r) / 2;

            // Sort first half
            sort(arr, l, mid);
            // Sort second half
            sort(arr, mid + 1, r);

            // Merge the sorted halves
            merge(arr, l, mid, r);

        }
    }

    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        int[] arr = {10,30,20,90,40,50};
        System.out.println("Before Sorting:");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);

    } 
}
