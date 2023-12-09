package CO2;
import java.io.*;
public class BST {
  static class node{
	int key;
	node left,right;
  };
  static node newNode(int item)
  {
	  node temp =new node();
	  temp.key=item;
	  temp.left=temp.right=null;
	  return temp;
  }
  static node insert(node node,int key)
  {
	  if(node==null)
	  {
		  return newNode(key);
	  }
	 if(key<node.key)
	 {
		 node.left=insert(node.left,key);
		 
	 }
	 else
	 {
		 node.right=insert(node.right,key);
	 }
	 return node;
  }
  static void inorder(node root)
  {
	  if(root!=null)
	  {
		  inorder(root.left);
		  System.out.println(" "+root.key);
		  inorder(root.right);
	  }
  }
  public static void main(String args[])
  {
	  node root =null;
	  root = insert(root,50);
	  insert(root,30);
	  insert(root,10);
	  insert(root,20);
	  insert(root,50);
	  insert(root,70);
	  insert(root,0);
	  insert(root,40);
	  inorder(root);
	  
  }
  
}
