
public class BST {
	
	private BSTNode root;

	/**
	 * Method to check if the tree is empty
	 * @return true if empty, false if not
	 */
	public boolean isEmpty(){
		return (root == null);
	}
	
	/**
	 * Method to return the root node
	 * @return root node
	 */
	public BSTNode getRoot(){
		return this.root;
	}
	
	/**
	 * Method used to insert a profile into the tree
	 * If the tree is empty then the newNode becomes the root
	 * If the tree is not empty then it calls the insertNewNode method
	 * @param p, profile to be added
	 */
	public void insertProfile(Profile p){
		BSTNode newNode = new BSTNode(p);
		if(root == null){
			System.out.println(newNode.getProfile().getName() + " added");
			root = newNode;
		}
		else{
			insertNewNode(newNode, root);
		}
	}
	
	/**
	 * Recursive Method used to insert a new node into the tree
	 * @param newNode, new node to be added to the tree
	 * @param levelNode, the node to be used to compare to, to see
	 * 		  if it is greater or less than alphabetically 
	 */
	private void insertNewNode(BSTNode newNode, BSTNode levelNode){
		if(newNode.compare(levelNode) < 0){
			if(levelNode.getLeft() == null){
				System.out.println(newNode.getProfile().getName() + " added");
				levelNode.setLeft(newNode);
			}
			else{
				insertNewNode(newNode, levelNode.getLeft());
			}
		}
		else{
			if(levelNode.getRight() == null){
				System.out.println(newNode.getProfile().getName() + " added");
				levelNode.setRight(newNode);
			}
			else{
				insertNewNode(newNode, levelNode.getRight());
			}
		}
	}
	
	/**
	 * Method to go through the tree and print out all
	 * of the nodes' text
	 * @param root node
	 */
	public void printAlphabetical(BSTNode root){
		if(root != null){
			printAlphabetical(root.getLeft());
			System.out.println(root.getProfile().getName());
			printAlphabetical(root.getRight());
		}
	}
	
	/**
	 * Method to go through the tree and print out all
	 * of the nodes' text
	 * @param root node
	 */
	public void profilesPreOrder(BSTNode root){
		if (root != null){
			System.out.println("\n" + root.getProfile().toString());
			profilesPreOrder(root.getLeft());
			profilesPreOrder(root.getRight());
		}
	}
	
}
