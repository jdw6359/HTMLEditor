package filecommands;

import commands.FileCommand;

import editorproxy.*;



public class NewFile implements FileCommand{
	
	private EditorProxy editor=EditorProxy.getInstance();
	
	public NewFile(){
		
	}
	
	
	
	public void execute(){
	//create a new canvas, and possibly have it start with the basic 
	//html constructs
	
	
		editor.addFile();
		
	}
}