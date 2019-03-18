public class Pratybos7 {
    public static void main(String[] args){
        String str="A\240b3&4\040";
        System.out.println("Chars: "+str);
        char[] chars=str.toCharArray();
        System.out.print("Char: \t\t");
        for(char z:chars){
            System.out.print("\t\t"+z);
        }
        System.out.println();

        System.out.print("Char: \t\t");
        for(char z:chars){
            System.out.print("\t\t"+(int)z);
        }
        System.out.println();

        System.out.print("isDigit(): \t\t");
        for(char z:chars){
            System.out.print("\t"+Character.isDigit(z));
        }
        System.out.println();

        System.out.print("Letter(): \t\t");
        for(char z:chars){
            System.out.print("\t"+Character.isLetter(z));
        }
        System.out.println();

        System.out.print("isLetterOrDigit(): ");
        for(char z:chars){
            System.out.print("\t"+Character.isLetterOrDigit(z));
        }
        System.out.println();

        System.out.print("isLowerCase():\t");
        for(char z:chars){
            System.out.print("\t"+Character.isLowerCase(z));
        }
        System.out.println();

        System.out.print("isSpaceChar():\t");
        for(char z:chars){
            System.out.print("\t"+Character.isSpaceChar(z));
        }
        System.out.println();

        System.out.print("isUpperCase():\t");
        for(char z:chars){
            System.out.print("\t"+Character.isUpperCase(z));
        }
        System.out.println();

        System.out.print("isWhitespace():\t");
        for(char z:chars){
            System.out.print("\t"+Character.isWhitespace(z));
        }
        System.out.println();
    }
    }


