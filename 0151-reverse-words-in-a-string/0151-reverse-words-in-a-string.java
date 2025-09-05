class Solution {
    public String reverseWords(String s) {

        String [] words = s.split(" ");


        List<String> wordList = new ArrayList<>();
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            if(word.length()>0){
                wordList.add(word);
            }
        }
        System.out.println(wordList);

        for(int i = wordList.size(); i >0; i--){
            if(i==1){
                reversedString.append(wordList.get(i-1));
            }
            else {
                reversedString.append(wordList.get(i-1) + " ");
            }
        }

        return reversedString.toString();
        
    }
}