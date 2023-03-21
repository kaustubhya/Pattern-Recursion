import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {4,3,2,1};
        
        Bubble(array, array.length - 1, 0);
        // Putting the last row and first column here and then
        //  printing the array using Arrays.toString() method
        System.out.println(Arrays.toString(array));
    }
    

    static void Bubble(int [] arr, int row, int column) {
        if (row == 0) {
            return;
        }

        if (row > column) {
            if (arr[column] > arr [column + 1]) {
                int temp = arr[column];
                // swap
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;

            }

            Bubble(arr, row, column + 1);
        }

        else {
            Bubble(arr, row - 1, 0);
        }
    

    }


} 
    
   
        

