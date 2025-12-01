class myQueue {

    // Constructor
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public myQueue(int n) {
        // Define Data Structures
        capacity = n;
        arr = new int[capacity];
        front=0;
        rear=-1;
        size=0;
       
    }

    public boolean isEmpty() {
        // Check if queue is empty
        if(size==0){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        // Check if queue is full
        if(size==capacity){
            return true;
        }
        return false;
    }
    

    public void enqueue(int x) {
        // Enqueue
        if(isFull()){
            
            return;
        }
        
        rear=(rear+1)%capacity;
        arr[rear]=x;
        size++;
        
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()){
           
            return;
        }
        front = (front+1)%capacity;
        size--;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
          
            return -1;
        }
        return arr[front];
        
    }

    public int getRear() {
        // Get last element
        if(isEmpty()){
           
            return -1;
        }
        return arr[rear];
    }
}
