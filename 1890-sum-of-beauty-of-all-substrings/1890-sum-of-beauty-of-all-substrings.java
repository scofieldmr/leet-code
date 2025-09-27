class Solution {
    public int beautySum(String s) {
         int totalBeauty = 0;

         for (int i = 0; i < s.length(); i++) {
             int[] frequency = new int[26];
             for (int j = i; j < s.length(); j++) {
                 int index = s.charAt(j) - 'a';
                 frequency[index]++;

                 int minFreq = Integer.MAX_VALUE;
                 int maxFreq = Integer.MIN_VALUE;

                 for (int freq : frequency) {
                     if (freq > 0) {
                         minFreq = Math.min(freq, minFreq);
                         maxFreq = Math.max(freq, maxFreq);
                     }
                 }

                 totalBeauty += (maxFreq - minFreq);
             }
         }

         return totalBeauty;
    }
}

// class Solution {
//     public int beautySum(String s) {
//          int beauty = 0;
//          for (int i = 0; i <= s.length(); i++) {
//             for (int j = i + 1; j <= s.length(); j++) {
//                   String str = s.substring(i, j);
//                   if(str.length()>=2){
//                       beauty = beauty + stringBeauty(str);
//                   }
//             }
//         }

//         return beauty;
        
//     }

//      private static int stringBeauty(String s){
//         Map<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             if (map.containsKey(s.charAt(i))) {
//                 map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//             }
//             else {
//                 map.put(s.charAt(i), 1);
//             }
//         }

//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for(int frequecy:map.values()) {
//             max = Math.max(max, frequecy);
//             min = Math.min(min, frequecy);
//         }

//         return max - min;
//      }
// }

 
