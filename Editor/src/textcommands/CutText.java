package textcommands;

import commands.*;
import gui.*;
import editorproxy.*;


public class CutText implements TextCommand{
	
	
	
	

	String textBefore;
	String textAfter;
	String cut;
	int tabNum;
	EditorGUI gui;
	EditorProxy proxy;
	
	
	public CutText(String textBefore,String textAfter,
	String cut,int tabNum, EditorGUI gui,EditorProxy proxy){

		this.textBefore=textBefore;
		this.textAfter=textAfter;
		this.cut=cut;
		this.tabNum=tabNum;
		this.gui=gui;
		this.proxy=proxy;
	}
	
	public void execute(){
		
		//have the proxy forward this request to the editor
		proxy.setCut(cut);
		
		gui.replaceText(textBefore+textAfter,tabNum);
		
	}
}

