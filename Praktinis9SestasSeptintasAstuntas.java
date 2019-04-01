public class Praktinis9SestasSeptintasAstuntas {
    public static void main(String[] args) {
        System.out.print("Skaiciu nuo 1 iki 100 suma su for sakiniu: ");
        int sum=0;

        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.print(sum);
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.print("Skaiciu nuo 1 iki 100 suma su while sakiniu: ");
        int sum2=0;
        int number=1;
        while(number<=100){
            sum2+=number;
            number++;
        }
        System.out.print(sum2+"\n");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Skaiciu nuo 1 iki 100 suma su do-while sakiniu: ");
        int sum3=0;
        int number1=1;
        do{
            sum3+=number1;
            number1++;
        }while(number1<=100);
        System.out.print(sum3);
    }
}
