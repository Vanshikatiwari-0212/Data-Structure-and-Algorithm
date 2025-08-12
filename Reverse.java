public class Reverse{
    public static void rev(int arr[]){
        int l=arr.length-1;
        int f=0;
        while(f<l){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            l=l-1;
            f=f+1;
        }
    }
    public static void main(String[] args){
int arr[]={12,45,3,4,5};
rev(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
}