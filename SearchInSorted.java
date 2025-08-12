public class  SearchInSorted{
    
        //public static int search(int[] nums, int target) {
          //  int si=0;
           // int ei=nums.length-1;
           // while(si<=ei){
            //    int mid=si+(ei-si)/2;
             //   if(nums[mid]==target){
              //      return mid;
               // }
               // if(nums[si]<=nums[mid]){
                 //   if(nums[si]<=target && target<=nums[mid]){
                  //      ei=mid-1;
                  //  }else{
                   //     si=mid+1;
                 //   }
               // }else {
                    // if(nums[mid]<=target && target<=nums[ei]){
                     //           si=mid+1;
                     //   }
                      //  else{
                      //      ei=mid-1;
                      //  }
               // }
           // }
           // return -1;
       // }

        public static int search(int[] nums, int target,int si,int ei) {
          if(si>ei){
            return -1;
          }
           
                int mid=si+(ei-si)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[si]<=nums[mid]){
                    if(nums[si]<=target && target<=nums[mid]){
                       return search(nums, target, si, mid-1);
                    }else{
                     return search(nums, target, mid+1, ei) ;
                    }
                }else {
                     if(nums[mid]<=target && target<=nums[ei]){
                           return     search(nums, target, mid+1, ei);
                        }
                        else{
                           return search(nums, target, si, mid-1) ;
                        }
                }
          
        }
        public static void main(String[] args){
            int nums[]={7,0,1};
           System.out.println(search(nums,1 ,0,nums.length-1));
        }
    }
