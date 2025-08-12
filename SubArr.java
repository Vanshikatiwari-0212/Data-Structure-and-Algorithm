public class SubArr{
   
    public static void sub(int arr[]){
      
     for(int i=0;i<arr.length;i++){//start
            for(int j=i;j<arr.length;j++){//end
         
                for(int c=i;c<=j;j++){
                    System.out.print(arr[c]+" ");
                 
                }
                
                System.out.println();
            }
            System.out.println();
        }
    }
       
    public static void main(String[] args){
        int arr[]={2,4,3,6,7};
        sub(arr);
    }
}