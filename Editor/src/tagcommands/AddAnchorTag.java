package tagcommands;
import commands.TagCommand;

import constructs.*;
import gui.*;
import memento.*;

public class AddAnchorTag implements TagCommand{

	EditorGUI gui;
	TextState memento;
	String URL;
	String linkText;
	int tabNum;
	String tag;
	
	public AddAnchorTag(String URL, String linkText, int tabNum, EditorGUI gui, TextState memento){
		this.tag = "a";
		this.gui = gui;
		this.memento = memento;
		this.URL = URL;
		this.linkText = linkText;
		this.tabNum = tabNum;
	}
	public void undo() {
		//memento will be implemented here
		
	}

	
	public void execute() {
		BasicTag base=new BasicTag(tag, URL, linkText);
		gui.addText(base.anchorString(0), tabNum);
		
	}

}
