class Solution {
    public int addDigits(int num) {

        while(num > 9) {
            int sum = 0;
            while (num!=0){
                int rem = num%10;
                sum = sum + rem;
                num = num/10;
            }
            num = sum;
        }
        return num;

        // int sum = 0;
        // while(num!=0){
        //     int rem = num%10;
        //     sum = sum + rem;
        //     if(sum>9){
        //         int rem1 = sum % 10;
        //         sum = sum/10;
        //         sum = sum + rem1;
        //     }
        //     num = num/10;
        // }
        // return sum;
        
    }
}