class Solution {
    public boolean isHappy(int n) {

        //Using linked list cyclic
        int slow = n;
        int fast = squareNum(n);

        while(slow!=1 && slow!=fast){
            slow = squareNum(slow);
            fast = squareNum(squareNum(fast));
        }

        return slow==1;
    
   
           

        // //Using set
        // Set<Integer> set=new HashSet<>();
        // int sqnum = n;
        // boolean flag = false;

        // while (!flag) {
        //     sqnum = squareNum(sqnum);
        //     if (set.contains(sqnum)) {
        //         break;
        //     }
        //     if(sqnum == 1){
        //         flag = true;
        //         break;
        //     }
        //     set.add(sqnum);
        // }

        // if(flag){
        //     return true;
        // }
        
        // return false;
    }

     public static int squareNum(int num) {
        int squareNum=0;
        while(num!=0){
            int rem = num%10;
            squareNum = squareNum+(rem*rem);
            num = num/10;
        }
        return squareNum;
    }
}