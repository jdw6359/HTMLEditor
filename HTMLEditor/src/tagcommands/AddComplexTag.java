package tagcommands;
import commands.TagCommand;

import constructs.*;
import editorproxy.*;

public class AddComplexTag implements TagCommand{
	
	public AddComplexTag(){
		
	}
	
	public void execute(String tag, int numReps, int tabNum){
		
		EditorProxy editor=EditorProxy.getInstance();
		if(tag=="table"){
			editor.addTableTag(tag,numReps,tabNum);
		}else{
			//if it is a dict tag
			editor.addDictTag(tag,numReps,tabNum);
		}
	}
}