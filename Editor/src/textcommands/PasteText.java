package textcommands;

import commands.*;
import gui.*;
import editorproxy.*;


public class PasteText implements TextCommand{
	
	
	String textBefore;
	String textAfter;
	int tabNum;
	EditorGUI gui;
	EditorProxy proxy;
	
	public PasteText(String textBefore,String textAfter,
	int tabNum,EditorGUI gui,EditorProxy proxy){
		this.textBefore=textBefore;
		this.textAfter=textAfter;
		this.tabNum=tabNum;
		this.gui=gui;
		this.proxy=proxy;
	}
	
	public void execute(){
		gui.replaceText(textBefore+proxy.getCut()+textAfter, tabNum);
	}
}
