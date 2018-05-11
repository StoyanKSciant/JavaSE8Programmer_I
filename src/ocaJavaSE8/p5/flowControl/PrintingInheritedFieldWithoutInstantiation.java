package ocaJavaSE8.p5.flowControl;

class Super { static String ID = "QBANK"; }

class Sub extends Super{
   static { System.out.print("In Sub"); }
   Sub(){
	   System.out.println("Sub is born");
   }
}

public class PrintingInheritedFieldWithoutInstantiation{
   public static void main(String[] args){
      System.out.println(Sub.ID);
   }
}
