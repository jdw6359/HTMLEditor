package tagcommands;
import commands.TagCommand;

import constructs.*;
import editorproxy.*;

public class AddSimpleTag implements TagCommand{
	
	
	
	public AddSimpleTag(){
		
	}
	
	//important to realize that subTag and numReps are not used
	public void execute(String tag,int numReps,int tabNum){
		//logic to create a simple tag with the specified tag and add it to the buffer
		EditorProxy editor=EditorProxy.getInstance();
		editor.addBasicTag(tag,tabNum);
		
	
	}
	
}