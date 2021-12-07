public class L_34 {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 8;
        solution_34 a = new solution_34();
        a.search_34(nums, target);

    }
}
class solution_34{
    public int[] search_34(int[] nums, int target){
        int leftBorder = getLeftBorder(nums,target);
        int rightBorder= getRightBorder(nums, target);
        if(leftBorder==-2 || rightBorder ==-2){
            return new int[]{-1,-1};
        }
        if(rightBorder-leftBorder>1) {
            return new int[]{leftBorder+1, rightBorder-1};
        }
        return new int[]{-1,-1};

    }
    int getRightBorder(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int rightBorder = -2;
        //that is when right border is not being arranged at all
        while(left <= right){
            int middle= left + ((right-left)>>1);
            if(nums[middle]> target){
                right= middle - 1;
            }
            else{// find the right border when updating left
                left= middle+1;
                rightBorder=left;
            }
        }
        return rightBorder;
    }
    int getLeftBorder(int[] nums, int target){
        int left = 0;
        int right= nums.length-1;
        int leftBorder= -2;
        int middle;
        while(left<=right){
            middle = left+ ((right-left)>>1);
            if(nums[middle]>=target){
                //find left Border when updating right
                right= middle -1;
                leftBorder=right;
            }
            else{
                left= middle+1;
            }
        }
        return leftBorder;
    }

}
