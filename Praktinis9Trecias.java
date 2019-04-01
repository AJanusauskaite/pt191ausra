import java.util.Random;
import java.util.Scanner;

public class Praktinis9Trecias {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Choose your number from 0 to 100:");
        String entered=input.next();

        StringBuilder sb=new StringBuilder();

        //patikrinti ar ivede skaiciu
        for(int i=0;i<entered.length();i++){
            if(Character.isDigit(entered.charAt(i))){
                sb.append(entered.charAt(i));
            }else{
                sb.replace(0,i,"");
                break;
            }
        }

        //paversti String Builder i skaiciu:
        String str=sb.toString();
        int userGuess=0;
        if(str.equals("")){
            System.out.println("Number not found.");
            System.exit(-1);
        }else{
            userGuess=Integer.parseInt(str);
        }

        //patikrinti ar skaicius <=100
        if(userGuess>100){
            System.out.println("You entered a number greater than 100! Try again.");
            System.exit(-1);
        }

        //sukurti kompiuterio spejima
        Random random=new Random();
        int pcGuess=random.nextInt(100);
        System.out.print("The number is: ");
        System.out.println(pcGuess+"\n");

        //patikrinti ar vartotojas atspejo:
        if(userGuess==pcGuess){
            System.out.println("You guessed correctly!");
        }else{
            System.out.println("You missed...");
        }
    }
}
