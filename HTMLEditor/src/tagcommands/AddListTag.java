package tagcommands;
import commands.TagCommand;

import constructs.*;
import editorproxy.*;


public class AddListTag implements TagCommand{
	
	public AddListTag(){
		
	}
	
	public void execute(String tag, int numReps,int tabNum){
		//logic to create a ComplexTag and add the subTags to it
		//ComplexTag.complexToBuffer(tag,subTag,numReps);
		EditorProxy editor=EditorProxy.getInstance();
		//if the tag is ol or ul, it is a list, only 
		//has one subcomponent
		
		
		editor.addListTag(tag,numReps,tabNum);
		
	}
	
	//end class
}