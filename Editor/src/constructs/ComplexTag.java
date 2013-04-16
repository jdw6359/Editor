package constructs;
import java.util.ArrayList;

public class ComplexTag extends Construct{
	
	ArrayList<Construct> content;
	
	
	/**
	 * Constructor for ComplexTag, makes call to
	 * superclass (Construct) for construction
	 */
	public ComplexTag(String tag, ArrayList<Construct> content){
		super(tag);
		this.content=content;
	}
	
	
	/**
	 * method that implements the abstract toString method
	 * of its superclass, Construct
	 */
	public String toString(int indentationLevel){
		//need to "start" the string if it is on its first level
		String text="";
		text+=this.determineSpacing(indentationLevel);
		text+="<"+super.getTag()+">\n";
		//loop through content, and perform toString operation
		for(Construct c: content){
			text+=c.toString(indentationLevel+1);
		}
		text+=this.determineSpacing(indentationLevel)+"</"+super.getTag()+">\n";
		
		return text;
		
	}
	
	
	public void append(Construct c){
		content.add(c);
	}
	
	public void add(int numAdd, Construct c){
		content.add(numAdd,c);
	}
	
	public Construct remove(int numChild){
		return content.remove(numChild);
	}
	
	public Construct getChild(int numChild){
		return content.get(numChild);
	}
	
	
	
	//end class
}