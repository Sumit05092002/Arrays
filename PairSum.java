import java.util.Scanner;
public class PairSum {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the sum");
        int sum=Sc.nextInt();
        int arr[]={1,2,3,4,5};
        pair(arr,arr.length,sum);
    }

    public static void pair(int arr[],int size,int sum){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    continue;
                }else{
                    if(arr[i]+arr[j]==sum){
                        if(i<j){
                            System.out.print(+arr[i]+" "+arr[j]);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
