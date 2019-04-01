import java.util.Scanner;

public class PraktinisDarbas8 {

    //3 punktas: naudoja return sakini
    public static void returnSakinys(){
        int a=5;
        if(a==0){
            return;
        }else{
            System.out.println("A is not zero.");
        }
        System.out.println("This is not called if a==0, because return exits the method.");
    }

    public static String penktasPunktas() {
int number=3;
if(number==1){
    return "one";
}else if(number==2){
    return "two";
}else if(number==3){
    return "three";
}else{
    return "too much!";
}
    }


    public static void main(String[] args) {

        // 1 punktas
        int x=2;
        if(x>3){
            System.out.println("It's more than three!");
        }else if(x==3){
            System.out.printf("It's equal to three!");
        }else if(x<3){
            System.out.println("It's less than three!");
        }else{
            System.out.println("It might not be a number...");
        }

        // 1 ir 8 punktai, kadangi jie vienodi:
 String baby="dog";
        switch(baby){
            case "boy":
                System.out.println("It's a boy!");
                break;
            case "girl":
                System.out.println("It's a girl!");
                break;
            default:
                System.out.println("Don't be silly, choose a gender!");
                break;
        }


        // 2 punktas
        //for

        String word="AKILBUPSER";
        StringBuilder sb=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        System.out.println(sb.toString());


        //while
        String str="1234";
        int c=str.length()-1;
        while(c>=0){
            System.out.print(str.charAt(c)+" > ");
            c--;
        }
        System.out.print("BOOM!");
        System.out.println();

        int count=0;
        while(count<=8){
            System.out.print("NA ");
            count++;
        }
        System.out.println("BATMAN!!");

        // do-while

        int count2=0;
        do{
            System.out.print("NA ");
            count2++;
        }while(count2<=8);
        System.out.println("BATMAN!!");

    // 3punktas
        //break ir continue
        //suranda pirma lygini skaiciu kuris yra ne 0
        for(int z=0;z<100;z++){
            if(z==0){
                continue;
            }
            if(z%2==0){
                System.out.println(z);
                break;
            }
        }

        //3 punktas, return sakinys:
        returnSakinys();


        // 4 punktas
        //labeled break:
        int[] arr=new int[]{0,1,2,3,4};
        int searchFor=3;
        search:
        for(int i : arr){
            if(arr[i]==searchFor){
                System.out.println("Found it at index: "+arr[i]);
                break search;
            }
            System.out.println("Didn't find anything...");
            System.out.println("This doesnt print out if the searchFor value is found, because labeled break exits for loop.");
        }

        //labeled continue:
        System.out.print("Prints out only odd numbers:");
        label: for(int i=0;i<=8;i++){
            if(i%2==0){
                continue label;
            }
            System.out.print(i+" ");
        }
        System.out.println();

// 5 punktas
        System.out.println(penktasPunktas());

        //6 punktas   3 ir 5 punktai skaitosi kaip atskiri logiski metodai?


        //7 punktas
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your input:");
        if(input.hasNextByte()){
            System.out.println("This input is of type byte.");
        }else if(input.hasNextShort()){
            System.out.println("This input is of type short.");
        }else if(input.hasNextInt()){
            System.out.println("This input is of type int.");
        }else if(input.hasNextLong()){
            System.out.println("This input is of type long.");
        } else if(input.hasNextDouble()){
            System.out.println("This input is of type double.");
        }else if(input.hasNextFloat()){
            System.out.println("This input is of type float");
        }else if(input.hasNextBoolean()){
            System.out.println("This input is of type boolean.");
        }else if(input.hasNext()){
            if(input.next().length()==1){
                System.out.println("This input is of type char.");
            }else{
                System.out.println("This input is of type string.");
            }
        }


    }
}
