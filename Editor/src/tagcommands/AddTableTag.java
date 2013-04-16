package tagcommands;
import commands.TagCommand;
import gui.*;
import java.util.ArrayList;

import constructs.*;
import memento.*;

public class AddTableTag implements TagCommand{
	
	String tag;
	int numTr;
	int numTd;
	int tabNum;
	//a referance to the gui
	EditorGUI gui;
	TextState memento;
	
	
	public AddTableTag(int tabNum,EditorGUI gui,TextState memento){
		this.tag="table";
		//update this with a popup in the future
		this.numTr=3;
		this.numTd=2;
		
		this.tabNum=tabNum;
		this.gui=gui;
		this.memento=memento;
	}
	
	public void execute(){
		//create complextag
		ComplexTag table=new ComplexTag(tag,new ArrayList<Construct>());
		//create numTr # of tr tags
		for(int i=0;i<numTr;i++){
			ComplexTag tr=new ComplexTag("tr",new ArrayList<Construct>());
			//create numTd # of Td tags for each Tr tag
			for(int j=0;j<numTd;j++){
				BasicTag td=new BasicTag("td","");
				//add the td tag to the tr
				tr.append(td);
			}
			//add the tr tag to the table
			table.append(tr);
		}
		//add it to the textarea
		gui.addText(table.toString(0),tabNum);
	}
	
	public void undo(){
		gui.replaceText(memento.getText(), tabNum);
		gui.setCaret(memento.getCaret());
	}
}
