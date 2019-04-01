import java.util.Scanner;

public class PraktinisDarbas9Pirmas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Iveskite teigiamus skaicius.");

        System.out.println("Iveskite krastine a:");
        String aEntered=input.next();

        System.out.println("Iveskite krastie b:");
        String bEntered=input.next();

        System.out.println("Iveskite krastine c:");
        String cEntered=input.next();

        StringBuilder sba=new StringBuilder();
        StringBuilder sbb=new StringBuilder();
        StringBuilder sbc=new StringBuilder();

        //patikrinti ar ivede skaicius:
        for(int ia=0;ia<aEntered.length();ia++){
            if(ia==0){
                if(Character.isDigit(aEntered.charAt(ia))){
                    sba.append(aEntered.charAt(ia));
                }else{
                    sba.replace(0,ia,"");
                    break;
                }
            }else if(Character.isDigit(aEntered.charAt(ia)) || aEntered.charAt(ia)=='.'){
                sba.append(aEntered.charAt(ia));
            }else{
                sba.replace(0,ia,"");
                break;
            }
        }

        for(int ib=0;ib<bEntered.length();ib++){
            if(ib==0){
                if(Character.isDigit(bEntered.charAt(ib))){
                    sbb.append(bEntered.charAt(ib));
                }else{
                    sbb.replace(0,ib,"");
                    break;
                }
            }else if(Character.isDigit(bEntered.charAt(ib)) || bEntered.charAt(ib)=='.'){
                sbb.append(bEntered.charAt(ib));
            }else{
                sbb.replace(0,ib,"");
                break;
            }
        }

        for(int ic=0;ic<cEntered.length();ic++){
            if(ic==0){
                if(Character.isDigit(cEntered.charAt(ic))){
                    sbc.append(cEntered.charAt(ic));
                }else{
                    sbc.replace(0,ic,"");
                    break;
                }
            }else if(Character.isDigit(cEntered.charAt(ic)) || cEntered.charAt(ic)=='.'){
                sbc.append(cEntered.charAt(ic));
            }else{
                sbc.replace(0,ic,"");
                break;
            }
        }

        String aStr=sba.toString();
        String bStr=sbb.toString();
        String cStr=sbc.toString();
        double a=0.0;
        double b=0.0;
        double c=0.0;

        if(aStr.equals("") || bStr.equals("") || cStr.equals("")){
            System.out.println("Neteisingai ivestos krastines.");
            System.exit(-1);
        }else{
            a=Double.parseDouble(aStr);
            b=Double.parseDouble(bStr);
            c=Double.parseDouble(cStr);
        }
if(a==0.0 || b==0.0 || c==0.0){
    System.out.println("Krastines negali buti lygios 0.");
    System.exit(-1);
}
        if(c*c==a*a+b*b){
            System.out.println("Sis trikampis status.");
        }else{
            System.out.println("Sis trikampis nera status.");
        }

    }
}
