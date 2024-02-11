public class ReverseArray {
    public static void main(String args[]){
        int arr[]={12,45,23,34,10,78};
        System.out.println("Your array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int arr[],int size){
        if(size==0){
            System.out.println("The size of array is 0");
            return;
        }else{
            int start=0;
            int end=size-1;
            int temp;
            while(start<=end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }
}
