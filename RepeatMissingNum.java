import java.util.Arrays;
public class RepeatMissingNum {
    public static void printN(int nums[]){
       Arrays.sort(nums);
       int a=0,b=0;
       for(int i=1;i<nums.length-1;i++){
        if(nums[i+1]-nums[i]==0){
            a=nums[i];
        }
        else if(nums[i+1]-nums[i]==2){
           b=nums[i]+1;
        }
       }
       System.out.println(a+"  "+b);
      
    }
    public static void main(String[] args) {
        int nums[]={3, 1, 2, 5 ,3};
        printN(nums);
    }
}
