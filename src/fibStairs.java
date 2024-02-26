import java.lang.reflect.Array;
import java.util.Arrays;

public class fibStairs {
    static int stairs(int n,int ways[]){
        if (n==1 || n==0){
            return 1;                  //Here even person stand on 0 stair there is a choice of 1
        }
        if (n<0){
            return 0;
        }
        if (ways[n] != -1){
            return ways[n];
        }
        ways[n] = stairs(n-1,ways) + stairs(n-2,ways);
        return ways[n];

          //For  3 stairs choice

        //ways[n] = stairs(n-1,ways) + stairs(n-2,ways) + stairs(n-3,ways);

    }



    public static void main(String[] args) {
        int n=5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(stairs(n,ways));


    }
}
