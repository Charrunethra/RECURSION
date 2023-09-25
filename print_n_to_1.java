import java.util.*;
public class print_n_to_1 {
    void print(int i, int n){
        if(i < 1)
          return;
        System.out.println(i);
        print(i-1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        print_n_to_1 p = new print_n_to_1();
        p.print(n,n);
    }
}
