class Solution {
    public int findSpecialInteger(int[] arr) {

        int length = arr.length;
        int quart = length/4;

        for(int i=0;i<length-quart;i++){
            if(arr[i]==arr[i+quart]){
                return arr[i];
            }
        }

        return -1;

        // if(arr.length==1){
        //     return arr[0];
        // }

        // int maxCount = Integer.MIN_VALUE;
        // int max = Integer.MIN_VALUE;
        // int curr = arr[0];
        // int currcount = 1;
        
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]==curr){
        //         currcount++;
        //     }
        //     else{
        //         if(currcount>maxCount){
        //             max = curr;
        //             maxCount = currcount;
        //         }
        //         curr = arr[i];
        //         currcount = 1;
        //     }
        // }

        // if(currcount>maxCount){
        //     max = curr;
        // }

        // return max;

        //using Map
        // Map<Integer,Integer> map = new HashMap<>();
        // int len = arr.length;
        // int len_30 = arr.length/3;

        // for(int a:arr){
        //     map.put(a,map.getOrDefault(a,0)+1);
        // }

        // int max = Integer.MIN_VALUE;
        // int mlen = Integer.MIN_VALUE;
        // for(Map.Entry<Integer,Integer> m : map.entrySet()){
        //     if(m.getValue()>mlen){
        //         mlen = m.getValue(); 
        //         max = m.getKey();
        //     }
        // }

        // return max;
    }
}