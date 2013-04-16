package textcommands;

import commands.*;
import gui.*;
import editorproxy.*;
import memento.*;

public class CutText implements TextCommand{
	
	String textBefore;
	String textAfter;
	String cut;
	int tabNum;
	EditorGUI gui;
	EditorProxy proxy;
	TextState memento;
	
	public CutText(String textBefore,String textAfter,
	String cut,int tabNum, EditorGUI gui,EditorProxy proxy,TextState memento){

		this.textBefore=textBefore;
		this.textAfter=textAfter;
		this.cut=cut;
		this.tabNum=tabNum;
		this.gui=gui;
		this.proxy=proxy;
		this.memento=memento;
	}
	
	public void execute(){
		
		//have the proxy forward this request to the editor
		proxy.setCut(cut);
		
		gui.replaceText(textBefore+textAfter,tabNum);
		
	}
	
	public void undo(){
		gui.replaceText(memento.getText(),tabNum);
		gui.setCaret(memento.getCaret());
	}
}

