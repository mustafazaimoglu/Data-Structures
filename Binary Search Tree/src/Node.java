
public class Node
{
    int key;
    Node left;
    Node right;

    public Node(int key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString()
    {
        return "[" + key + "," + (left == null ? "-" : "left : " + left) + "," +  (right == null ? "-" : "right : " + right) + "]";
    }
    
   
    
    
}
