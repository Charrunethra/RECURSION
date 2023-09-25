import java.util.*;
public class backtrack_n_to_1 {
    void print(int i, int n){
        if(i > n){
            return;
        }
        print(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backtrack_n_to_1 b = new backtrack_n_to_1();
        b.print(1,n);
    }
}
