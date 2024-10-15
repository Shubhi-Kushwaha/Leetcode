class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>row=new ArrayList<>();
        row.add(1);
        ans.add(row);
        if (rowIndex == 0) {
            return row;
        }
       
        for(int i=1;i<=rowIndex;i++){
             List<Integer>current=new ArrayList<>();
            current.add(1);
            List<Integer>prev=ans.get(i-1);
            for(int j=1;j<i;j++){
              current.add(prev.get(j-1)+ prev.get(j));
            } 
            current.add(1);
            ans.add(current);
            
        }
        return ans.get(rowIndex);
    }
}