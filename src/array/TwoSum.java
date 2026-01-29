package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findingSumBruteForce(int[] arr,int target){
        if(arr.length<2){
            return new int[]{0,0};
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};

    }
    public static int[] findingSumOptimize(int[] arr,int target){
        if(arr.length<2){
            return new int[]{0,0};
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            } else {
                map.put(arr[i],i);
            }
        }
        return new int[]{0,0};
    }
    //work if arrsy is sorted or else need to sorted first
    public static int[] findingSumOptimizeII(int[] arr,int target) {
        if(arr.length<2){
            return new int[]{0,0};
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return new int[]{start,end};
            } else if (sum<target) {
                start++;
            } else {
                end --;

            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,8,7,5};
        int target=15;
        int[] result=findingSumBruteForce(arr,target);
        System.out.println(Arrays.toString(result));
        int[] result2=findingSumOptimize(arr,target);
        System.out.println(Arrays.toString(result2));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] result3=findingSumOptimizeII(arr,target);
        System.out.println(Arrays.toString(result3));

    }


}
