package constructs;



public abstract class Construct{
	//superclass of primitive and composite Constructs
	
	
	private String tag;
	
	
	
	//Construct Constructor method
	public Construct(String tag){
		//build the construct object here
		this.tag=tag;

		
	}
	
	
	//subclasses of Construct will have to implement operation
	public abstract String toString(int indentationLevel);
	
	
	public String determineSpacing(int indentationLevel){
		String spacing="";
		for(int i=0; i<indentationLevel;i++){
			spacing+="\t";//possibly gather this value from
			//settings later
		}
		return spacing;
	}
	
	public String getTag(){
		return tag;
	}
	

	
	/**
	 * This is a script that hardcodes the various html tage that will be used, 
	 * and inserts them into a hashmap. This hash maps strings (the characters 
	 * inside the tag) to the construct object itself. 
	 * @return
	 */
	

	
	//end class
}
