import java.io.*;
import java.util.*;

public class FileReader {
	
	/**
	 * Method to try and get the file, if the file is found then
	 * the method readDataFromFile is called
	 * @param fileName, name of the file
	 * @return tree created from the readDataFromFileMethod
	 * @throws FileNotFoundException
	 */
	public static BST readProfiles(String fileName) throws FileNotFoundException{
		Scanner in = null;
		try{
			in = new Scanner(new File(fileName));
		}
		catch(FileNotFoundException e){
			throw new FileNotFoundException("Error. file not found");
		}
		return readDataFromFile(in);
	}
	
	/**
	 * Method to read the txt file and create profiles from the
	 * information provided entered from the txt file
	 * @param in, Scanner of txt file
	 * @return binary tree of the profiles created
	 */
	private static BST readDataFromFile(Scanner in){
		BST tree = new BST();
		ArrayList<String> interests = new ArrayList <>();
		
		try{
			while(in.hasNextLine()){
				String line = in.nextLine();
				Scanner lineScanner = new Scanner(line);
				
				String name = lineScanner.next();
				int day = lineScanner.nextInt();
				int month = lineScanner.nextInt();
				int year = lineScanner.nextInt();
				String town = lineScanner.next();
				String country = lineScanner.next();
				String nationality = lineScanner.next();
				
				while(lineScanner.hasNext()){
					interests.add(lineScanner.next());
				}
				
				String[] interestArray = new String[interests.size()];
				interestArray = interests.toArray(interestArray);
				
				Profile newProfile = new Profile(name, town, country, nationality,
						day, month, year, interestArray);
				
				tree.insertProfile(newProfile);
			}
		}
		catch(NullPointerException e){
			System.out.println("Null pointer exception");
		}
		
		in.close(); //close the txt file
		return tree; //return the tree made
	}
	
	
}	
