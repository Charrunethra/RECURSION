import java.util.*;
public class factorial_n_functional {
    int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        factorial_n_functional f = new factorial_n_functional();
        System.out.println(f.fact(n));
    }
}
//T.C -> O(N)
//S.C (stack space) -> O(N)