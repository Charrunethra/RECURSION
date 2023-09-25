import java.util.*;
public class print_5times {
    void print(int i, int n){
        if(i>n)
           return;
        System.out.println("charru");
        print(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        print_5times p = new print_5times();
        int n = sc.nextInt();//5

        p.print(1,n);
    }
}
