class Solution {
    public int findMin(int[]arr) {
    int m = Integer.MAX_VALUE ;

    for(int n : arr){
        if(n < m){
            m = n;
        }
    }
      return m;  
    }
}