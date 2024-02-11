public class AddArray{
    public static void main(String args[]){
        int arr1[]={4,7,8};
        int arr2[]={8};
        add(arr1,arr2,arr1.length,arr2.length);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }

    public static void add(int arr1[],int arr2[],int size1,int size2){
        int i=size1-1;
        int j=size2-1;
        int sum=0;
        while(i>=0&&j>=0){
            int carry=sum/10;
            sum=arr1[i]+arr2[j]+carry;
            arr1[i]=sum%10;
            i--;
            
        }
    }
}