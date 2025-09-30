// User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

// User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val = data;
        next = null;
    }
}
*/

class Solution {
    // Function to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to find nearest prime
    private int nearestPrime(int num) {
        if (num <= 1) return 2;       // smallest prime
        if (isPrime(num)) return num; // already prime

        int left = num - 1, right = num + 1;
        while (true) {
            if (left >= 2 && isPrime(left)) return left;
            if (isPrime(right)) return right;
            left--;
            right++;
        }
    }

    // Main function
    Node primeList(Node head) {
        Node curr = head;
        while (curr != null) {
            curr.val = nearestPrime(curr.val); // replace with nearest prime
            curr = curr.next;
        }
        return head;
    }
}
