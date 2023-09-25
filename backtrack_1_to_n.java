import java.util.*;
public class backtrack_1_to_n {
    void print(int i, int n){
        if(i < 1)
          return;
        print(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//5
        backtrack_1_to_n b = new backtrack_1_to_n();
        b.print(n,n);
    }
}
