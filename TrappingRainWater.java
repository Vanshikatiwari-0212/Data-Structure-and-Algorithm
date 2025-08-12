public class TrappingRainWater{
    public static void trap(int heigth[]){

        int leftMax[]=new int[heigth.length];
        leftMax[0]=heigth[0];
        for(int i=1;i<heigth.length;i++){
         leftMax[i]=Math.max(leftMax[i-1],heigth[i]);
        }

        int rightMax[]=new int [heigth.length];
        rightMax[heigth.length-1]=heigth[heigth.length-1];
        for(int i=heigth.length-2;i>=0;i--){
         rightMax[i]=Math.max(rightMax[i+1],heigth[i]);
        }

        int trapwater=0;
        for(int i=0;i<heigth.length;i++){
            trapwater=trapwater+(Math.min(leftMax[i],rightMax[i])-heigth[i]);
        }

    
   
     System.out.println("Total area where the water trapped is:"+trapwater);
    }
    public static void main(String[] args){
              int heigth[]={4,2,0,6,3,2,5};
              trap(heigth); 
    }
}