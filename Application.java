/**
 * An application class that implements the methods in the Dictionary class.
 * @author aelias2
 *
 */
public class Application {

	public static void main(String[] args) {
		/**
		 * A new Dictionary object is instantiated.
		 */
		Dictionary testDictionary = new Dictionary();
		
		/**
		 * The dictionary loads the keys and definitions from the CSV file.
		 */
		testDictionary.loadDictionaryFromCSV();
		
		/**
		 * The dictionary's unsorted contents are printed.
		 */
		testDictionary.printDictionary();
		
		/**
		 * Five keys are searched in the dictionary.  The keys, definitions, and hash keys for each are printed.
		 */
		testDictionary.searchDictionary("laud");
		testDictionary.searchDictionary("cordwainer");
		testDictionary.searchDictionary("sea coal");
		testDictionary.searchDictionary("peradventure");
		testDictionary.searchDictionary("glabriety");
	}//end main

}//end class
