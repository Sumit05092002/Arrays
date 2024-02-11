import java.util.Scanner;
public class Count {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the starting point");
        int n=Sc.nextInt();
        counter(n);
    }

    public static void counter(int n){
        if(n==0){
            return;
        }
        counter(n-1);
        System.out.print(n+" ");
    }
}
