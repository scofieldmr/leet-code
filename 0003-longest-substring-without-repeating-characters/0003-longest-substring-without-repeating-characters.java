class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<Character>();
        int right = 0;
        int left = 0;
        int max = 0;

        while(right < s.length()) {
            char c = s.charAt(right);

            if(set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
             else{
                set.add(c);
                max = Math.max(max, right - left + 1);
                right++;
            }
        }

        return max;
        
        // if(s.length()==1){
        //     return 1;
        // }

        // if(s.length()==0){
        //     return 0;
        // }

        // Map<Character, Integer> map = new HashMap<>();
        // int longCount = 0;
        // int currCount = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     if (map.containsKey(s.charAt(i))) {
        //         if(currCount > longCount){
        //            longCount = currCount;
        //            currCount = 1;
        //        }
        //     }
        //     else {
        //         map.put(s.charAt(i), 1);
        //         currCount++;
        //     }
        // }


        // return longCount>currCount?longCount:currCount;
        
    }
}