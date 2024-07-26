import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms in the fibonacci series : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < n; i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+(i < n-1 ? "," : ""));
        }
    }
}