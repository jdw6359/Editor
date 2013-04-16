package tagcommands;
import commands.TagCommand;

import constructs.*;
import gui.*;
import memento.*;

public class AddImageTag implements TagCommand{

	EditorGUI gui;
	TextState memento;
	String src;
	String imgName;
	int tabNum;
	String tag;
	
	public AddImageTag(String src, String imgName, int tabNum, EditorGUI gui, TextState memento){
		this.tag = "img src";
		this.gui = gui;
		this.memento = memento;
		this.src = src;
		this.imgName = imgName;
		this.tabNum = tabNum;
	}
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
	public void execute() {
		BasicTag base=new BasicTag(tag, src, imgName);
		gui.addText(base.imgString(0), tabNum);
		
	}

}
