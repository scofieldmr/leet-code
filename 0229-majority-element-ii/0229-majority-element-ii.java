class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int len = nums.length;
        int maj = len/3;
        List<Integer> res = new ArrayList<>();

        Arrays.sort(nums);
        int count = 1;
        int currNum = nums[0];
        for(int i=1;i<len;i++){
            if(nums[i]==currNum){
                count++;
                continue;
            }
            if(count>maj){
                res.add(currNum);
            }
            currNum = nums[i];
            count = 1;
        }

        if(count>maj){
            res.add(currNum);
        }

        return res;
        
        // Map<Integer,Integer> map = new HashMap<>();
        // int len = nums.length;
        // int maj = len/3;

        // for(int n : nums){
        //     map.put(n,map.getOrDefault(n,0) + 1);
        // }

        // List<Integer> list = new ArrayList<>();
    
        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     if(entry.getValue()>maj){
        //         list.add(entry.getKey());
        //     }
        // }
        // return list;
    }
}