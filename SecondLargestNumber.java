public class SecondLargestNumber {
    public static void main(String[] args){
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(passTwoSolution(arr));
    }

    // TWO PASS APPROACH

    static int passTwoSolution(int[] arr){
        int largestNumber = -1, secondLargestNumber = -1;

        if(arr.length == 0) return 0;
        
        for(int i = 0; i < arr.length; i++){
            if(largestNumber <= arr[i]){
                largestNumber = arr[i];
            }
        }

        for(int i =0; i < arr.length; i++){
            if(secondLargestNumber < arr[i] && arr[i] != largestNumber){
                secondLargestNumber = arr[i];
            }
        }

        return secondLargestNumber;
    }

    static int passOneSolution(int[] arr){
        
        return 0;
    }
}
