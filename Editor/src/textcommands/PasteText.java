package textcommands;

import commands.*;
import gui.*;
import editorproxy.*;
import memento.*;

public class PasteText implements TextCommand{
	
	
	String textBefore;
	String textAfter;
	int tabNum;
	EditorGUI gui;
	EditorProxy proxy;
	TextState memento;
	
	public PasteText(String textBefore,String textAfter,
	int tabNum,EditorGUI gui,EditorProxy proxy,TextState memento){
		this.textBefore=textBefore;
		this.textAfter=textAfter;
		this.tabNum=tabNum;
		this.gui=gui;
		this.proxy=proxy;
		this.memento=memento;
	}
	
	public void execute(){
		gui.replaceText(textBefore+proxy.getCut()+textAfter, tabNum);
	}
	
	public void undo(){
		gui.replaceText(memento.getText(), tabNum);
		gui.setCaret(memento.getCaret());
	}
}
