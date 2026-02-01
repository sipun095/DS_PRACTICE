package array;

public class MaximumSubarray {
    public static int maxSubarray(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static int maxSubaArrayOptmize(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            if(currentSum<0){
                currentSum=0;
            }
            currentSum=currentSum+arr[i];
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,-6,7,8,-1};
        int result=maxSubarray(arr);
        System.out.println(result);

        System.out.println(maxSubaArrayOptmize(arr));
    }
}
