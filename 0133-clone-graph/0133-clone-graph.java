/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private Map<Node, Node> graph = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node curr = new Node(node.val);
        graph.put(node, curr);
        for (Node nei: node.neighbors) {
            if (!graph.containsKey(nei)) cloneGraph(nei);
            curr.neighbors.add(graph.get(nei));
        }
        return curr;
    }
}