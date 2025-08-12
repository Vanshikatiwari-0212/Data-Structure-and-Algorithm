public class pairs{
    public static int p(int arr[]){
    //no. of pairs can found by (n(n-1))/2 
    //formula where n length of array

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
        return 0;

    }
    public static void main(String[] args){
           int arr[]={2,45,6,4,6};
            p(arr);
    }
}