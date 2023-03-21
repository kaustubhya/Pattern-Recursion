import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] array = {5,6,1,2,3,4,8};
        selection(array, 7, 0, 0);
        System.out.println(Arrays.toString(array));
        
    }

    static void selection(int[] arr, int row, int column, int max){
        if(row == 0){
            return;
        }

        if(row > column) {
            if (arr[column] > arr[max]) {
            // max is the index which is initially 0 at the start of each line/row
            selection(arr, row, column + 1, column);
            // max is updated if we find a greater no.
            }
            else {
                selection(arr, row, column + 1, max);
                // max remains un-updated
            }
        }

        // swap the max element with the last index element of row i.e. row -1
        else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selection(arr, row - 1, 0, 0);
            // finding max horizontally and swapping vertically ig
        }
    }
    
}
