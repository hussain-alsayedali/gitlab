public class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    void selectionSort(int arr[], int n)
    {
        int i, j, min_idx;
        // One by one move boundary of
        // unsorted subarray
        for (i = 0; i < n-1; i++)
        {
            // Find the minimum element in
            // unsorted array
            min_idx = i;
            for (j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Swap the found minimum element
            // with the first element
            if (min_idx!=i)
                swap(&arr[min_idx], &arr[i]);
        }
    }
    void insertionSort(int arr[], int n)
    {
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i - 1;

            // Move elements of arr[0..i-1],
            // that are greater than key, to one
            // position ahead of their
            // current position
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    void sort((int arr[], int n){
        selectionSort(arr[],  n)
    }
}