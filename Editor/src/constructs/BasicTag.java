package constructs;
public class BasicTag extends Construct{
	
	private String content;
	private String src;
	private String name;
	
	
	/**
	 * Constructor for BasicTag, makes call to 
	 * superclass (Construct) for construction
	 */
	public BasicTag(String tag, String content){
		super(tag);
		this.content=content;
	}
	
	public BasicTag(String tag, String src, String name){
		super(tag);
		this.src = src;
		this.name = name;
	}
	
	/**
	 * method that implements the abstract toString method
	 * of its superclass, Construct
	 */
	public String toString(int indentationLevel){
		//must implement operation here
		return super.determineSpacing(indentationLevel)+"<"+ super.getTag()+">"+content+"</"+super.getTag()+">\n";
	}
	
	public String imgString(int indentationLevel){
		return super.determineSpacing(indentationLevel)+"<"+ super.getTag()+"=\""+src+"\" alt=\""+name+"\">\n";
	}
	
	public String anchorString(int indentationLevel){
	// insert anchor tag operation
		return super.determineSpacing(indentationLevel)+"<"+ super.getTag()+src+">"+name+"</"+super.getTag()+">\n";
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content=content;
	}
	

	
	
	
	
	
	
	
	//end class
}