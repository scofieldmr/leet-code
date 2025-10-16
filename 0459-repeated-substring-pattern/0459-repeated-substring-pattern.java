class Solution {
    public boolean repeatedSubstringPattern(String s) {

        StringBuilder sb = new StringBuilder(s);
        sb = sb.append(sb);

        String sb1 = sb.substring(1,sb.length()-1);

        return sb1.contains(s);


        // if(s.length()==2){
        //     return s.charAt(0)==s.charAt(1);
        // }

        // int right = 1;
        // boolean repeated = false;

        // while(right<s.length()) {
        //     StringBuilder sb1 = new StringBuilder(s.substring(0,right));
        //     StringBuilder sb2 = new StringBuilder(s.substring(right));
        //     if(sb1.length()>1 && sb2.toString().contains(sb1.toString())) {
        //         repeated = true;
        //         break;
        //     }
        //     right++;
        // }

        // return repeated;

    }
}