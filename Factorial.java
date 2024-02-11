
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no whose factorial you want to calculate");
        int n=Sc.nextInt();
        int fact=fact(n);
        System.out.println("The facorial is "+fact);
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int myans=n*fact(n-1);
        return myans;
    }
}
