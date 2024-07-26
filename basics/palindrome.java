import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        int length = str.length();
        int flag = 0;
        for(int i = 0; i < length / 2 ; i++){
            if(str.charAt(i) != str.charAt(length - i - 1)){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
