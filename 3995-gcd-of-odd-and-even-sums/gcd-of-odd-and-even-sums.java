class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n<=2){
            return n;
        }
        int s= 0 ;
        int e = 0 ;
  int res = 0;
        for(int i = 1 ;i<=n*2;i++){
            if(i % 2==0) s+=i;
            else e+=i;
        }
        int min = Math.min(s,e);
        for(int i = 1 ; i<min/2;i++){
            if(s%i==0&& e %i==0){
             res=i;
            }
        }
        return res;
    }
}