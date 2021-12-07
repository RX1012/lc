public class test {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Solution a = new Solution();
        a.search(nums, target);
    }
}
class Solution{
    public int search(int[] nums, int target){
        if (target < nums[0] || target > nums[nums.length-1]){
            System.out.println("not in the list");
            return -1;
        }
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + ((right -left)>>1);
            if (nums[mid]==target) {
                System.out.println(mid);
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] > target){
                right = mid - 1;
            }
        }
        System.out.println("not in the list");
        return -1;
    }

}
