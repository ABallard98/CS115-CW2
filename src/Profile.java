import java.util.*;


public class Profile {
	
	String name, town, country, nationality;
	int day, month, year;
	String[] interests;
	Profile[] friends;
	/**
	 * Constructor of a new profile
	 * @param name, name of person
	 * @param town, location of person
	 * @param nationality, nationality of person
	 * @param day, day person was born
	 * @param month, month person was born
	 * @param year, year person was born
	 */
	public Profile(String name, String town, String country, String nationality,
			int day, int month, int year, String[] interests){
		this.name = name;
		this.town = town;
		this.country = country;
		this.nationality = nationality;
		this.day = day;
		this.month = month;
		this.year = year;
		this.interests = interests;
		this.friends = new Profile[0]; 
	}
	
	/**
	 * Method to add an interest to the array by converting the
	 * array to an array list, then adding the new interest and
	 * finally converting it back to an array
	 * @param interest
	 */
	public void addInterest(String interest){
		ArrayList <String> temp = new ArrayList<String>(Arrays.asList(interests));
		temp.add(interest);
		this.interests = temp.toArray(interests);
	}
	
	
	/**
	 * Method to add a friend to the friends array
	 * @param p , profile of friend to be added
	 */
	public void addFriend(Profile p){
		ArrayList<Profile> temp = new ArrayList<Profile>(Arrays.asList(friends));
		temp.add(p);
		this.friends = temp.toArray(friends);
	}
	
	/**
	 * Method to return the friends as a long string
	 * If no friends then it returns a string saying
	 * no strings found
	 * @return friends as a string
	 */
	public String getFriends(){
		String output = "";
		for(Profile e : friends){
			output = output + " " + e.getName();
		}
		return output;
	}
	
	/**
	 * Method to return the date of birth of a profile in a string
	 * @return date of birth string
	 */
	public String getDateOfBirth(){
		return (this.day + "/" + this.month + "/" + this.year);
	}
	
	/**
	 * Method to return town of profile
	 * @return town string
	 */
	public String getTown(){
		return this.town;
	}
	
	/**
	 * Method to return country of profile
	 * @return country string
	 */
	public String getCountry(){
		return this.country;
	}
	
	/**
	 * Method to return name of profile 
	 * @return name string
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Method to make a string of the profile's interests
	 * @return String of interests
	 */
	public String getInterests(){
		String output = "";
		for(int i = 0; i < interests.length; i++){
			output = output + interests[i] + ", ";
		}
		return output;
	}
	
	/**
	 * Method to produce a string of the profile's information
	 * @return String containing profiles information
	 */
	public String toString(){
		String output = "";
		output = "Name: " + this.getName()+ "\n" 
				+ "DOB: " + this.getDateOfBirth() + "\n" 
				+ "Town: " + this.getTown() + "\n"
				+ "Country: " + this.country + "\n" 
				+ "Nationality: " + this.nationality + "\n" 
				+ "Interests: " + this.getInterests() + "\n"
				+ "Friends: " + this.getFriends();
		return output;
				
	}
	
	
}
