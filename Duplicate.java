import java.util.*;
class Duplicate{
    public boolean Duplicate(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
           if(map.containsKey(num)){
            if(Math.abs(i-map.get(num)) <=k){
                return true;
            }
           }
           map.put(num,i);
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicate obj= new Duplicate();
        int arr[]={1,2,3,1};
        int k=3;
        System.out.print(obj.Duplicate(arr,k));
    }
}