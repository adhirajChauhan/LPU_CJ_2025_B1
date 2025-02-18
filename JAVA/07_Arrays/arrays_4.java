
public class arrays_4 {
    public static void main(String[] args) {
        //declare
        // int[][] arr = new int[3][3];

        //init
        int[][] arr = {
            {1,2,3,4},
            {4,5},
            {7,8,9}
        };

        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//Write a function isSorted(int[] arr) that returns true if array is sorted in ascending order, else return false
