class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber%26;
            char c = (char)(rem + 'A');
            sb.append(c);
            columnNumber = columnNumber/26;
        }

        return sb.reverse().toString();

        // while (columnNumber >= 1) {
        //     if(columnNumber <=26){
        //         char ch1 = (char) (columnNumber + 64);
        //         sb.append(ch1);
        //         break;
        //     }
        //     long rem = columnNumber/26;
        //     char ch = (char) ( rem + 64);
        //     sb.append(ch);
        //     columnNumber %= 26;
            
        // }

        // return sb.toString();
    }
}