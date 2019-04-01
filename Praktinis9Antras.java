import java.text.DecimalFormat;
import java.util.Scanner;

public class Praktinis9Antras {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Iveskite reiksme a:");
        String inputA=input.next();
        System.out.println("Iveskite reiksme b:");
        String inputB=input.next();
        System.out.println("Iveskite reiksme c:");
        String inputC=input.next();

        //patikrinti ar irase skaiciu:
        StringBuilder sbA=new StringBuilder();
        StringBuilder sbB=new StringBuilder();
        StringBuilder sbC=new StringBuilder();

        for(int ia=0;ia<inputA.length();ia++){
            if(ia==0){
                if(Character.isDigit(inputA.charAt(ia)) || inputA.charAt(ia)=='-'){
                    sbA.append(inputA.charAt(ia));
                }else{
                    sbA.replace(0,ia,"");
                }
            }else{
                if(Character.isDigit(inputA.charAt(ia)) || inputA.charAt(ia)=='.'){
                    sbA.append(inputA.charAt(ia));
                }else{
                    sbA.replace(0,ia,"");
                }
            }
        }

        for(int ib=0;ib<inputB.length();ib++){
            if(ib==0){
                if(Character.isDigit(inputB.charAt(ib)) || inputB.charAt(ib)=='-'){
                    sbB.append(inputB.charAt(ib));
                }else{
                    sbB.replace(0,ib,"");
                }
            }else{
                if(Character.isDigit(inputB.charAt(ib)) || inputB.charAt(ib)=='.'){
                    sbB.append(inputB.charAt(ib));
                }else{
                    sbB.replace(0,ib,"");
                }
            }
        }

        for(int ic=0;ic<inputC.length();ic++){
            if(ic==0){
                if(Character.isDigit(inputC.charAt(ic)) || inputC.charAt(ic)=='-'){
                    sbC.append(inputC.charAt(ic));
                }else{
                    sbC.replace(0,ic,"");
                }
            }else{
                if(Character.isDigit(inputC.charAt(ic)) || inputC.charAt(ic)=='.'){
                    sbC.append(inputC.charAt(ic));
                }else{
                    sbC.replace(0,ic,"");
                }
            }
        }

        //paversti input'us i double

        String stra= sbA.toString();
        String strb=sbB.toString();
        String strc=sbC.toString();

        double a=0.0;
        double b=0.0;
        double c=0.0;

        if(stra.equals("") || strb.equals("") || strc.equals("")){
            System.out.println("Neteisingai ivestos reiksmes.");
            System.exit(-1);
        }else{
             a=Double.parseDouble(stra);
             b=Double.parseDouble(strb);
             c=Double.parseDouble(strc);
        }

        System.out.println("Reiksme a: "+a+"\nReiksme b: "+b+"\nReiksme c: "+c);

        //skaiciuoti diskriminanta:
        DecimalFormat f = new DecimalFormat("##.00");
        double d=b*b-4*a*c;
        System.out.print("Diskriminantas yra: ");
        System.out.print(f.format(d));
    }
}
