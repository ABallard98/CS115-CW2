import java.io.FileNotFoundException;
import java.util.*;
public class FileReaderMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("file reader test");
		System.out.println("insert file name: ");
		String filename = in.next()+".txt"; //adding .txt to string because im lazy
				
		try {
			BST tree = FileReader.readProfiles(filename);
			tree.profilesPreOrder(tree.getRoot()); //print the tree nodes whole profile
			System.out.println("\nTree in order:");
			tree.printAlphabetical(tree.getRoot()); //print the whole tree in alphabetical order
			
		} catch (FileNotFoundException e) { 
			System.out.println("Error: file not found");
		}
		
	
		
		
	}

}
