public class MaxMin{
    public static void main(String args[]){
        int arr[]={21,33,18,20,10};
        int max=max(arr,arr.length);
        System.out.println("The maximum element in array is "+max);
        int min=min(arr,arr.length);
        System.out.println("The minimum element in array is "+min);
    }

    public static int max(int arr[],int size){
        if(size==0){
            System.out.println("size of array is 0");
            return -1;
        }else{
            int max=arr[0];
            for(int i=1;i<size;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
    }

    public static int min(int arr[],int size){
        if(size==0){
            System.out.println("Size of array is 0");
            return -1;
        }else{
            int min=arr[0];
            for(int i=1;i<size;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }
    }
}