public class Pratybos6 {
    public static void main(String[] args){
     //   System.out.println("XOR truth table:");
      //  System.out.println("a\t\tb\t\ta^b\nfalse\tfalse\tfalse\nfalse\ttrue\ttrue\ntrue\tfalse\ttrue\ntrue\ttrue\tfalse");

        System.out.println("XOR truth table:");
        System.out.println("a\t\tb\t\ta^b");
    boolean a=false;
    boolean b=false;
    System.out.println(a+"\t"+b+"\t"+(a^b));
         a=false;
         b=true;
    System.out.println(a+"\t"+b+"\t"+(a^b));
         a=true;
         b=false;
        System.out.println(a+"\t"+b+"\t"+(a^b));
         a=true;
         b=true;
        System.out.println(a+"\t"+b+"\t"+(a^b));
    }
}
