//factorial of n using parameterised way
import java.util.*;
public class factorial_n_parameter {
    void fact(int i, int res){
        if(i < 1){
            System.out.println(res);
            return;
        }
        fact(i-1,res*i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//5
        factorial_n_parameter f = new factorial_n_parameter();
        f.fact(n,1);
    }
}
