public class InsertionSort {
    public static void insert(int arr[]) {
       for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && curr<arr[prev]){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
       }
    }

    public static void print_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 1, 2 };
        insert(arr);
        print_arr(arr);
    }
}