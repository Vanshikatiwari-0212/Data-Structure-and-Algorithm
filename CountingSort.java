public class CountingSort{
    public static void count(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           max=Math.max(max,arr[i]);
        }
        int aux[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            aux[arr[i]]++;
        }
        int t=0;
        for(int i=0;i<aux.length;i++){
            while(aux[i]>0){
                arr[t]=i;
                 aux[i]--;t++;
            }
        }
    }
    public static void pri(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
      int arr[]={3,6,2,3,8,9};
      count(arr);
      pri(arr);
    }
}