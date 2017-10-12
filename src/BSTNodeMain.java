
public class BSTNodeMain {

	public static void main(String[] args) {
		
		Profile p1 = new Profile("Ayden", "Newquay", "England", "English", 29, 04, 1998,
				new String[] {"Guitar","Gaming"});

		Profile p2 = new Profile("Robyn", "Forest", "Wales" , "Welsh", 16, 07, 1996,
				new String[] {"Minecraft","The Sims"});
		
		Profile p3 = new Profile("Qwerty", "London", "England" , "English", 12, 42, 123,
				new String[] {"Minecraft","The Sims"});
		
		BSTNode node1 = new BSTNode(p1);
		BSTNode node2 = new BSTNode(p2);
		BSTNode node3 = new BSTNode(p3);
		
		node1.setLeft(node2);
		node2.setRight(node3);
		
		System.out.println(node1.getProfile().getName());
		System.out.println(node1.getLeft().getProfile().getName());
		System.out.println(node1.getLeft().getRight().getProfile().getName());
		
		
	}

}
