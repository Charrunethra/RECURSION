public class basic_base_cond {
    static int count = 0;
    static void print(){
        if(count == 3)
          return;
        System.out.println(count++);
        //count++;
        print();
    }
    public static void main(String[] args){
        print();
    }
}
