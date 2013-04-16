package filecommands;

import commands.FileCommand;


import gui.*;


public class NewFile implements FileCommand{
	
	EditorGUI gui;
	
	public NewFile(EditorGUI gui){
		this.gui=gui;
	}
	
	
	
	public void execute(){
	//create a new canvas, and possibly have it start with the basic 
	//html constructs
	
	String tabName = "Default.html";
		gui.addPane(tabName);
		
	}
	

}