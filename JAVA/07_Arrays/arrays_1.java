
public class arrays_1 {
    public static void main(String[] args) {
        //declare 
        // dataType[] arrName;

        //init 
        // int[] arr = new int[5];

        //init and declare
        int[] arr = {3, 32, 10, 18, 36};
        //index      0  1    2   3   4

        //access
        // System.out.print("Before : ");
        // System.out.println(arr[2]);

        //modify
        // arr[2] = 100;

        // System.out.print("After : ");
        // System.out.println(arr[2]);

        //print

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        for(int i : arr){
            System.out.print(i  + " ");
        }

    }
}
