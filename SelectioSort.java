public class SelectioSort {
    public static void selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int small=i;
            for(int j=i+1;j<a.length;j++){
                if(a[small]>a[j]){
                    small=j;
                }
            }
            int temp=a[small];
            a[small]=a[i];
            a[i]=temp;
        }
    } 
    static public void print(int a[]){
 for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
 }
    }
    public static void main(String [] args){
int a[]={5,4,3,1,2};
selectionSort(a);
print(a);
    }
    
}
