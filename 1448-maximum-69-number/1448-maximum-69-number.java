class Solution {
    public int maximum69Number (int num) {

        // char[] digits = String.valueOf(num).toCharArray();
        
        // for (int i = 0; i < digits.length; i++) {
        //     if (digits[i] == '6') {
        //         digits[i] = '9';
        //         break;
        //     }
        // }
        
    
        // return Integer.parseInt(new String(digits));

        int max = num;

        String numStr = Integer.toString(num);
        char[] numArr = numStr.toCharArray();
        int i = 0;
        while (numArr.length > i) {
            if(numArr[i]=='6'){
                numArr[i]='9';
                break;
            }
            else{
                i++;
                continue;
            }
        }

        return Integer.parseInt(new String(numArr));
    }
}