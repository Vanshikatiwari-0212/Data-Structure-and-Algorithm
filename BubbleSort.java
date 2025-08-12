
public class BubbleSort {
    public static void sorting(int a[]) {
        for(int turn=0;turn<a.length-1;turn++){
            for(int i=0;i<a.length-turn-1;i++){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
   }
public static void prin(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
         }
         public static void main(String[] args){
           int a[] = {1,45,3,23,7,5};
        sorting(a);
        prin(a);
    }

}
