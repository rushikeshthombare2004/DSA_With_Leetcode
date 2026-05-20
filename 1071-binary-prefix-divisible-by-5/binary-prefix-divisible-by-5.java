class Solution {
    public List<Boolean> prefixesDivBy5(int[] arr) {
        List<Boolean> a = new ArrayList();
          int i = 0 ;
        for(int n : arr){
             i =((i<<1)+n) %5;
            if(i == 0){
                a.add(true);
            }else{
                a.add(false);
            }
        }
       return a;
    }
}