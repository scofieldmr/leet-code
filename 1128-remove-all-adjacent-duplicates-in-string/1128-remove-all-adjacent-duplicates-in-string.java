class Solution {
    public String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>();

        stack.push(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && stack.peek().equals(String.valueOf(s.charAt(i)))){
                stack.pop();
            }
            else{
                stack.push(String.valueOf(s.charAt(i)));
            }
        }



        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        
        return stringBuilder.reverse().toString();
    }
}