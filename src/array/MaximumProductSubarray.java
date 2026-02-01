package array;

public class MaximumProductSubarray {
    public static int maxProductSubarray(int[] arr) {
        int maxProduct = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product = product * arr[j];
                maxProduct = Math.max(product, maxProduct);
            }
        }
        return maxProduct;
    }
    public static int maxProductSubarrayOptmize(int[] arr){
        int min=arr[0];
        int max=arr[0];
        int maxSubarray=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i],Math.max(arr[i]*max,arr[i]*min));
            min=Math.min(arr[i], Math.min(arr[i]*max,arr[i] *min));
            maxSubarray=Math.max(maxSubarray,max);

        }
        return maxSubarray;
    }
    public static void main(String[] args) {
        int [] arr={4,6,-8,9,7,6,0};
        System.out.println(maxProductSubarray(arr));
        System.out.println(maxProductSubarrayOptmize(arr));
    }
}
