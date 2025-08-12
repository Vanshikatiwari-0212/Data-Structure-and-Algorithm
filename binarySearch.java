import java.util.*;
public class binarySearch{

   public static int bS(int a[],int k){
        int s=0;int e=a.length-1;
            while(s<=e){
               int mid=(s+e)/2;
                if(k==a[mid]){
                    return mid;
                }
                else if(k<a[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            return -1;
    }



     public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int k=sc.nextInt();
      int sum=0;
      for(int i=1;i<=k;i++){
        int currs=0;
        for(int j=1;j<=i;j++){
          currs+=j;
        }
        sum+=currs;
      }
      System.out.println(sum);
  
// }
//       int a[]={2,4,8,9,90};
//       int k=90;
    
   
//       System.out.print(bS(a,k)+1);

     

    }
}