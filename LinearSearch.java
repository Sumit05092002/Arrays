import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int arr[]={54,34,78,97,12};
        System.out.println("Enter the element you want to search for");
        int element=Sc.nextInt();
        int get=linear(arr,arr.length,element);
        System.out.println("THe position of your element is"+get);
    }

    public static int linear(int arr[],int size,int element){
        if(size==0){
            System.out.println("Array is empty");
            return -1;
        }else{
            for(int i=0;i<size;i++){
                if(arr[i]==element){
                    return i;
                }
            }
            System.out.println("Element not found");
            return -1;
        }
    }
}
