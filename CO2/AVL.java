package CO2;

import java.util.*;
public class AVL {

	  private int size; /** The size of the tree. */

	  private int height; /** The height of the tree. */

	  private Object key;/** The key of the current node. */

	  private Object data;/** The data of the current node. */

	  private Comparator comp;/** The {@link Comparator} used by the node. */

	
	  private AVL left,right,parent,succ,pred;

	  public AVL(Object key, Object data, Comparator comp) {
	    this(key,data,comp,null);
	  }

	  public AVL(Object key, Object data, Comparator comp, AVL parent) {
	    this.data = data;
	    this.key = key;
	    this.comp = comp;
	    this.parent = parent;

	    this.left = null;
	    this.right = null;
	    this.succ = null;
	    this.pred = null;

	    this.size = 1;
	    this.height = 0;
	 }

	 
	  public AVL add(Object key,Object data) {
	    return null;
	  }

	  
	  public AVL remove(Object key) {
	    return null;  
	  }
}// not yet done
