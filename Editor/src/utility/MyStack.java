package utility;
import commands.UndoableCommand;
/**
 * 
 * @author Josh Woodward
 * 
 * A special data structure that will only be able to hold 
 * two command objects. 
 *
 */
public class MyStack{
	
	UndoableCommand top;
	UndoableCommand bottom;
	
	
	//initializes components to 
	public MyStack(){
		top=null;
		bottom=null;
		
	}
	
	/**
	 * 
	 * @param command Command to be added
	 * to the structure
	 */
	public void add(UndoableCommand command){
		bottom=top;
		top=command;
		System.out.println("Command Added to top");
	}
	
	/**
	 * 
	 * @return Command, the top 
	 * element 
	 */
	public UndoableCommand pop(){
		UndoableCommand ret=top;
		top=bottom;
		bottom=null;
		return ret;
	}
}