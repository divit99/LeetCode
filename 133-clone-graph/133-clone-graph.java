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
    
    
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        
        Queue<Node> queue=new LinkedList();
        HashMap<Node,Node> visited=new HashMap();
        Node curr=new Node(node.val);
        visited.put(node,curr);
        queue.offer(node);
        while(!queue.isEmpty()){
            Node newnode=queue.poll();
            List<Node> neighbors=visited.get(newnode).neighbors;
            
            for(Node n : newnode.neighbors){
                if(!visited.containsKey(n)){
                    visited.put(n,new Node(n.val));
                    queue.offer(n);
                }
                neighbors.add(visited.get(n));
            }
        }
        return curr;
        
        
        
        
    }
}