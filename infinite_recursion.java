//non-ending recursion or infinite recursion
import java.util.*;
public class infinite_recursion {
    void print(){
        System.out.println(1);
        print();
    }
    public static void main(String[] args){
        infinite_recursion r = new infinite_recursion();
        r.print();
    }
}
// here it shows '1' infinitely, then it shows an error because of (it cannot keep on piling up, and that where it is called as) SEGMENTATION FAULT
//Segmentation fault happens and its commonly known as STACK OVERFLOW

