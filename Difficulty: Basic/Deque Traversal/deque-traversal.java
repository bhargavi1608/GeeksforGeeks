class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
      deq.forEach(num -> System.out.print(num+" "));
      System.out.println();
    }
}