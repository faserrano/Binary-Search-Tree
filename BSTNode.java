// Binary Search Tree Node class
// Xiwei Wang

public class BSTNode 
{
    // data members
    private int m_value;
    private BSTNode m_left;
    private BSTNode m_right;
    
    // constuctor
    public BSTNode(int value)
    {
        m_value = value;
        m_left = null;
        m_right = null;
    }
    
    // member methods
    public int getInfo()
    {
        return m_value;
    }
    
    public BSTNode getLeft()
    {
        return m_left;
    }
    
    public BSTNode getRight()
    {
        return m_right;
    }
    
    public void setLeft(BSTNode left)
    {
        m_left = left;
    }
    
    public void setRight(BSTNode right)
    {
        m_right = right;
    }      
}
