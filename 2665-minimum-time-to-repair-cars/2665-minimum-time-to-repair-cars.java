class Solution {
    public long repairCars(int[] ranks, int cars) {
       long start = 1;
       long end = Integer.MAX_VALUE;
       for (int r:ranks) {
           end = Math.min(end, r);
       }
       end = end * ((long)cars * cars);
       long res = 0;

       while (start <= end) {
           long mid = start + (end - start) / 2;
           if(check(ranks, mid, cars)) {
              res = mid;
              end = mid - 1;
           }
           else {
             start = mid + 1;
           }
       }

       return res;
    }

    public static boolean check(int [] ranks, long mid ,int cars){
        long repairedCars = 0;
        for (int r: ranks) {
            long repairedCarByMech = (long)Math.sqrt((double)mid/r);
            repairedCars += repairedCarByMech;
        }

        return repairedCars >= cars;
    }
}