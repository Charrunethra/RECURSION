import java.util.*;
public class print_1_to_n {
    void print(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        print(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        print_1_to_n p = new print_1_to_n();
        int n = sc.nextInt();//5 
        p.print(1,n);
    }
}
