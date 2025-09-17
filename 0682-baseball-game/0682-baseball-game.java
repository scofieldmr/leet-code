class Solution {
    public int calPoints(String[] operations) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < operations.length; i++) {
            String c = operations[i];
            if(c.equals("C")){
                list.remove(list.size()-1);
            }
            else if(c.equals("D")){
                list.add(2* list.get(list.size()-1));
            }
            else if (c.equals("+")){
                int num = list.get(list.size()-1) + list.get(list.size()-2);
                list.add(num);
            }
            else{
                int num = Integer.parseInt(c);
                list.add(num);
            }
        }

        int sum = 0;
        for(Integer i : list){
            sum += i;
        }

        return sum;
        
    }
}