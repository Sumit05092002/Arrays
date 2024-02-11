public class MoveZeroes {
    public static void main(String args[]){
        int arr[]={0,1,0,3,12};
        sortZero(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sortZero(int arr[],int size){
        for(int i=size-1;i>=0;i--){
            if(arr[i]==0){
                //int target=1;
                for(int j=i;j<size-1;j++){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
