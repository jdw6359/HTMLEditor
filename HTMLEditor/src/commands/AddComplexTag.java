package commands;
import constructs.*;


public class AddComplexTag implements TagCommand{
	
	public AddComplexTag(){
		
	}
	
	public void execute(String tag, String subTag, int numReps){
		//logic to create a ComplexTag and add the subTags to it
		ComplexTag.complexToBuffer(tag,subTag,numReps);
	}
	
	//end class
}