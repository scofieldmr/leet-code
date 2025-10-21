class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        if(s.length()==1){
            return false;
        }

        for(char c:s.toCharArray()){
            if(c == '{' || c == '(' || c=='['){
                st.push(c);
            }
           else if(!st.isEmpty()){
                char temp = st.pop();
                if(c== '}' && temp != '{'){
                    return false;
                }
                else if(c== ')' && temp != '('){
                    return false;
                }
                else if(c== ']' && temp != '['){
                    return false;
                }
            }
            else{
                return false;
            }
        }

        if(!st.empty()){
            return false;
        }

        return true;
    }
}