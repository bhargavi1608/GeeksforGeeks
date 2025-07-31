class Solution {
    public static void operators(int a, int b, int c) {
        // code here
        int d=a^a;
        int e = c^b;
        int f = a&b;
        int g=c|d;
        e=~e;
        System.out.println(d+" "+e+" "+f+" "+g+" ");
    }
}
