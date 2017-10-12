
public class BSTNode {
	
	Profile data; //reference to the profile
	BSTNode left; //reference to left child in tree
	BSTNode right; //reference to right child in tree
	
	/**
	 * Constructor of BSTNode
	 * @param p, profile for the data
	 */
	public BSTNode(Profile p){
		this.data = p;
		left = null;
		right = null;
	}
	
	/**
	 * Method to return the profile of the node
	 * @return profile 
	 */
	public Profile getProfile(){
		return this.data;
	}
	
	/**
	 * Method to set the left child of the node
	 * @param l, node to be left child
	 */
	public void setLeft(BSTNode l){
		this.left = l;
	}
	
	/**
	 * Method to set the right child of the node
	 * @param r, node to be right child
	 */
	public void setRight(BSTNode r){
		this.right = r;
	}
	
	/**
	 * Method to get the left child of the node
	 * @return left child child
	 */
	public BSTNode getLeft(){
		return this.left;
	}
	
	/**
	 * Method to get the right child of the node
	 * @return right child node
	 */
	public BSTNode getRight(){
		return this.right;
	}
	
	public int compare(BSTNode n){
		return (this.getProfile().getName().compareToIgnoreCase(n.getProfile().getName()));
	}
	
}
