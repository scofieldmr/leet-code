class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();

        for(int i=0;i<words.size();i++){
            String word = words.get(i);
            StringBuilder sep = new StringBuilder("\\");
            sep.append(separator);
            String [] sparts = word.split(sep.toString());

              for(int j=0;j<sparts.length;j++){
                   if(sparts[j].length()>=1){
                       list.add(sparts[j]);
                   }
            }
            
        }


        return list;
    }
}