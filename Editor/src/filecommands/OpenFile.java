package filecommands;

import commands.FileCommand;
import gui.*;
import javax.swing.*;
import java.io.*;

public class OpenFile implements FileCommand{
	
	EditorGUI gui;
	public OpenFile(EditorGUI gui){
		this.gui = gui;
	}
	
	public void execute(){
		//open file, validate, and send text to new canvas screen
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(null);
		
		 if (returnVal == JFileChooser.APPROVE_OPTION) {
			try{
			File file = chooser.getSelectedFile();
            BufferedReader br = new BufferedReader( new FileReader(file));
            
            String tabName = file.getName();
    		gui.addPane(tabName);
    		int tabCount = gui.tabbedPane.getTabCount();
            		
            String line = "";
            
            while((line = br.readLine()) != null){
            	String addLine = line+"\n";
            	gui.addText(addLine, tabCount-1);// (tabCount-1); //.append(line + "\n");
            }
            br.close();
            }
            catch(Exception ex){}
        }
		 
	}
}