package tagcommands;
import commands.TagCommand;
import memento.*;
import java.util.ArrayList;

import gui.*;
import constructs.*;



public class AddListTag implements TagCommand{
	
	String tag;
	int numLi;
	int tabNum;
	//a reference to the gui
	EditorGUI gui;
	TextState memento;
	
	public AddListTag(String tag, int tabNum, EditorGUI gui, TextState memento){
		this.tag=tag;
		//update this with a popup in the future
		this.numLi=3;
		
		this.tabNum=tabNum;
		this.gui=gui;
		this.memento=memento;
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
	
	public void undo(){
		gui.replaceText(memento.getText(),tabNum);
		gui.setCaret(memento.getCaret());
	}
	
	//end class
}