public class KnapSack {
    static int knapsack(int val[],int wt[],int W,int n){
        if (W == 0 || n == 0){
            return 0;
        }
        if (wt[n-1] <= W){
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1);

            //Exclude                                                here we checking weather adding is getting more profit or not adding is getting more profit
              int ans2 = knapsack(val, wt, W, n-1);

              return Math.max(ans2,ans1);


        }
        else{
            return knapsack(val, wt, W, n-1);
        }

    }


    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w =7;

        System.out.println(knapsack(val,wt,w,val.length));
    }
}
