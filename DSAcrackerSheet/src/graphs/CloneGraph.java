package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

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



  
public class CloneGraph {
	
	public static void main(String[] args) {
		
	}
	  public Node cloneGraph(Node node) {
		Map<Integer,Node> map = new HashMap<Integer,Node>();
		
		
		  
		return createNewNode(node,map);
	        
	    }
	private Node  createNewNode(Node node, Map<Integer,Node> map) {
		
		if(node==null)
			return null;
		
		Node newNode = new Node(node.val);
		map.put(node.val,newNode);
		for(Node list : node.neighbors) {
			if(!map.containsKey(list.val))
            {
                newNode.neighbors.add(createNewNode(list,map));
            }else{
                newNode.neighbors.add(map.get(list.val));
            }
			

		
	}
		return newNode;	
	}
	  
	
}
