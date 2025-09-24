class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> row1 = Arrays.asList(1);
        if(rowIndex==0){
            return row1;
        }

        list.add(row1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prevRow = list.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);
            for(int j=1;j<i;j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            list.add(currRow);
        }

        return list.get(rowIndex);
    }
}