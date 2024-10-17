class Solution {
    static int maxidx(char[]s,int j){
      int n=s.length;
      int mx=j;
      for(int i=j+1;i<n;i++){
          if(s[i]>=s[mx]){
              mx=i;
          }
      }
      return mx;  
    }
    public int maximumSwap(int num) {
         char[] s = Integer.toString(num).toCharArray();
         int n=s.length;
         for(int i=0;i<n;i++){
             int maxIdx = maxidx(s, i);
              if (s[maxIdx] > s[i]) {
                char temp = s[maxIdx];
                s[maxIdx] = s[i];
                s[i] = temp; 
                return Integer.parseInt(new String(s)); 
            }
        }           
         return num;
    }
}