package array;

import java.util.HashSet;
import java.util.Set;

public class ContainedDuplicateII {
    public static boolean containDuplicate(int[] arr,int k){
        if(arr.length<2){
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(j-i<=k){
                        return true;
                    }
                }
            }

        }
        return false;
    }
    public static boolean containDuplicateOptimise(int[] arr,int k){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
            if(i>=k){
                set.remove(arr[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={4,2,3,4,5,7,8};
        int k=2;
        boolean result=containDuplicate(arr,k);
        System.out.println(result);
        boolean result2=containDuplicateOptimise(arr,k);
        System.out.println(result2);

    }
}
