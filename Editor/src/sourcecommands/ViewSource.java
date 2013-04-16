package sourcecommands;
import commands.SourceCommand;



import gui.*;

public class ViewSource implements SourceCommand{
	
	String tag;
	String text;
	EditorGUI gui;
	
	public ViewSource(String tag,String text, EditorGUI gui){
		this.tag=tag;
		this.text=text;
		this.gui=gui;
	}
	
	/**
	 * called by editor. Will delegate the finding of the tags
	 * to getTags(), and will update the gui with the new tags
	 */
	public void execute(){
		
	}
	
	/**
	 * 
	 * @return ArrayList of strings that represent the source
	 * of the specific tag
	 */
	
	/**
	private ArrayList<String> getTags(){
		
	}
	*/
}