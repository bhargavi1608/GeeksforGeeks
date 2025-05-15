//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0;        // Already at the end
        if (arr[0] == 0) return -1;           // Can't move anywhere

        int jump = 1;                         // First jump starts from index 0
        int max_limit = arr[0];               // Farthest we can reach now
        int current_limit = arr[0];           // Current range of this jump

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1)
                return jump;                  // Reached the end

            max_limit = Math.max(max_limit, i + arr[i]);

            if (i == current_limit) {
                jump++;
                current_limit = max_limit;

                if (current_limit <= i)       // We're stuck, can't move forward
                    return -1;
            }
        }
        return -1;
    }
}
