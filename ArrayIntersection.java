public class ArrayIntersection {
    public static void main(String args[]){
        int arr1[]={1,2,2,2,3,4};
        int arr2[]={2,2,3,3};
        intersection(arr1,arr2,arr1.length,arr2.length);
    }
//approach1
    // public static void intersection(int arr1[],int arr2[],int size1,int size2){
    //     int flag=0;
    //     for(int i=0;i<size1;i++){
    //         for(int j=flag;j<size2;j++){
    //             if(arr1[i]==arr2[j]){
    //                 System.out.print(arr2[j]+" ");
    //                 flag++;
    //                 break;
    //             }
    //         }
    //     }
    // }

    //approach2
    public static void intersection(int arr1[],int arr2[],int size1,int size2){
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr1[i]<arr2[j]){
                    break;
                }else if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=-1;
                    break;
                }else{
                    System.out.println("No common elements");
                }
            }
        }
    }
}
