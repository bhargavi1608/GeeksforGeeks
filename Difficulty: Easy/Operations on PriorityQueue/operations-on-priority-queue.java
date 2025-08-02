// Helper class Geeks to implement
// insert() and findFrequency()
class Geeks {

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k) {

        // Your code here
        q.add(k);
        // Just insert k in q and don't return anything
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {

        
        // Your code here
        // If k is in q return true else return false
        if(q.contains(k)){
            return true;
        }else{
            return false;
        }
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q) {
     
         int max=Integer.MIN_VALUE;
         for(int x:q){
             if(x>max){
                 max=x;
             }
         }

        q.remove(max);
        return max;
        // Your code here
        // Delete the max element from q. The priority queue property might be useful
        // here
    }
}