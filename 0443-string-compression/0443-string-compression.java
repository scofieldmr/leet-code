class Solution {
    public int compress(char[] chars) {
        int j=0;
        char temp = chars[0];
        int i=1;
        int count=1;
        while(i<chars.length){
            if(chars[i]==temp){
                count++;
            }
            else{
                chars[j] = temp;
                j++;
                if(count>=2){
                    String val = String.valueOf(count);
                    int left = 0;
                    while (left<val.length()){
                        chars[j] = val.charAt(left);
                        left++;
                        j++;
                    }
                }
                temp=chars[i];
                count=1;
            }
            i++;
        }

        if(count==1){
            chars[j] = temp;
            j++;
        }

        if(count>=2){
            chars[j] = temp;
            j++;
            String val = String.valueOf(count);
            int left = 0;
            while (left<val.length()){
                chars[j] = val.charAt(left);
                left++;
                j++;
            }
        }

        char[] chars1 = Arrays.copyOfRange(chars,0,j);

        return j;

    }
}