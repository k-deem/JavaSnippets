public class binarySearch {
    

    //Return the index of x if it is present in the arr[].
    int binarySearch(int arr[], int x)
    {

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; 

            //Check if x is present at mid
            if (arr[mid] == x)
                return mid;
            
            //Check if x is greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, ignore the right half
            else 
                high = mid - 1;
        }

        //If we reach here, the element was not present
        return -1;
    }

    //Driver code
    public static void main(String[] args) {
        binarySearch ob = new binarySearch();
        int arr[] = {2, 10, 22, 27, 35, 46, 51, 69, 72, 83, 99, 104, 112};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in the array.");
        else 
            System.out.println("Element is present at " + "index" + result);
    }
}
