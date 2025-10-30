class Solution {
    public int passThePillow(int n, int time) {
 
          int cycle = time % (2 * (n - 1));

          if(cycle<n){
             return cycle+1;
          }
          else{
            return n - (cycle - (n-1));
          }

        // int frontCount = 0;
        // int backCount = 0;

        // int perRound = n - 1;

        // while(time>perRound){
        //     if(frontCount == backCount){
        //         time = time - perRound;
        //         frontCount++;
        //     }
        //     else{
        //         time = time - perRound;
        //         backCount++;
        //     }
        // }

        // if(frontCount == backCount) {
        //    for(int i=1;i<=n;i++){
        //        if(time == 0){
        //            return i;
        //        }
        //        time--;
        //    }
        // }
        // else{
        //     for(int i=n;i>=1;i--){
        //         if(time == 0){
        //             return i;
        //         }
        //         time--;
        //     }
        // }

        // return -1;
    }
}