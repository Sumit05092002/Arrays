public class SwapAlternates {
    public static void main(String args[]){
        int arr[]={1,2,7,8,5};
        int arr1[]={1,2,7,8,5,3};
        System.out.println("The original array is");
        print(arr,arr.length);
        alternate(arr,arr.length);
        print(arr,arr.length);
        System.out.println("The original even array is");
        print(arr1,arr1.length);
        alternate(arr1,arr1.length);
        print(arr1,arr1.length);
    }

    public static void alternate(int arr[],int size){
        if(size==0){
            System.out.println("size of array is 0");
            return;
        }else{
            int temp;
            for(int i=0;i<=size-2;i=i+2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            return;
        }
    }

    public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
