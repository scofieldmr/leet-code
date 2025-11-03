class Solution {
    public int reverse(int x) {
        int num = x;
        int reverse = 0;

        while (num!=0){
            int digit = num%10;
            num = num/10;

            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && digit > 7)){
                reverse = 0;
                break;
            }
            else if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && digit < -7)){
                reverse = 0;
                break;
            }

            reverse = reverse * 10 + digit;
        }

        return reverse;
    }
}