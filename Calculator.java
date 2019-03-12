import java.sql.SQLOutput;
import java.text.DecimalFormat;
public class Calculator {

    public static void main(String [] args){
        DecimalFormat df = new DecimalFormat("0.0000");

        if ((args.length)==3){
            double num1=Double.parseDouble(args[0]);
            double num2=Double.parseDouble(args[2]);

            if(args[1].equals("+")){
                double result=num1+num2;
              System.out.println(num1+" + "+num2+" = "+df.format(result));
             }else if(args[1].equals("-")){
                double result = num1-num2;
                System.out.println(num1+" - "+num2+" = "+df.format(result));
            }else if(args[1].equals("*")){
                double result = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+df.format(result));
            }else if (args[1].equals("/")){
                double result = num1/num2;
                System.out.println(num1+" / "+num2+" = "+df.format(result));
            }else if (args[1].equals("pow")){
                double result=Math.pow(num1, num2);
                System.out.println(num1+" taken to the power of "+num2+" is "+df.format(result));
            }else if(args[1].equals("proc")){
                double result = (num1/100)*num2;
                System.out.println(num1+" percent of "+num2+" is "+df.format(result));
            }else if(args[1].equals("modulo")){
                double result = num1%num2;
                System.out.println(num1+" / "+num2+" modulo is "+df.format(result));
            }
        }else if(args.length==2){
            double numb=Double.parseDouble(args[1]);
            if(args[0].equals("sqrt")){
                double result=Math.sqrt(numb);
                System.out.println("Square root of "+numb+" is "+df.format(result));
            }else if(args[0].equals("square")){
                double result=numb*numb;
                System.out.println(numb+" squared is "+df.format(result));
            }else if(args[0].equals("sin")){
                double result=Math.sin(numb);
                System.out.println("sin of "+numb+" is "+ df.format(result));
            }else if(args[0].equals("tan")){
                double result=Math.tan(numb);
                System.out.println("tan of "+numb+" is "+df.format(result));
            }else if(args[0].equals("cos")){
                double result=Math.cos(numb);
                System.out.println("cos of "+numb+" is "+df.format(result));
            }else if (args[0].equals("ctg")){
                double result=1/Math.tan(numb);
                System.out.println("cotangent of "+numb+" is "+df.format(result));
            }
        }
    }
}
