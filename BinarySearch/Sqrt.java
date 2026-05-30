package BinarySearch;

public class Sqrt {
    public static void main(String[] args){
        int num = 8;
        search(num);
    }

    public static int search(int x) {
        int low = 0;
        int high = x;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(mid < x / mid){
                ans = mid;
                low = mid + 1;
            }else if(mid > x / mid){
                high = mid - 1;
            }else return mid;
        }

        return ans;
    }
}
