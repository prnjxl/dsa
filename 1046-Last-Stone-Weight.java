class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int s: stones){
            pq.add(s);
        }
        while(pq.size()>1){
            int first = pq.remove();
            int second = pq.remove();
            if(first!=second){
                pq.add(first-second);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
