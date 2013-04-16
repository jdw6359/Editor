package utility;
import commands.Command;
/**
 * 
 * @author Josh Woodward
 * 
 * A special data structure that will only be able to hold 
 * two command objects. 
 *
 */
public class MyStack{
	
	Command top;
	Command bottom;
	
	
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
	public void add(Command command){
		bottom=top;
		top=command;
		System.out.println("Command Added to top");
	}
	
	/**
	 * 
	 * @return Command, the top 
	 * element 
	 */
	public Command pop(){
		Command ret=top;
		top=bottom;
		bottom=null;
		return ret;
	}
}