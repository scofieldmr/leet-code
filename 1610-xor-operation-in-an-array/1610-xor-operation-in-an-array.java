class Solution {
    public int xorOperation(int n, int start) {
 
        int[] num = new int[n];
        num[0] = start;
        int sum = num[0];
        for(int i=1;i<n;i++){
            sum = sum + 2;
            num[i] = sum;
        }

        int xor = 0;
        for(int a:num){
            xor = xor ^ a;
        }

        return xor;
        
    }
}