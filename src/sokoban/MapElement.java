/* Matt Nicol
 * OOP Sokoban v0.3
 * 12/12/18
 * Eclipse V2018-09 4.9.0 
 */


package sokoban;


//review all this

public enum MapElement {
    WALL('X'),
    FLOOR(' '),
    CRATE('*'),
    DIAMOND('.'),
    KEEPER('@'),
    CRATE_ON_DIAMOND('O'),
    DEBUG_OBJECT('=');
	
	private final char imageSymbol;
	
	MapElement(final char imageSymbol){
		this.imageSymbol = imageSymbol;
	}
	
	/**
	 * This returns the elements associated with their characters.
	 * Where the character is not associated to an enum, it @return's the floor.
	 */
	   public static MapElement fromChar(char c) {
	        for (MapElement t : MapElement.values()) {
	            if (Character.toUpperCase(c) == t.imageSymbol) {
	                return t;
	            }
	        }

	        return FLOOR;
	    }
	   
	   public String getStringSymbol() {
		   return String.valueOf(imageSymbol);  //Returns the string of the images symbol
	   }
	   
	   public char getCharSymbol() {
		   return imageSymbol;  //Returns the symbol of the map element
	   }
}
