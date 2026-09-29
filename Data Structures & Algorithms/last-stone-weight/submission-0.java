class Solution {
    public int lastStoneWeight(int[] stones) { 
    // insert everything into a heap 

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 

    for(int stone : stones){
        maxHeap.add(stone);
    }

    while(maxHeap.size() > 1){
        int x = maxHeap.poll();
        int y = maxHeap.poll(); 
        if(x > y){
            int z = x - y; 
            maxHeap.add(z);
        }
    }
    maxHeap.offer(0);
    return maxHeap.poll(); 
    }
}
