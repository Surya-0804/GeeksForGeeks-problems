
// dq : deque in which element is to be pushed
// x : element to be pushed

// Function to push element x to the back of the deque.
  public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
    // Your code here
    dq.addLast(x);
}

// Function to pop element from back of the deque.
  public static void pop_back_ppb(ArrayDeque<Integer> dq) {
    // Your code here
    if(!dq.isEmpty())
        dq.removeLast();
}

// Function to return element from front of the deque.
  public static int front_dq(ArrayDeque<Integer> dq) {
    // Your code here
    if(!dq.isEmpty())
        return dq.getFirst();
    return -1;
}

// Function to push element x to the front of the deque.
  public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
    // Your code here
    dq.addFirst(x);
}
