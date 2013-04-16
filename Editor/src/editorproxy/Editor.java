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
	
	public void handleCommand(SourceCommand sourceCommand){
		//fire command object
		sourceCommand.execute();
	}

	/**
	 * 
	 * @param tagCommand The TagCommand object that needs to 
	 * be executed
	 */
	public void handleCommand(TagCommand tagCommand){
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

	
	public void respondToUndo(){
		//will pop the top most command off of the stack, and 
		//call its undo method
		UndoableCommand undoable=stack.pop();
		if(undoable!=null){
			undoable.undo();
		}
	}
	
	public void setCut(String cut){
		cutText=cut;
	}
	
	public String getCut(){
		return cutText;
	}
	

	
	
	
	
	
	
	
	
	


	
	
	
	
	
	

	

	
	

	
	

	
	


	
	
	//end class
}