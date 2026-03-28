public class ArrayIsSorted {
    public static void main(String[] args){
        int[] arr = { 1,2,3,4,5,6,7,8, 90, 98, 90, 87, 67 };
        boolean isArraySorted = checkIfArrayIsSorted(arr);
        System.out.println(isArraySorted);
    }    

    static boolean checkIfArrayIsSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]) return false;
        }

        return true;
    }
}
