import java.util.*;
//Recursion using 2 pointers_in reverse an array
public class reverse_array {
    void f(int l, int r, int[] arr){
        if(l >= r){
            return;
        }    
        swap(l, r, arr); //swap(arr[l], arr[r])
        f(l+1, r-1, arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // array size
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse_array r = new reverse_array();
        r.f(0,n-1,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    void swap(int l, int r, int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
