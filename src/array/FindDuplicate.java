package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static boolean isDuplicateContainBruteForce(int[] arr){
        if(arr.length<2){
            return false;
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isDuplicateConatinOptimize(int[] arr){
        if(arr.length<2){
            return false;
        }
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static boolean isDuplicateContainOptimizeII(int[] arr){

        for(int i=1;i<arr.length-1;i++){
        if(arr[i]==arr[i-1]){
            return true;
        }
        }
        return false;
    }
    public static int[] findTheDuplicate(int[] arr){
        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                duplicate.add(arr[i]);
            }
            set.add(arr[i]);
        }
        return duplicate.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,1,1,2,2};
        boolean result=isDuplicateContainBruteForce(arr);
        System.out.println(result);

        boolean result2=isDuplicateConatinOptimize(arr);
        System.out.println(result);

        int[] result3=findTheDuplicate(arr);
        System.out.println(Arrays.toString(result3));


    }
}
