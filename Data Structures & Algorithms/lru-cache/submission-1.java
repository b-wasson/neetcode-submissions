public class  Node{
    int key;
    int val;
    Node prev;
    Node next;
    
    public Node(int key, int val){
        this.key = key; 
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    HashMap<Integer, Node> cache;
    int capacity; 
    Node left; //least recently used
    Node right; //most recently used
   

    public LRUCache(int capacity) {
        this.capacity = capacity; 
        this.cache = new HashMap<>();
        this.left = new Node(-1, -1);
        this.right = new Node(-1, -1);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;

    }

    public void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node; 
        node.prev = prev; 
        node.next = this.right;
        this.right.prev = node; 

    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }

        Node node = new Node(key, value);
        cache.put(key, node);
        insert(node);

        if(cache.size() > capacity){
            Node lruNode = left.next;
            remove(lruNode);
            cache.remove(lruNode.key);
        }
    }
}
