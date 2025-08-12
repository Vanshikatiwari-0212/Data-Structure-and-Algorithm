public class SecLargest{
       public static int  sec_largest(int a[]){
              int max=a[0];
              int sec=Integer.MIN_VALUE;
              for (int i = 1; i<a.length;i++){
                if(a[i]>max){
                    sec=max;
                    max=a[i];
                }else if(a[i]>sec && a[i]<max){
                    sec=a[i];
                }
              }
              return sec;
       }
    public static void main(String [] args) {
         int a[]={2,7,1,8,9};
         System.out.print(sec_largest(a));
}
}