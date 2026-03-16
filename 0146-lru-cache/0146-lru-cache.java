class LRUCache {
    private int capacity;
    private Map<Integer, LinkedListNode> cache;
    private LinkedList<LinkedListNode> lruList; 

    public class LinkedListNode {
        int key;
        int value;
        LinkedListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        lruList = new LinkedList<>();
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            LinkedListNode node = cache.get(key);
            lruList.remove(node);
            lruList.addFirst(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            LinkedListNode node = cache.get(key);
            lruList.remove(node);
            node.value = value;
            lruList.addFirst(node);
            return;
        }
        if (cache.size() >= capacity) {
            LinkedListNode node = new LinkedListNode(key, value);
            LinkedListNode rs = lruList.pollLast();
            cache.remove(rs.key);
            cache.put(key, node);
            lruList.addFirst(node);
        } else {
            LinkedListNode node = new LinkedListNode(key, value);
            lruList.addFirst(node);
            cache.put(key, node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */