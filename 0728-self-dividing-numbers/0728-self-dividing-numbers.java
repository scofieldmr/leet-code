class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(isDivisible(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isDivisible(int num) {
        int n = num;
        while (n>0){
            int rem = n%10;
            if(rem==0) return false;
            if(num%rem!=0) return false;
            n=n/10;
        }
        return true;
    }
}