import java.util.Scanner;
public class RotateArray{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the no of positions by which you want to shift the elements");
        int k=Sc.nextInt();
        System.out.println("Start entering the values in the array");
        System.out.println("Enter the size of the array");
        int size=Sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Sc.nextInt();
        }
        rotate(arr,size,k);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int arr[],int size,int k){
         k=k%size;
         reverse(arr,0,size-1);
         reverse(arr,0,k-1);
         reverse(arr,k,size-1);
    }

    public static void reverse(int arr[],int s,int e){
        int temp;
        while(s<=e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}