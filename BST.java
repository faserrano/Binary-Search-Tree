// Binary Search Tree class
// Xiwei Wang

import java.util.*;

public class BST 
{
    // data members
    private BSTNode m_root;
    private int m_size;
    
    // constructor
    public BST()
    {
        m_root = null;
        m_size = 0;
    }
    
    // member methods
    public void add(int value)
    {
        // implement this method using non-recursive solution
        // implemented by Frank Serrano
        if (m_root == null) //tree is empty
        {
            m_root = new BSTNode(value);
            m_size++;
            return;
        }
        
        if (m_root.getInfo() == value) //new value is already the root
            return;
        
        BSTNode tempNode = new BSTNode(m_root.getInfo());
        tempNode.setLeft(m_root.getLeft());  
        tempNode.setRight(m_root.getRight());  

        
       while (tempNode.getInfo() != value)
       {
           if (value < tempNode.getInfo())
           {
                 if (tempNode.getLeft() == null)
                 {
                       if (m_root.getLeft() == null)
                       {
                           m_root.setLeft(new BSTNode(value));
                           m_size++;
                           return;
                       }
                       else
                       {
                          tempNode.setLeft(new BSTNode(value));
                          m_size++;
                          return;
                       }
                 }
                  else
                     tempNode = tempNode.getLeft();
            }
           else if (value > tempNode.getInfo())
           {
                 if (tempNode.getRight() == null)
                 {
                       if (m_root.getRight() == null)
                       {
                           m_root.setRight(new BSTNode(value));
                           m_size++;
                           return;
                       }
                       else
                       {
                          tempNode.setRight(new BSTNode(value));
                          m_size++;
                          return;
                       }
                 }
                  else
                     tempNode = tempNode.getRight();
            }       
        }
        
        return;
            
    }
    
    public void inOrder()
    {                
             
            Stack<BSTNode> myStack = new Stack<BSTNode>();
            BSTNode current = m_root;

            
            while(!myStack.isEmpty() || current != null)
            {
               
               if(current != null)
               {
                  	myStack.push(current);
                     current = current.getLeft();
 
               }
               else
               {
                      BSTNode temp = myStack.pop();
                      System.out.print("" + temp.getInfo() + ' ');
                      current = temp.getRight();
               }
                
                
            }
            
            return; 
     }
        
    public int size()
    {
        return m_size;
    }
    
    public void clear()
    {
        m_root = null;
        m_size = 0;
    }
}
