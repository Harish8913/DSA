package BinarySearch;

interface MountainArrayInterface {
    public int get(int index);

    public int length();
}

class MountainArray implements MountainArrayInterface {
    int[] nums = { 0,5,3,1 };

    public int get(int index) {
        return nums[index];
    }

    public int length() {
        return nums.length;
    }
}

public class SearchInMountain {
    public static void main(String[] args) {
        MountainArray mountainArray = new MountainArray();
        int target = 1;
        int val = findInMountainArray(target, mountainArray);
        System.out.println(val);
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;
        int peak = 0;

        while(low < high){
            int mid = low + (high - low) / 2;
            
            int m1 = mountainArr.get(mid);
            int m2 = mountainArr.get(mid - 1);
            int m3 = mountainArr.get(mid + 1);
            if(m1 < m2){
                peak = mid - 1;
                high = mid;
            }else if(m1 < m3){
                peak = mid + 1;
                low = mid + 1;
            }else{
                peak = mid;
                break;
            }
        }

        int l1 = 0;
        int h1 = peak;
        int l2 = peak + 1;
        int h2 = mountainArr.length() - 1;
        int ans1 = -1;
        int ans2 = -1;

        while (l1 <= h1) {
            int m1 = l1 + (h1 - l1) / 2;
            int v1 = mountainArr.get(m1);

            if (v1 == target) {
                ans1 = m1;
                break;
            }

            if (v1 > target) h1 = m1 - 1;
            else l1 = m1 + 1;
        }

        while (l2 <= h2) {
            int m2 = l2 + (h2 - l2) / 2;
            int v2 = mountainArr.get(m2);

            if (v2 == target) {
                ans2 = m2;
                break;
            }

            if (v2 > target) l2 = m2 + 1;
            else h2 = m2 - 1;
        }

        return ans1 < 0 ? ans2 : ans1;
    }
}
