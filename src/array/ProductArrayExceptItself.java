package array;

import java.util.Arrays;

public class ProductArrayExceptItself {

    public static int[] productOfArrayBruteforce(int[] arr){
        int [] newArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product=product*arr[j];
                }
            }
            newArray[i]=product;
        }
        return newArray;
    }
    public static int[] productOfArrayOptimize(int[] nums){
//        int [] newArray=new int[arr.length];
//        newArray[0]=1;
//        for(int i=1;i<arr.length;i++){
//            newArray[i]=newArray[i-1]*arr[i-1];
//        }
//        int right=1;
//        for(int i=arr.length-1;i>=0;i--){
//            newArray[i]=newArray[i]*right;
//            right=right*arr[i];
//        }
//        return newArray;
        int[] prefix=new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];

        }
        int[] suffix=new int[nums.length];
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=prefix[i]*suffix[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] result=productOfArrayBruteforce(arr);
        System.out.println(Arrays.toString(result));

        int[] result2=productOfArrayOptimize(arr);
        System.out.println(Arrays.toString(result2));

    }
}
