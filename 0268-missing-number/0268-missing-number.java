class Solution {
    public int missingNumber(int[] arr) {


        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]==i){
                    swap(arr,j,i);
                    break;
                }
            }
        }
        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }

        return arr.length;


        // int i=0;
        // while(i<arr.length){
        //     int corectIndex = arr[i];
        //     if(arr[i]<arr.length && arr[i]!=arr[corectIndex]){
        //         swap(arr,i,corectIndex);
        //     }
        //     else{
        //         i++;
        //     }
        // }

        // for(int in=0;in<arr.length;in++){
        //     if(arr[in]!=in){
        //         int missNum = in;
        //         return missNum;
        //     }
        // }

        // return arr.length;
        
    }

    void swap(int[] arr,int first,int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}