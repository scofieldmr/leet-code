class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
        "...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for(String w : words){
            StringBuilder sb = new StringBuilder();
            for(char c:w.toCharArray()){
                int index = c - 'a';
                String sindex = morse[index];
                sb.append(sindex);
            }
            set.add(sb.toString());
        }

        return set.size();

    }
}