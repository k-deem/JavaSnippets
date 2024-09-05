public class rbinarySearch {
    
    //Returns index of x if it is present in arr[low] or high, else return -1
    int rbinarySearch(int arr[], int low, int high, int x)
    {

        if (high >= low) {
            int mid = low + (high - low)/ 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            //If the element is smaller than mid, then it can only be present
            //in the left subarray
            if (arr[mid] > x)
                return rbinarySearch(arr, low, mid - 1, x);

            //Else the element can only be present in the right subarray
                return rbinarySearch(arr, mid + 1, high, x);
        }

        //We reached the end of the array but the element was not present
        return -1;
    }

    //Driver code
    public static void main(String[] args) 
    {
        rbinarySearch ob = new rbinarySearch();
        int arr[] = { 2, 4, 6, 7, 8, 20, 22, 28, 30, 35, 53, 65, 98, 102, 110 };
        int n = arr.length;
        int x = 35;
        int result = ob.rbinarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else 
            System.out.print("Element is present at index " + result);
    }
}

