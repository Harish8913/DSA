public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 35, 34 };
        // System.out.println(passTwoSolution(arr));
        System.out.println(passOneSolution(arr));
    }

    // TWO PASS APPROACH

    static int passTwoSolution(int[] arr) {

        if (arr.length == 0)
            return -1;

        int largestNumber = -1, secondLargestNumber = -1;

        for (int i = 0; i < arr.length; i++) {
            if (largestNumber < arr[i]) {
                largestNumber = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (secondLargestNumber < arr[i] && arr[i] != largestNumber) {
                secondLargestNumber = arr[i];
            }
        }

        return secondLargestNumber;
    }

    // ONE PASS APPROACH

    static int passOneSolution(int[] arr) {
        if (arr.length < 2)
            return -1;

        int largestNumber = Integer.MIN_VALUE, secondLargestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];
            } else if (arr[i] > secondLargestNumber && arr[i] < largestNumber) {
                secondLargestNumber = arr[i];
            }
        }

        return secondLargestNumber == Integer.MIN_VALUE ? -1 : secondLargestNumber;
    }
}
