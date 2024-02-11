public class SortZeroOne {
    public static void main(String args[]){
        int arr[]={12,10,18,76,8};
        sort(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[],int size){
        int start=0;
        int end=size-1;
        int temp;
        while(start<=end){
            if(arr[start]>arr[end]){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }else if(arr[start]<arr[end]){
                start++;
                end--;
            }else{
                end--;
            }
        }
    }
}
