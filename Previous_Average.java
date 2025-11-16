class Previous_Average{
    public static int Previous_Average(int[] arr){
        int count=1;
        int sum=arr[0];
        int number =0;
        int prev_average= (arr[0])/count;
        for(int i=1;i<arr.length;i++){
             if(arr[i]>prev_average){
            number++;
           }
            sum +=arr[i];
             count++;
          int  average =sum/count ;
           prev_average = average;
       }
        return number;
    }
    public static void main(String[] args){
       Previous_Average obj=new Previous_Average();
       int[] arr={100,200,150,300,50};
       System.out.println(obj.Previous_Average(arr));
    }
}