import java.util.*;
class Anagram{
    public int[] duplicate(int[] arr){
        HashSet<Integer>set = new HashSet<>();
        for(int num: arr){
            set.add(num);// adds only unique elements
        }
        int[] arr1= new int[set.size()];
        int i=0;
        for(int num:set){
            arr1[i++]=num;
        }
        return arr1;
    }
    public static void main(String[] args){
        Anagram obj= new Anagram();
        int[] arr={1,1,2,3,3,4};
        int[] result =obj.duplicate(arr); 
        for(int n:result){
            System.out.println(n);
        }
        //   System.out.println(result);
    }
}