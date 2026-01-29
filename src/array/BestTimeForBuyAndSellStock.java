package array;

import java.util.Arrays;

public class BestTimeForBuyAndSellStock {
    public static int[] bestTimeBuySellBruteForce(int[] arr){
        if(arr.length<2){
            return new int[]{0,0};
        }
        int maxProfit=0;
        int buy=0;
        int sell=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int profit=arr[j]-arr[i];
                if(profit>maxProfit){
                    maxProfit=profit;
                    buy=arr[i];
                    sell=arr[j];
                }
            }
        }
        return new int[]{buy,sell};
    }
    public static int[] bestTimeBuySellOptimize(int[] arr){
        if(arr.length<2){
            return new int[]{0,0};
        }
        int maxProfit=0;
        int buy=0;
        int sell=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }else{
                int profit=arr[i]-min;
                if(maxProfit<profit){
                    maxProfit=profit;
                    buy=min;
                    sell=arr[i];
                }
            }
        }
        return new int[]{buy,sell};
    }
    public static void main(String[] args) {
        int[] arr={3,4,6,8,8,9,34};
        int[] result=bestTimeBuySellBruteForce(arr);
        System.out.println(Arrays.toString(result));

        int[] result1=bestTimeBuySellOptimize(arr);
        System.out.println(Arrays.toString(result1));

    }
}
