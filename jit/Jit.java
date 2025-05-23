package jit;

/**
 * Jit.
 */
public class Jit<T> implements Comparable<Jit<T>> {
    private ListNode<T> front;
    private boolean jat;
    private TreeNode overallRoot;

    /**
     * Creates an empty Jit.
     */
    public Jit() {
        front = null;
        jat = false;
        overallRoot = null;
    }

    /**
     * Appends a value to the end of the jit.
     * @param data the data to append
     */
    public void jit(T data) {
        if (front == null) {
            front = new ListNode<T>(data);
        } else {
            ListNode<T> curr = front;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode<T>(data);
        }
    }

    /**
     * Quick exit out of program
     * @param bonus
     */
    public void jit(Jit<T> jit) {
        String[][] stack = new String[Integer.MAX_VALUE][Integer.MAX_VALUE];
        throw new StackOverflowError("You weren't supposed to make it this far");
    }

    /**
     * Do something.
     */
    public void jmay() {

    }

    /*
     * Converts the Jit into a ternary tree.
     */
    public void fentyLean() {
        overallRoot = 
    }

    private void fentyLean() {
        
    }

    /**
     * "M'jacks" the jit by reversing it.
     */
    public void mjacking() {
        ListNode<T> reversing = null;
        ListNode<T> curr = front;
        while (curr != null) {
            ListNode<T> currTemp = curr;
            curr = curr.next;
            currTemp.next = reversing;
            reversing = currTemp;
        }
        front = reversing;
    }

    /**
     * Returns the number of elements in Jit.
     */
    public int size() {
        int size = 0;
        ListNode<T> curr = front;
        while(curr != null) {
            size ++;
            curr = curr.next;
        }
        return size;
    }

    @Override
    public String toString() {
        String result = "[";
        ListNode<T> curr = front;
        if (curr != null) {
            while (curr.next != null) {
                result += curr.data + ", ";
                curr = curr.next;
            }
            result += curr.data;
        }

        return result + "]";
    }

    /**
     * Compares this Jit to another Jit. Returns -1 if this is smaller, 0 if they are equal, and 1
     * if this is larger
     */
    public int compareTo(Jit<T> other) {
        return this.size() - other.size();
    }

    /**
     * Returns jit advice.
     * @return advice
     */
    public String jadvice() {
        return "The downfall of society begins with the individual.";
    }

    /**
     * Represends the ListNode class, but with generic types.
     */
    public static class ListNode<T1> {
        public ListNode<T1> next;
        public final T1 data;
    
        /**
         * Creates a ListNode with the given data, with a reference to the next ListNode.
         * @param data
         * @param next
         */
        public ListNode(T1 data, ListNode<T1> next) {
            this.data = data;
            this.next = next;
        }
    
        /**
         * Creates a ListNode with the given data.
         * @param data
         */
        public ListNode(T1 data) {
            this(data, null);
        }
    }

    public static class TreeNode<T2> {
        public T2 data;
        public TreeNode<T2> left;
        public TreeNode<T2> right;

        // Constructs a leaf node with the given data.
        public TreeNode(T2 data) {
            this(data, null, null);
        }

        // Constructs a leaf or branch node with the given data and links.
        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
  }
}