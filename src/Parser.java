public interface Parser{
	/**
	 * This is the only functionality needed to run the parser 
	 * Parsers implementing this may hold an internal DFA 
	 * getNext() should effectively be the DFA walker mentioned in the hw definition
	 */
	public void loadFile(String fileName); //initializes a stream for tokenizing
	public boolean hasNext();//EOF?
	public String getNext(); //reads stream feeding chars into DFA until token is finished or failure (walker)
}