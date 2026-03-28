public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] numbers = new int[] { 19, -10, 20, 14, 2, 16, 10 };
        System.out.println(firstMethod(numbers));
    }

    static int firstMethod(int[] arr) {
        if (arr.length < 3)
            return -1;
        int fl = Integer.MIN_VALUE, sl = Integer.MIN_VALUE, tl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fl) {
                tl = sl;
                sl = fl;
                fl = arr[i];
            } else if (arr[i] < fl && arr[i] > sl) {
                tl = sl;
                sl = arr[i];
            } else if (arr[i] < sl && arr[i] > tl) {
                tl = arr[i];
            }
        }
        return tl;
    }
}
