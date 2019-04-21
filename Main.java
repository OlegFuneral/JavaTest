
import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print any number from 0 to 9");
        int A = in.nextInt();
        
        if (A == 1 ) {
        System.out.println("....11...");
        System.out.println("..1.11...");
        System.out.println("....11...");
        System.out.println("....11...");
        System.out.println("..11111..");

        }
        else if (A == 2) {
        System.out.println("...222...");
        System.out.println("..2..22..");
        System.out.println("....22...");
        System.out.println("..22.....");
        System.out.println("..22222..");

        }
        else if (A == 3) {
        System.out.println("...333...");
        System.out.println(".33...33.");
        System.out.println(".....33..");
        System.out.println(".33...33.");
        System.out.println("...333...");

        }
        else if (A == 4) {
        System.out.println("..44..44.");
        System.out.println("..44..44.");
        System.out.println("..444444.");
        System.out.println("......44.");
        System.out.println("......44.");

        }
        else if (A == 5) {
        System.out.println("..55555..");
        System.out.println("..55.....");
        System.out.println("..55555..");
        System.out.println(".....555.");
        System.out.println("..55555..");

        }
        else if (A == 6) {
        System.out.println("..66666..");
        System.out.println(".66......");
        System.out.println(".666666..");
        System.out.println(".66...66.");
        System.out.println("..66666..");

        }
        else if (A == 7) {
        System.out.println(".7777777.");
        System.out.println(".....77..");
        System.out.println("....77...");
        System.out.println("...77....");
        System.out.println("..77.....");

        }
        else if (A == 8) {
        System.out.println("..88888..");
        System.out.println(".88...88.");
        System.out.println("..88888..");
        System.out.println(".88...88.");
        System.out.println("..88888..");

        
        }
        else if (A == 9){
        System.out.println("..99999..");
        System.out.println(".99...99.");
        System.out.println("..999999.");
        System.out.println("......99.");
        System.out.println("..99999..");
        }

        else if (A == 0){
        System.out.println("..00000..");
        System.out.println(".00...00.");
        System.out.println(".00...00.");
        System.out.println(".00...00.");
        System.out.println("..00000..");
        
        }  
        
        else {
        System.out.println("..OOOOO..........OOOOO..");
        System.out.println(".OO...OO........OO...OO.");
        System.out.println(".OO...OO........OO...OO.");
        System.out.println(".OO...OO........OO...OO.");
        System.out.println("..OOOOO..OOOOOO..OOOOO..");  
        }
    }
}
