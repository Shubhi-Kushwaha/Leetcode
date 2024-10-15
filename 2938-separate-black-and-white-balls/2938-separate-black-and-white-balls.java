class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long count = 0;
        int onesToRight = 0;
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '1') {
                onesToRight++;
            } else { 
                count += onesToRight;
            }
        }

        return count;
    }
}

