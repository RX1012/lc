public class L_35 {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 8;
        Solution_35 a = new Solution_35();
        a.search_35(nums, target);
    }
}

class Solution_35 {
    public int search_35(int[] nums, int target) {
        if (target < nums[0] ) {
            return 0;
        }
        if (target > nums[nums.length - 1]){
            return nums.length;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        if (target > nums[right]) {
            return ++right;
        }
        return 0;
    }
}
