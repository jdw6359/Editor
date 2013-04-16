package filecommands;

import commands.FileCommand;
import gui.*;
import javax.swing.*;
import java.io.*;
public class SaveFile implements FileCommand{
	
	EditorGUI gui;
	public SaveFile(EditorGUI gui){
		this.gui = gui;
	}
	
	public void execute(){
		//perform validation, then copy buffer to .html file
	}
}