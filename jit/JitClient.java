package jit;

/**
 * Hypothetical Jit implementation.
 */
public class JitClient {
    public static void main(String[] args) {
        System.out.println("Hello, jit!");
        Jit<Integer> jit = new Jit<>();
        System.out.print("New jit: " + jit);
        System.out.println("  <-- Fill it!! fill it!!!!!!!!!");
        jit.jit(1);
        jit.jit(2);
        jit.jit(3);
        jit.jit(4);
        System.out.println("Filled jit: " + jit);
        System.out.println("M'jack it.");
        jit.mjacking();
        System.out.println("jit: " + jit);
        
        jit.fentyLean();
        System.out.println("fented: " + jit);
    }
}
