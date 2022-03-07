public class Main
{
    public static void main (String[] args)
    {
        int[] myArray = {16, 4, 7, 10, 3, 2};
        insertionSortRecursive(myArray, myArray.length);

        for (int i : myArray)
        {
            System.out.print (i + " ");
        }
    }//End main

    static void insertionSortRecursive (int arr[], int n)
    {
        //Base case
        if (n <= 1)
        {
            return;
        }

        //Sort previous elements recursively
        insertionSortRecursive(arr, n-1);

        //no else is needed because if had a return statement
        //insert last elements at its position in the sorted array
        int key = arr[n-1];
        int j = n-2;
        //move elements in sorted array that are greater than key one position to the right
        while (j >= 0 && arr[j] > key)//check out of bound AND element less than key
        {
            arr[j+1] = arr[j];
            j--;
        }//End of while

        arr[j+1] = key;
    }//End recursive method to import insertion sort
}//End class main
