package ocaJavaSE8.p4.stringsAndArrays;

public class StringsInAction {

    public static void main(String args[]) {
        
        StringBuilder b1 = new StringBuilder("snookler");
        StringBuilder b2 = new StringBuilder("yoodler");
        
        System.out.print("b1= " + b1.append(b2.substring(2,5).toUpperCase()));
        System.out.println(" b2= " + b2);
        System.out.print("b2= " + b2.insert(3, b1.append("a")));
        System.out.println(" b1= " + b1);
        System.out.print("b1= " + b1.replace(3, 4, b2.substring(4)).append(b2.append(false)));
        System.out.println(" b2= " + b2);
    }
}
