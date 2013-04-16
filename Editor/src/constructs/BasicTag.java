package constructs;
public class BasicTag extends Construct{
	
	private String content;
	
	
	/**
	 * Constructor for BasicTag, makes call to 
	 * superclass (Construct) for construction
	 */
	public BasicTag(String tag, String content){
		super(tag);
		this.content=content;
	}
	
	/**
	 * method that implements the abstract toString method
	 * of its superclass, Construct
	 */
	public String toString(int indentationLevel){
		//must implement operation here
		return super.determineSpacing(indentationLevel)+"<"+ super.getTag()+">"+content+"</"+super.getTag()+">\n";
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content){
		this.content=content;
	}
	

	
	
	
	
	
	
	
	//end class
}