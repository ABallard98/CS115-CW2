
public class BSTMain {
	
	public static void main(String []args){
		
		Profile p1 = new Profile("Ayden", "Newquay", "England", "English", 29, 04, 1998,
				new String[] {"Guitar","Gaming"});

		Profile p2 = new Profile("Robyn", "Forest", "Wales" , "Welsh", 16, 07, 1996,
				new String[] {"Minecraft","The Sims"});
		
		Profile p3 = new Profile("Ben", "Southampton", "England" , "English", 12, 2, 1234,
				new String[] {"Anime","Being a weeb"});
		
		Profile p4 = new Profile("Andre", "Jburg", "South Africa" , "South African", 13 , 3, 1337,
				new String[] {"League", "being a druggo"});
		
		BST tree = new BST();
		System.out.println("Tree is empty: " + tree.isEmpty());
		System.out.println("Adding 4 profiles");
		
		
		tree.insertProfile(p1);
		tree.insertProfile(p2);
		tree.insertProfile(p3);
		tree.insertProfile(p4);
		
		System.out.println("Tree is empty: " + tree.isEmpty());
		System.out.println("Root is " + tree.getRoot().getProfile().getName());
		
		System.out.println("\nNames in order: ");
		tree.printAlphabetical(tree.getRoot());
		
		System.out.println("\nProfiles pre order: ");
		tree.profilesPreOrder(tree.getRoot());
		
		System.out.println("\nAdding 2 friends to " + tree.getRoot().getProfile().getName() + "\n");
		tree.getRoot().getProfile().addFriend(p4);
		tree.getRoot().getProfile().addFriend(p3);
		System.out.println(tree.getRoot().getProfile().toString());
		
	}
	
	
}
