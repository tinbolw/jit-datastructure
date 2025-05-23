package jit;

/**
 * Jit.
 */
public class Jit<T> implements Comparable<Jit<T>> {
    private ListNode<T> front;
    
    private boolean jat;
    private TreeNode<T> overallRoot;

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
        if (jat) {
            throw new IllegalStateException("Jat");
        }

        overallRoot = fentyLean(overallRoot, front);
        jat = true;
    }

    /*
     * Turns the jit into a ternary jit.
     */
    private TreeNode<T> fentyLean(TreeNode<T> node, ListNode<T> curr) {
        if (curr != null) {
            TreeNode<T> newNode = new TreeNode<T>(curr.data, new TreeNode<T>(curr.data),
                                                  new TreeNode<T>(curr.data),
                                                  new TreeNode<T>(curr.data));
            curr = curr.next;
            newNode.left = fentyLean(newNode.left, curr);
            newNode.middle = fentyLean(newNode.middle, curr);
            newNode.right = fentyLean(newNode.right, curr);
            return newNode;
        } else {
            return null;
        }
    }

    /*
     * Turns the ternary jit into a jit.
     */
    public void leanFenty() {
        if (!jat) {
            throw new IllegalStateException("Not jat");
        }

        jat = false;
        overallRoot = null;
    }

    /**
     * "M'jacks" the jit by reversing it.
     */
    public void mjacking() {
        if (jat) {
            throw new IllegalStateException("jat");
        }

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
        // TODO implement this if jat
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
        if (!jat) {
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
        } else {
            return toString(overallRoot);
            // return "\nfented";
        }
    }

    private String toString(TreeNode<T> node) {
        if (node == null) {
            // String result = "\t";
            // for (int i = 0; i < level; i ++) {
            //     result += "\t";
            // }
            return "null";
            // return "null";
        } else {
            // System.out.println(node.data);
            // System.out.println();
            // if (node.left != null) {
            //     System.out.print(node.left.data + " ");
            // }
            // if (node.middle != null) {
            //     System.out.print(node.middle.data + " ");
            // }
            // if (node.right != null) {
            //     System.out.print(node.right.data + " ");
            // }

            // toString(node.left);
            // toString(node.middle);
            // toString(node.right);
            // System.out.println();
            String result = "";
            // 4
            // 3 3 3
            // 2 2 2 2 2 2 2 2 2
            
            result += node.data;

            result += "\t" + toString(node.left);
            result += "\t" + toString(node.middle);
            // if (indented) {
            //     result += "\t";
            // }
            result += "\t" + toString(node.right) + "\n";
            // if (indented) {
            //     result += "\t";
            // }
            return result;
        }
    }

    // 2    1   null null null
    //      1   null null null
    //      1   null null null
    //

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
        public TreeNode<T2> middle;
        public TreeNode<T2> right;

        // Constructs a leaf node with the given data.
        public TreeNode(T2 data) {
            this(data, null, null, null);
        }

        // Constructs a leaf or branch node with the given data and links.
        public TreeNode(T2 data, TreeNode<T2> left, TreeNode<T2> middle, TreeNode<T2> right) {
            this.data = data;
            this.left = left;
            this.middle = middle;
            this.right = right;
        }
  }
}