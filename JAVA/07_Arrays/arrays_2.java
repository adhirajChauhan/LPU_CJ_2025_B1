
public class arrays_2 {

    // static void modifyArray(int[] arr){
    //     for(int i = 0; i<arr.length; i++){
    //         arr[i] *= 2;
    //     }
    // }

    //function that returns array
    static int[] getArray(){
        return new int[]{1,2,3,4,5};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        // System.out.print("Before modification ");

        // for(int i : nums){
        //     System.out.print(i + " ");
        // }

        // modifyArray(nums);

        // System.out.print("\nAfter modification ");

        // for(int i : nums){
        //     System.out.print(i + " ");
        // }


        int[] ans = getArray();

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}


//Write a function findMinMax(int[] arr) that finds the largest and smallest element in an array and returns them;

//10, 5, 25, 18, 3
// max -> 25, min -> 3
