class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        triangle.add(row1);

        if(rowIndex == 0){
            return row1;
        }

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currRow.add(1);

            triangle.add(currRow);
        }

        return triangle.get(rowIndex);
    }
}