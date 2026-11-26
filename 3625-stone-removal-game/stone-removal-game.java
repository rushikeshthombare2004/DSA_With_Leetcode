class Solution {
    public boolean canAliceWin(int n) {
    int k =10 ;
    Boolean v = false;

    while(n>=k){
        n-=k;
        k--;
        if(k==0){
            break;
        }
        v=!v;

    }
    return v;
    
    }
}