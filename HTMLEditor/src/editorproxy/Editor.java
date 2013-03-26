package editorproxy;


import editorproxy.*;
import gui.*;
import constructs.*;


import java.util.*;
import java.io.*;

/**
 * 
 * @author Josh Woodward
 * 
 *The editor class is the main controller in this system.
 */
public class Editor{
	
	private EditorGUI gui=EditorGUI.getInstance();
	private boolean autoWrap;
	private boolean autoIndent;
	
	
	/**
	 * Constructor for Editor class
	 */
	private Editor(){
		
	}
	
	public static Editor getInstance(){
		return new Editor();
	}
	
	public EditorGUI getGUI(){
		return gui;
	}
	

	
	
	
	
	
	//begin shared methods with the proxy
	
	
	
	public void addFile(){
		gui.addPane();
	}
	
	public void addBasicTag(String tag, int tabNum){
		//create basictag
		BasicTag basic=new BasicTag(tag,"");
		
		//add it to the textarea
		gui.addText(basic.toString(0),tabNum);
	}
	

	
	

	
	


	
	
	//end class
}