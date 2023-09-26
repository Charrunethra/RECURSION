import java.util.*;
public class sum_n_nos_functional {
    int sum(int n){
            if(n == 0){
                return 0;
            }
            return n+sum(n-1);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//3
        sum_n_nos_functional s = new sum_n_nos_functional();
        System.out.println(s.sum(n));
    }
}
