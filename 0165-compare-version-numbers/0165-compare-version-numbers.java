class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1split = version1.split("\\.");
        String[] v2split = version2.split("\\.");

        int i = 0;
        int j = 0;

       while (i < v1split.length && j < v2split.length) {
            int v1i = Integer.parseInt(v1split[i]);
            int v2i = Integer.parseInt(v2split[j]);
            if (v1i > v2i) {
                return 1;
            }
            else if (v1i < v2i) {
                return -1;
            }
            i++;
            j++;
        }

        while (i < v1split.length) {
            int v1i = Integer.parseInt(v1split[i]);
            if (v1i > 0) {
                return 1;
            }
            i++;
        }

        while (j < v2split.length) {
            int v2i = Integer.parseInt(v2split[j]);
            if (v2i>0) {
                return -1;
            }
            j++;
        }

        return 0;
    }
}