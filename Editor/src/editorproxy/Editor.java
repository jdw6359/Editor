package editorproxy;



import utility.*;
import commands.*;




/**
 * 
 * @author Josh Woodward
 * 
 *The editor class is the main controller in this system.
 */
public class Editor{
	

	private String cutText="";
	private MyStack stack;
	
	
	/**
	 * Constructor for Editor class
	 */
	public Editor(){
		stack=new MyStack();
		
	}
	


	
	/**
	 * 
	 * @param fileCommand The file command object that needs to 
	 * be executed
	 */
	public void handleCommand(FileCommand fileCommand){
		//logic to fire command object
		fileCommand.execute();
	}

	/**
	 * 
	 * @param tagCommand The TagCommand object that needs to 
	 * be executed
	 */
	public void handleCommand(TagCommand tagCommand){
		//TODO: create memento of current state
		//state needed:
		//text 
		//caret position
		
		
		//TODO: add memento to command object
		
		
		
		//Fire command object
		tagCommand.execute();
		//add command object to undo stack
		stack.add(tagCommand);
	}
	
	/**
	 * 
	 * @param textCommand The TextCommand obejct that needs to
	 * be executed
	 */
	public void handleCommand(TextCommand textCommand){
		//Fire command object
		textCommand.execute();
		//add command object to undo stack
		stack.add(textCommand);
	}
	
	public void setCut(String cut){
		cutText=cut;
	}
	
	public String getCut(){
		return cutText;
	}
	

	
	
	
	
	
	
	
	
	


	
	
	
	
	
	

	

	
	

	
	

	
	


	
	
	//end class
}