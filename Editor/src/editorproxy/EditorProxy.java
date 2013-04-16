package editorproxy;


import commands.*;


public class EditorProxy implements EditorAbstraction{
	
	//used to decide whether or not to forward requests to the realSubject, HTMLFile
	
	
	private Boolean validated=true;
	private Editor editor=new Editor();
	
	//uses the boolean object
	
	
	public EditorProxy(){
		
		
	}
	
	/**
	 * 
	 * @param fileCommand The command object to be 
	 * sent to the editor for handling
	 */
	public void handleCommand(FileCommand fileCommand){
		editor.handleCommand(fileCommand);
	}
	
	
	/**
	 * 
	 * @param tagCommand The command object to be
	 * sent to the editor for handling (validation 
	 * dependant)
	 */
	public void handleCommand(TagCommand tagCommand){
		if(validated){
			//pass command off
			editor.handleCommand(tagCommand);
		}else{
			//dont pass command off
		}
	}
	
	/**
	 * 
	 * @param textCommand The command object to be 
	 * sent to the editor for handling (validation 
	 * dependant)
	 */
	public void handleCommand(TextCommand textCommand){
		if(validated){
			//pass command off
			editor.handleCommand(textCommand);
		}else{
			//dont pass command off
		}
	}
	
	public void handleCommand(SourceCommand sourceCommand){
		if(validated){
			//pass command off
			editor.handleCommand(sourceCommand);
		}else{
			//dont pass command off
		}
	}
	
	public void setCut(String cut){
		editor.setCut(cut);
	}
	
	public String getCut(){
		return editor.getCut();
	}


	

	
	
}