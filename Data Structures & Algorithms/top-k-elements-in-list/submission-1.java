class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[k];

        //create a freq map 
        for(int num : nums){
            if(map.containsKey(num)){
                int count = map.get(num);
                map.put(num, count + 1);
            }else{
                map.put(num, 1);
            }
        }

        //then use a minHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );   

        //add to pq
        for(int num : map.keySet()){
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }

        for(int i = 0; i < k; i++){
            output[i] = pq.poll();
        }

        return output;
    }
}
