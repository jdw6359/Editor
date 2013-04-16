package tagcommands;
import commands.TagCommand;

import constructs.*;
import gui.*;
import memento.*;

public class AddSimpleTag implements TagCommand{
	
	String tag;
	String content;
	int tabNum;
	//a reference to the gui
	EditorGUI gui;
	TextState memento;
	
	
	public AddSimpleTag(String tag,int tabNum, EditorGUI gui,TextState memento){
		this.tag=tag;
		//update this with a popup in the future
		this.content="";
		
		this.tabNum=tabNum;
		this.gui=gui;
		this.memento=memento;
	}
	
	//important to realize that subTag and numReps are not used
	public void execute(){
		//logic to create a simple tag with the specified tag and add it to the buffer
		BasicTag base=new BasicTag(tag,content);
		//add it to the text area
		gui.addText(base.toString(0),tabNum);
		
		
	
	}
	
}