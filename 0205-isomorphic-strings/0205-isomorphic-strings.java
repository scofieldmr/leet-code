class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2)
                return false;
            }
            else if(map1.containsValue(ch2))
            {
                return false;
            }
            map1.put(ch1,ch2);

        }

        return true;
    }
}