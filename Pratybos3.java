import java.io.*;
import java.util.Arrays;

public class Pratybos3 {
    public static void main(String[] args){
       char[] data=new char[]{'p','r','o','g','r','a','m','m','i','n','g'};
        System.out.println(data);
        String upper="";
        for(int i=0; i<data.length;i++){
         upper+=data[i];
        }
        System.out.println(upper.toUpperCase());
    }
}
