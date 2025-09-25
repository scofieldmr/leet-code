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

//Using Recursion
//  public boolean isPalindrome(String s) {
//         String s1 = s.toLowerCase();
//         return palindromeString(s1,0,s1.length()-1);
//    }

//     public static boolean palindromeString(String s,int start,int end) {
//         if(start>=end){
//             return true;
//         }

//     char left = s.charAt(start);
//     char right = s.charAt(end);

//     if (!Character.isLetterOrDigit(left)) {
//         return palindromeString(s, start + 1, end);  
//     } else if (!Character.isLetterOrDigit(right)) {
//         return palindromeString(s, start, end - 1); 
//     } else if (left != right) {
//         return false; 
//     }
       
//         return palindromeString(s,start+1,end-1);
//     }
// }

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


        