//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int count=0;
       n=Math.abs(n);
       if(n==0) System.out.println(-1);
       while(n>0){
           n/=10;
           count++;
       }
       System.out.println(count);
       
    }
}