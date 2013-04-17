package editorproxy;

import commands.*;

public interface EditorAbstraction{

	//here, all of the methods that HTMLFile will have need to be laid out
	//HTMLFile and HTMLFileProxy will both implement this interface, thus
	//following the proxy pattern. 
	
	
	public void handleCommand(TagCommand tagCommand);
	public void handleCommand(FileCommand fileCommand);
	public void handleCommand(TextCommand textCommand);
	
}