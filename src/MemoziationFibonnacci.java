import java.lang.reflect.Array;
import java.util.Arrays;

public class MemoziationFibonnacci {


    static int fib(int n,int fibu[]){
        if (n == 1 || n == 0){
            return n;

        }
        if (n < 0){
            return n;
        }

        if (fibu[n] != -1){
            return fibu[n];
        }

        fibu[n] = fib(n-1,fibu) + fib(n-2,fibu);
        return fibu[n];
    }
    public static void main(String[] args) {
        int n =4;
        int fibu[] = new int[n+1];
        Arrays.fill(fibu,-1);
        System.out.println(  fib(n,fibu));
    }
}
