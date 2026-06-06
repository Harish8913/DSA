package BinarySearch;

public class Koko {
    public static void main(String[] args){
        int[] nums = {3,6,7,11};
        int h = 8;
        int ans = search(nums, h);
        System.out.println(ans);
    }

    static int search(int[] piles, int h){
        int low = 0;
        int high = 0;
        int ans = Integer.MAX_VALUE;
        for(int pile: piles){
            high = Math.max(pile, high);
        }


        while(low <= high){
            int totalHrs = 0;
            int speed = low + (high - low) / 2;
            for(int pile: piles){
                double hrsTook = Math.ceil((double) pile/speed);
                totalHrs += hrsTook;

            }
            
            if(totalHrs <= h) { high = speed - 1; ans = Math.min(ans, speed);}
            else if(totalHrs > h) low = speed + 1;
        }

        return ans;
    }
}
