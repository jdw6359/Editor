package tagcommands;
import commands.TagCommand;
import java.util.ArrayList;

import gui.*;
import constructs.*;



public class AddListTag implements TagCommand{
	
	String tag;
	int numLi;
	int tabNum;
	//a reference to the gui
	EditorGUI gui;
	
	public AddListTag(String tag, int tabNum, EditorGUI gui){
		this.tag=tag;
		//update this with a popup in the future
		this.numLi=3;
		
		this.tabNum=tabNum;
		this.gui=gui;
	}
	
	public void execute(){
		//create complex tag
		ComplexTag list=new ComplexTag(tag,new ArrayList<Construct>());
		//create numLi # of list items
		for(int i=0;i<numLi;i++){
			BasicTag li=new BasicTag("li","");
			//add the li tag to the list
			list.append(li);
		}
		//add it to the textarea
		gui.addText(list.toString(0), tabNum);
	}
	
	//end class
}