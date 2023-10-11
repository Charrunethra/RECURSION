import java.util.*;
//recursion_palindrome, palindrome -> a string on reversal reads the same 
public class recursion_palindrome {
    boolean check(int i, String str){
        if(i >= str.length() / 2)
            return true;
        if(str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return check(i+1, str);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        recursion_palindrome rp = new recursion_palindrome();
        System.out.print(rp.check(0, str));
    }
}
