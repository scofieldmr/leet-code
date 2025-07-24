class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0 ;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
              nums[index]=nums[i];
              index++;
            }
        }

        for(int i=index;i<nums.length;i++){
            nums[i] =0;
        }



        // int j = 0;

        // int n = nums.length;

        // int[] arr = new int[n];

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         arr[n-1]=nums[i];
        //     }
        //     else{
        //         arr[j] = nums[i];
        //         j++;
        //     }
        // }

        // for(int i=0;i<nums.length;i++){
        //     nums[i]=arr[i];
        // }
        
        //  for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==0 && nums[j]!=0){
        //             swap(nums,i,j);
        //             break;
        //         }
        //     }
        // }

        
    }

    public void swap(int [] arr,int first,int sec){
            int temp = arr[first];
            arr[first] = arr[sec];
            arr[sec] = temp;
    }
}