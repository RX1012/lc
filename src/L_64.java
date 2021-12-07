public class L_64 {
    public static void main(String[] args){
        solution_64 a= new solution_64();
        int t= 9;
        a.sqrt(t);
    }
}
class solution_64{
    public int sqrt (int num){
        int record = 0;
        for(int i=1; i<= num; i++){
            if((num/i) == i){
                record=i;
                break;
            }
            else if((num/i)<i){
                record= i-1;
                break;
            }
        }
        System.out.println(record);
        return record;


    }
}

