
import java.util.Scanner;

public class greetings{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : ");
        String str = sc.nextLine();
        System.out.println("Hey "+str+", Welcome to our club");
    }
}
