package pwskills.oopm.ProblemOnOOPs;

import java.util.Arrays;

public class Make_ArrayList {
    public static class Arraylist{
        int arr[] = new int[2];
        int size = 0;
        int indx = 0;
        public void add(int x){
            if(size==arr.length){
                int []brr = Arrays.copyOf(arr,arr.length*2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr,brr.length);
                arr[indx++] = x;
                ++size;
            }else {
                arr[indx++] = x;
                ++size;
            }
        }
        public int size(){
            return size;
        }

    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(40);
        arr.add(15);
        arr.add(15);
        arr.add(15);

        System.out.println(arr.size());
        System.out.println(arr);
    }
}
