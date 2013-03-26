package commands;
import constructs.*;

public class AddSimpleTag implements TagCommand{
	
	
	
	public AddSimpleTag(){
		
	}
	
	//important to realize that subTag and numReps are not used
	public void execute(String tag, String subTag,int numReps){
		//logic to create a simple tag with the specified tag and add it to the buffer
		BasicTag.basicToBuffer(tag);
	}
	
}