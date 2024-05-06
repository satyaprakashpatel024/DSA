package pwskills.Collections;

import java.util.HashMap;

public class CollectionFrameWork {
    static void functionUseHashMap(){
        HashMap<Integer,Integer> m = new HashMap<>();
        int []arr= {6,1,2,3,4,5,1,1,2,5,3,6,4,1,2};
        for(var i:arr){
            if(m.containsKey(i)){
                int x = m.get(i);
                m.put(i,++x);
            }else{
                m.put(i,1);
            }
        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        functionUseHashMap();
    }
}
