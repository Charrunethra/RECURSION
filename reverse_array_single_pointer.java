import java.util.*;
//Rcursion in reverse array in single pointer
public class reverse_array_single_pointer {
    void reverse(int i, int n, int[] arr){
        if(i >= n/2)
           return;
        swap(i, n-i-1, arr);
        reverse(i+1, n, arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        reverse_array_single_pointer rp = new reverse_array_single_pointer();
        rp.reverse(0, n, arr);
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
