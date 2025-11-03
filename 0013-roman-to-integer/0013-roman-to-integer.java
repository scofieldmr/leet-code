class Solution {
    public int romanToInt(String roman) {
         int num = 0;
        for (int i = 0; i < roman.length(); i++) {
            if(roman.charAt(i) == 'M'){
                num = num + 1000;
            }
            else if((i+1) < roman.length() && roman.charAt(i) == 'C' && roman.charAt(i+1) == 'M'){
                num = num + 900;
                i = i+1;
            }
            else if(i+1 < roman.length() && roman.charAt(i) == 'C' && roman.charAt(i+1) == 'D'){
                num = num + 400;
                i = i+1;
            }
            else if(roman.charAt(i) == 'D'){
                num = num + 500;
            }
            else if(i+1 < roman.length() && roman.charAt(i) == 'X' && roman.charAt(i+1) == 'C'){
                num = num + 90;
                i = i+1;
            }
            else if(roman.charAt(i) == 'C'){
                num = num + 100;
            }
            else if(i+1 < roman.length() && roman.charAt(i) == 'X' && roman.charAt(i+1) == 'L'){
                num = num + 40;
                i = i+1;
            }
            else if(roman.charAt(i) == 'L'){
                num = num + 50;
            }
            else if(i+1 < roman.length() && roman.charAt(i) == 'I' && roman.charAt(i+1) == 'X'){
                num = num + 9;
                i = i+1;
            }
            else if(roman.charAt(i) == 'X'){
                num = num + 10;
            }
            else if(i+1 < roman.length() && roman.charAt(i) == 'I' && roman.charAt(i+1) == 'V'){
                num = num + 4;
                i = i+1;
            }
            else if(roman.charAt(i) == 'V'){
                num = num + 5;
            }
            else if (roman.charAt(i) == 'I') {
                num = num + 1;
            }
        }

        return num;
    }
}