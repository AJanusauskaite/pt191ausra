public class Praktinis9KetvirtasIrPenktas {
    public static void main(String[] args) {
        System.out.println("y=3x, x dideja nuo 0 iki 10 su for sakiniu:");
        int y =0;
        for(int x=0;x<=10;x++){
            y=3*x;
            System.out.print("y = 3*");
            System.out.print(x+" = "+y);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("y=3x, x dideja nuo 0 iki 10 su while sakiniu:");
        int y2 =0;
        int x=0;
        while(x<=10){
            y2=3*x;
            System.out.print("y = 3*");
            System.out.print(x+" = "+y2);
            System.out.println();
            x++;
        }
    }
}
