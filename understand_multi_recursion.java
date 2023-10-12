import java.util.*;
//Understand multiple recursion..here 2 recursion...
// here fibonacci series 
public class understand_multi_recursion {
    //0 1 1 2 3 5 8 13 21 34
    //0 1 2 3 4 5 6 7  8  9
    int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2); //second last
        return last + slast;// also it can be "return fibonacci(n-1) + fibonacci(n-2);" instead of last two lines
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        understand_multi_recursion uni = new understand_multi_recursion();
        System.out.print(uni.fibonacci(n));
    }
}
