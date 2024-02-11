import java.util.Scanner;
public class Power {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the 2's power");
        int power=Sc.nextInt();
        int ans=pow(power);
        System.out.println("The answer is "+ans);
    }

    public static int pow(int n){
        if(n==0){
            return 1;
        }
        int ans=pow(n-1);
        int myans=2*ans;
        return myans;
    }
}
