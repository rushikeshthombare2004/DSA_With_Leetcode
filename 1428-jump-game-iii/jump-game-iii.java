class Solution {
    public boolean canReach(int[] arr, int start) {

        int n=arr.length;
        boolean[] visit=new boolean[n];
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(start);

        while(!q.isEmpty()){
            int i=q.poll();

            if(i<0 || i>=n || visit[i]){
                continue;
            }
            if(arr[i]==0){
                return true;
            }
            visit[i]=true;

            q.offer(i+arr[i]);
            q.offer(i-arr[i]);
        }
        return false;
    }
}