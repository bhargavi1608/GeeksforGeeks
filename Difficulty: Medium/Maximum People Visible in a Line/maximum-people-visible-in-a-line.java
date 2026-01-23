import java.util.*;

class Solution {
    public int maxPeople(int[] arr) {
        int n = arr.length;
        int[] leftGreater = new int[n];
        int[] rightGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Nearest greater or equal on LEFT
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            leftGreater[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Nearest greater or equal on RIGHT
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            rightGreater[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        int maxVisible = 1;

        for (int i = 0; i < n; i++) {
            int leftCount = i - leftGreater[i] - 1;
            int rightCount = rightGreater[i] - i - 1;
            maxVisible = Math.max(maxVisible, leftCount + rightCount + 1);
        }

        return maxVisible;
    }
}
