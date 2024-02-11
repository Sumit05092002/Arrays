public class FindUnique {
    public static void main(String args[]){
        int arr[]={1,2,1,3,4,3,2};
        int unique=find(arr,arr.length);
        System.out.println("The unique element in the array is "+unique);
    }

    public static int find(int arr[],int size){
        if(size==0){
            System.out.println("The array is empty");
            return -1;
        }else{
            for(int i=0;i<size;i++){
                int flag=0;
                for(int j=0;j<size;j++){
                    if(arr[j]==arr[i]){
                        flag++;
                        if(flag==2){
                            break;
                        }
                    }
                }
                if(flag==1){
                    return arr[i];
                }
            }
            System.out.println("No unique element present in the array");
            return 0;
        }
    }
}
