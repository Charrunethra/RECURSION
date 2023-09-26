//Sum of first n nos. using parameterised way
import java.util.*;
public class sum_n_nos_parameter {
    void sum(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//3
        sum_n_nos_parameter s = new sum_n_nos_parameter();
        s.sum(n,0);
    }
}
