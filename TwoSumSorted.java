public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = { 11, 14, 16, 20, 34, 90, 129 };
        int t = 54;

        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while (leftPointer < rightPointer) {
            if (arr[leftPointer] + arr[rightPointer] > t) {
                rightPointer -= 1;
            } else if (arr[leftPointer] + arr[rightPointer] < t) {
                leftPointer += 1;
            } else {
                System.out.println("Match Found: Numbers are " + arr[leftPointer] + " " + arr[rightPointer]);
                break;
            }
        }
    }
}
