class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
         if(words.isEmpty()) return new ArrayList<>();
        List<String>result=new ArrayList<>();
        for(String word:words){
            int left=0;
            int right=0;
            while(right<word.length()){
                char ch=word.charAt(right);
                if(ch==separator){
                    String s=word.substring(left,right);
                    if(s!="") result.add(s);
                    left=right+1;
                }
                right++;
            }
            if(left<word.length()){
                String s=word.substring(left,right);
                if(s!="") result.add(s);
            }
        }
        return result;
        // List<String> list = new ArrayList<>();

        // for(int i=0;i<words.size();i++){
        //     String word = words.get(i);
        //     StringBuilder sep = new StringBuilder("\\");
        //     sep.append(separator);
        //     String [] sparts = word.split(sep.toString());

        //       for(int j=0;j<sparts.length;j++){
        //            if(sparts[j].length()>=1){
        //                list.add(sparts[j]);
        //            }
        //     }
            
        // }
        // return list;
    }
}