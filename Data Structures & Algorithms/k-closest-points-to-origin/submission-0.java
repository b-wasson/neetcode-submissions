class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for(int i = 0; i < points.length; i++){
           int x = points[i][0];
           int y = points[i][1];
           int distance = x*x + y*y;

            pq.offer(new int[]{distance, x, y});
        }

        int[][] output = new int[k][2];
        for(int i = 0; i < k; ++i){
            int[] point = pq.poll();
            output[i] = new int[]{point[1], point[2]};
        }

        return output; 
    }   

}
