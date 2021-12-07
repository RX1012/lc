public class L_367 {
    public static void main(String[] args){
        int a = 39;
        solution_367 s = new solution_367();
        s.perfectSnum(a);
    }
}

class solution_367 {
    public boolean perfectSnum(int num) {
        long left = 1;
        long right=num;
        while(left<=right){
            long middle= left+(right-left)/2 ;
            if(middle*middle == num){
                System.out.println("true");
                return true;
            }
            else if (middle*middle < num){
                left=middle+1;
            }
            else if (middle*middle > num){
                right=middle-1;
            }
        }
        System.out.println("False");
        return false;

    }
}