class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;

        int reverse = reverseNum(n);
        int reReverse = reverseNum(reverse);

        return num==reReverse;
    }

    public int reverseNum(int num){
        int rev = 0;
        while(num!=0){
           int dig = num % 10;
           rev = rev * 10 + dig;
           num = num/10;
        }

        return rev;
    }
}