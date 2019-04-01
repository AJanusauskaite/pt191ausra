public class Praktinis9Desimtas {
    public static void main(String[] args) {

        for(int y=0;y<=100;y++) {
            if(y==0){
                System.out.print("*  |\t\t");
            }else{
                System.out.print(y+"  |\t\t");
            }

            for (int x = 1; x <= 100; x++) {
               if(y==0){
                   System.out.print(x + "\t\t");
               }else{
                   System.out.print(x*y+"\t\t");
               }
            }
            System.out.print("\n");
        }


    }
}
