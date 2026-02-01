package array;

public class FindMinimumRotatedSortedArray {
    public static int minSortedArray(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i]);

        }
        return min;
    }
    //logn   binary search
    public static int minSortedArrayOptmize(int[] arr){
        int left=0;
        int right=arr.length-1;
        int result=arr[0];
        while(left<=right){
            if(arr[left]<=arr[right]){
                result=Math.min(result,arr[left]);
            }
            int mid=(left+right)/2;
            result=Math.min(result,arr[mid]);
            if(arr[left]<=arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2,3};
        System.out.println(minSortedArray(arr));
        System.out.println(minSortedArrayOptmize(arr));
    }
}
