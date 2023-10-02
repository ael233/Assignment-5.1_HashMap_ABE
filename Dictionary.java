/**A class that implements a HashMap dictionary
 * @author aelias2
 */
import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class Dictionary {

	/**
	 * Instantiates csvFile as a string variable referencing the CSV file containing the keys and definitions.
	 */
	String csvFile = "DictionaryWordValuePairs CSV.csv";
	String delimiter = ",";
	
	/**
	 * Constructs the archaicDictionary HashMap.
	 */
	HashMap<String, String> archaicDictionary = new HashMap<String, String>();
	
	/**
	 * A method to load the key and definitions from the CSV file.
	 */
	public void loadDictionaryFromCSV() {
		try {
			Scanner sc = new Scanner(new File(csvFile));

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] parts = line.split(delimiter);
				
				if (parts.length == 2) {
					String word = parts[0].trim();
					String definition = parts[1].trim();
					archaicDictionary.put(word,  definition);
				}//end if
			}//end while
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}//end catch
	}//end loadDictoinaryFromCSV

	/**
	 * A method to print the unsorted dictionary keys and definitions.
	 */
	public void printDictionary() {
		for(HashMap.Entry<String, String> entry: archaicDictionary.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			
		}//end for
	}//end printDictionary
	
	/**
	 * A method to search for a key in the dictionary.
	 * @param key, a word for which the dictionary will be searched.
	 */
	public void searchDictionary(String key) {
		if (archaicDictionary.containsKey(key)) {
			String definition = archaicDictionary.get(key);
			int hashKey = key.hashCode();
			System.out.println("Word: " + key);
			System.out.println("Definition: " + definition);
			System.out.println("Hash Key: " + hashKey);
		} else {
			System.out.println("That word is not in the dictionary: " + key);
		}//end else
	}//end searchDictionary
	
}//end class
