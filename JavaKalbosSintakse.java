import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;

public class JavaKalbosSintakse {
    //class variable:
    static byte by=126;

    // instance variable:
    public int c=123456;
    public static void main(String args[]){

        //local variables:
        short sh=32766;
        long lo=1234567;
        float fl=0.3f;
        double d=0.36;
        boolean bo=true;
        char ch='a';
        int in=123456;
        //string su special simboliais
        String str="This is \n a random \t string";

        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(d);
        System.out.println(bo);
        System.out.println(ch);

        //System.out.println(sh-in);
        System.out.println(d+sh);
        System.out.println(lo/by);
       // System.out.println(in*d);

        //eiliskumas
        boolean tru=!(10%2==0 && 5*3>10)||(3!=5);
        System.out.println(tru);

        //keliu tipu kintamieji viename reiskinyje
        double doo=sh+d;
        System.out.println(doo);

        boolean fal=tru && sh>lo;
        System.out.println(fal);
    }


}
