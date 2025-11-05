class Solution {
    public int commonFactors(int a, int b) {
        
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                set.add(i);
                if (i != a/i) {
                    set.add(a/i);
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(b); i++) {
            if (b % i == 0) {
                if (set.contains(i)) {
                    count++;
                }
                if (i != b/i) {
                    if (set.contains(b/i)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}