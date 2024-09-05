public class sentinelSearch {
    
    static void sentinelSearch(int arr[], int N, int key){

        //last element in the array
        int last = arr[N - 1];


        //Element to be searched placed in last index
        arr[N - 1] = key;
        int i = 0;

        while (arr[i] != key)
            i++; 

        arr[N - 1] = last;

        if ((i < N - 1) || (arr[N-1] == key))
            System.out.println(key + " is present at index " + i);
        else
            System.out.println("Element not found.");
    }


    public static void main(String[] args)
    {

        int arr[] = {34, 230, 85, 53, 27, 9958, 347, 43 };
        var N = arr.length;
        int key = 43;

        sentinelSearch(arr, N, key);
    }
}
