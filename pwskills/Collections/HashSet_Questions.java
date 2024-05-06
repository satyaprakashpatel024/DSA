package pwskills.Collections;

import java.util.HashSet;

public class HashSet_Questions {
    public static void ConsecutiveSequence(int []arr){
        HashSet<Integer> s= new HashSet<>();
        for(int i=0; i<arr.length; i++){
            s.add(arr[i]);
        }
        System.out.println(s);
        int max = Integer.MIN_VALUE;
        for(int i : s){
            if(!s.contains(i-1)){
                int currnum = i;
                int currStreak = 1;
                while(s.contains(currnum+1)){
                    currnum++;
                    currStreak++;
                }
                max = Math.max(max, currStreak);
            }
        }
        System.out.println(max);
    }
    public static int MaximunNumberOnTable(int arr[]){
        HashSet<Integer> s = new HashSet<>();
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(s.contains(arr[i])){
                s.remove(arr[i]);
            }else{
                s.add(arr[i]);
                ans = Math.max(ans, s.size());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {100,4,200,1,3,2};
        int arr1[]= {2, 1, 1, 3, 2, 3};
//        ConsecutiveSequence(arr1);
        System.out.println(MaximunNumberOnTable(arr1));
    }
}

