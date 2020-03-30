import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
 int val;
TreeNode left;
 TreeNode right;
TreeNode(int x) { val = x; }
  }

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb= new StringBuilder();
        reserialize(root,sb);
        return sb.toString();
    }
    
    public void reserialize(TreeNode root,StringBuilder sb){
        if(root==null)
            sb.append("null,");
        else{
        sb.append(sb.toString().valueOf(root.val)+",");
        reserialize(root.left,sb);
        reserialize(root.right,sb);
        }
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       String [] temp = data.split(",");
       List<String> l = new LinkedList<String>(Arrays.asList(temp));
       return redeserialize(l); 
    }
    
    public TreeNode redeserialize(List<String> list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        node.left = redeserialize(list);
        node.right = redeserialize(list);
        return node;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	TreeNode root = new TreeNode(3);
    	root.left = new TreeNode(1);
    	root.right = new TreeNode(2);
    	root.left.left = new TreeNode(4);
    	root.left.right = new TreeNode(5);
    	root.right.left = new TreeNode(6);
    	root.right.right = new TreeNode(7);
    	Codec codec = new Codec();
    	System.out.println("Preorder Traversal of Original Tree ");
    	
    	List<Integer> res = codec.Preorder(root);
    	for(int i =0 ;i<res.size();i++) {
    		System.out.println(res.get(i));
    	}
    	
    	System.out.println("Serialized Tree " +codec.serialize(root));
    //System.out.println("deserialize Tree " +codec.deserialize(codec.serialize(root).toString()));
 	System.out.println("Preorder Traversal of Deserialized Tree ");
	List<Integer> deres = codec.Preorder(codec.deserialize(codec.serialize(root)));
	for(int i =0 ;i<deres.size();i++) {
		System.out.println(deres.get(i));
	}

	}
    
    public List<Integer> Preorder(TreeNode root){
    	      List<Integer> res = new LinkedList<Integer>();
          Stack<TreeNode> stack = new Stack<TreeNode>();
          
          if(root==null)
              return res;
          TreeNode current = root;
          stack.push(current);
          
          while(!stack.isEmpty()){
              current = stack.pop();
              res.add(current.val);
              if(current.right!=null)
                  stack.push(current.right);
              if(current.left!=null)
                  stack.push(current.left);
          }
         return res; 
    }
}


