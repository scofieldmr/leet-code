class Solution {
    public int subtractProductAndSum(int n) {
        int num = n;
        int sum = 0;
        int product = 1;
        while(num!=0){
            int rem = num%10;
            product = product * rem;
            sum = sum + rem;
            num = num/10;
        }
        
        return product-sum;
    }
}