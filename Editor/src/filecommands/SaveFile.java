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

		int tabCount = gui.tabbedPane.getTabCount();
		if(tabCount == 0){
        	//String message = "Cannot save unopened file!";
        	//JOptionPane alertMessage = new JOptionPane(message);
        	JOptionPane.showMessageDialog(gui, "Cannat save unopened file", "Error", JOptionPane.ERROR_MESSAGE);
        }
		else{
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showSaveDialog(null);
        		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try{
			File file = chooser.getSelectedFile();
            BufferedWriter wr = new BufferedWriter( new FileWriter(file));
            
            String line = gui.getText();
            wr.write(line);
            wr.close();
            
            }
            catch(Exception ex){}
        }
	}
	}
}