package tagcommands;

import commands.TagCommand;
import gui.*;
import java.util.ArrayList;

import constructs.*;

public class AddDictTag implements TagCommand{
	
	String tag;
	int numDt;
	int tabNum;
	//a reference to the gui
	EditorGUI gui;
	
	public AddDictTag(int tabNum, EditorGUI gui){
		this.tag="dl";
		//update this with a popup in the future
		this.numDt=3;
		
		this.tabNum=tabNum;
		this.gui=gui;
	}
	
	public void execute(){
		//create complextag
		ComplexTag dict=new ComplexTag(tag,new ArrayList<Construct>());
		
		//create numDt # of <dt>
		for(int i=0;i<numDt;i++){
			ComplexTag dt=new ComplexTag("dt",new ArrayList<Construct>());
			//create a dd
			BasicTag dd=new BasicTag("dd","");
			//add the dd to the dt
			dt.append(dd);
			//add the dt to the dictionary
			dict.append(dt);
		}
		gui.addText(dict.toString(0), tabNum);
	}
	
}