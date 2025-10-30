class Solution {
    public int dayOfYear(String date) {
         int dayOfYear = 0;

        int monthDate = Integer.parseInt(date.substring(8));
        int month = Integer.parseInt(date.substring(5,7));
        int year = Integer.parseInt(date.substring(0,4));

        int [] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        boolean isLeap = false;
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            isLeap = true;
        }

        dayOfYear = monthDate;
        for(int i = 0; i < month - 1; i++){
            if(isLeap && i == 1){
                dayOfYear = dayOfYear + 29;
            }
            else if(i==1){
                dayOfYear = dayOfYear + 28;
            }
            else{
                dayOfYear = dayOfYear + monthDays[i];
            }

            
        }

        return dayOfYear;



        // for (int i = 1; i < month; i++) {
        //     if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
        //         dayOfYear = dayOfYear + 31;
        //     }
        //     else if(i == 4 || i == 6 || i == 9 || i == 11) {
        //         dayOfYear = dayOfYear + 30;
        //     }
        //     else if(i == 2 && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        //         dayOfYear = dayOfYear + 29;
        //     }
        //     else if(i == 2){
        //         dayOfYear = dayOfYear + 28;
        //     }
        // }
        // dayOfYear = dayOfYear + monthDate;

        // return dayOfYear;
    }
}