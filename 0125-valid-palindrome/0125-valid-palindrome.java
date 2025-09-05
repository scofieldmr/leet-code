class Solution {

    public boolean isPalindrome(String s) {
       
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                if(Character.isDigit(c)){
                    sb.append(c);
                }
                else{
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        int i = 0;
        int j =sb.length()-1;

        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }

       return true;
    }

    private String convertToString(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
                else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        return sb.toString();
    }

    
}

        // StringBuilder sb = new StringBuilder(s);

        // int i =0;
        // int j =sb.length()-1;

        // while(i<j){
        //    char ch1 = Character.toLowerCase(sb.charAt(i));
        //    char ch2 = Character.toLowerCase(sb.charAt(j));

        //    if(Character.isLetter(ch1) || Character.isDigit(ch1)){
        //       if(Character.isLetter(ch2) || Character.isDigit(ch2)) {
        //          if (ch1 != ch2) {
        //              return false;
        //          }
        //          else {
        //              System.out.println(ch1 + " = " + ch2);
        //              i++;
        //              j--;
        //              continue;
        //          }
        //       }
        //       else{
        //           j--;
        //       }
        //    }
        //    else {
        //        i++;
        //    }

        // }

        // return true;


        