import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the limit for your fibonacci series");
        int limit=Sc.nextInt();
       int ans= fibonacci(limit);
       System.out.println(ans);
    }

    public static int fibonacci(int limit){
        if(limit==1){
            return 0;
        }
        if(limit==2){
            return 1;
        }
        int ans=fibonacci(limit-1)+fibonacci(limit-2);
        return ans;
    }
}
