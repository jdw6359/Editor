package memento;

public class TextState{
	
	String text;
	int caretPosition;
	
	/**
	 * Constructor for TextState
	 */
	public TextState(String text, int caretPosition){
		this.text=text;
		this.caretPosition=caretPosition;
	}
	
	public String getText(){
		return text;
	}
	
	public int getCaret(){
		return caretPosition;
	}
	
	
}