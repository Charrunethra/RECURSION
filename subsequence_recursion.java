//Print the Subsequence
import java.util.*;
//if [3,1,2] is the array
// then the output is 3 1 2, 3 1, 3 2, 3, 1 2, 1, 2, {} 
//pick then not pick intuition in printing the subsequence
public class subsequence_recursion {
    void sequencePrint(int idx, int[] arr, int n, ArrayList<Integer> result){
        if(idx >= n){
            for(Integer i : result){
                System.out.print(i+" ");
            }
            if(result.size() == 0){
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        result.add(arr[idx]); // add(arr[i]);
        //pick or tick
        sequencePrint(idx+1, arr, n, result);
        result.remove(result.size() - 1); //important to understand   remove(arr[i]);
        //not pick or not tick
        sequencePrint(idx+1, arr, n, result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // array size
        int[]  arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        subsequence_recursion sr = new subsequence_recursion();
        ArrayList<Integer> result = new ArrayList<>();
        sr.sequencePrint(0, arr, n, result);
    }
}

