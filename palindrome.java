import java.util.*;
class HelloWord{
    static boolean palindrom(int x){
        int num=x;
        int rev=0;
        while(x> 0){
            int digit = x% 10;// to get the last digit(it gives the reminder value)
            rev = rev *10 + digit; // to reverse the string 
            x = x/10;// remove the last digit (Because the variable type is int, and int cannot store decimals )
        }
        System.out.print(rev+);
        return rev == num;
        
    }
    public static void main(String args[]){
        int num=121;
        int num1= 143;
        System.out.println(num+ "  " +palindrom(num));
        System.out.println(num1+ "  "+palindrom(num1));
    }
       
}