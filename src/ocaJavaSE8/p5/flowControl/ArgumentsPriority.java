package ocaJavaSE8.p5.flowControl;

// Widening >> boxing/unboxing >> var-args

// Widening is preferred to boxing/unboxing , which in turn,
// is preferred over var-args.

public class ArgumentsPriority {
    void probe(int... x) {
        System.out.println("In ...");
    }

    void probe(Integer x) {
        System.out.println("In Integer");
    }

    void probe(long x) {
        System.out.println("In long");
    }

    void probe(Long x) {
        System.out.println("In LONG");
    }

    public static void main(String[] args) {

        Integer a = 4;
        new ArgumentsPriority().probe(a);
        int b = 4;
        new ArgumentsPriority().probe(b); // Widening is preferred to boxing/unboxing
    }
}