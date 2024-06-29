import  java.util.Scanner;
import  java.util.random.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("old:");
        if (scanner.nextInt() <=1 ){
            System.out.print("lol :)");
            System.out.println("name:");
            scanner.next();
        }else {
            System.out.print("name:");
            scanner.next();
            System.out.println("you were born into a rich family");
            System.out.println("grew up to be a good person");
            System.out.println("one day your family was taken hostage");
            System.out.println("only you are left");
            System.out.println("now you're off to look for your family");
            System.out.println("go to the forest or stay at home?");
            if (scanner.nextInt() == 1){
                System.out.println("you are still alive");
            }else{
                System.out.println("you were killed");
            }

        }

    }
}