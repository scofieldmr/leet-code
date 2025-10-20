class Solution {
    public int secondHighest(String s) {
          int first = -1;
          int sec = -1;

          for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int num = c-'0';
                if(num > first){
                    sec = first;
                    first = num;
                }
                else if(num<first && num > sec){
                    sec = num;
                }
            }
          }

          return sec;

        // int [] freq = new int[10];
        // for(char c : s.toCharArray()){
        //     if(c>='0' && c<='9'){
        //         freq[c-'0']++;
        //     }
        // }

        // int maxDig = -1;
        // int smaxDig = -1;
        // for(int i=0; i<freq.length; i++){
        //     if(freq[i]>=1 && i>maxDig){
        //         smaxDig = maxDig;
        //         maxDig = i;
        //     }
        //     else if(freq[i]>=1 && i>smaxDig){
        //         smaxDig = i;
        //     }
        // }

        // return smaxDig;

    }
}