public class MergeTwoSortedArrays {
    public static void main(String args[]) {
        int arr1[] = { 2,4,6 };
        int arr2[] = { 1, 3, 5, 7, 9 };
        int size3 = arr1.length + arr2.length;
        int arr3[] = new int[size3];
        merge(arr1, arr1.length, arr2, arr2.length, arr3);
        print(arr3, arr3.length);
    }

    public static void merge(int arr1[], int size1, int arr2[], int size2, int arr3[]) {
        int i = 0;
        int j = 0;
        int insert = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] > arr2[j]) {
                arr3[insert] = arr2[j];
                insert++;
                j++;
            } else {
                arr3[insert] = arr1[i];
                insert++;
                i++;
            }
        }
        if(j==size2){
            for (int k = i; k < size1; k++) {
                    arr3[insert] = arr1[k];
                    insert++;
                }
        }else{
            for (int k = j; k < size2; k++) {
                    arr3[insert] = arr2[k];
                    insert++;
                }
        }
    }

    public static void print(int arr3[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
