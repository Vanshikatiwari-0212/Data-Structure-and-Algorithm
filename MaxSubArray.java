public class MaxSubArray {
    // Brute Force
    public static void maxS(int arr[]) {

        int maxSu = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int s = i;
            for (int j = i; j < arr.length; j++) {
                int e = j;
                int currSum = 0;
                for (int k = s; k <= e; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxSu < currSum) {
                    maxSu = currSum;
                }
            }
        }
        System.out.println("Maximum Sum :" + maxSu);
    }

    // PREFIX SUM
    public static void prefic(int arr[]) {
     int temp[]=new int[arr.length];
     temp[0]=arr[0];
     for(int i=1;i<arr.length;i++){
        temp[i]=temp[i-1]+arr[i];
     }
int maxSum=0;
for(int i=0;i<arr.length;i++){
    int currSum=0;
    for(int j=i;j<arr.length;j++){
           currSum= i==0?temp[j]:temp[j]-temp[i-1];
    }
    if(currSum>maxSum)
       maxSum=currSum;   
}
System.out.println("Prefix: "+maxSum);
    }

    // // KANDANE'S Algo
    public static void kad(int arr[]) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
              cs=cs+arr[i];
              if(cs<0){
                 cs=0;
              }
              ms=Math.max(cs,ms);
        }
        System.out.println("Kadane: "+ms);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -2, -3, -4 ,-9};
        maxS(arr);
        prefic(arr);
        kad(arr);
    }
}