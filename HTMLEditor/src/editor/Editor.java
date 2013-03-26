package editor;


import fileproxy.*;


import java.util.*;
import java.io.*;




/**
 * 
 * @author Josh Woodward
 * 
 *The editor class is the main controller in this system.
 */
public class Editor{
	
	
	private ArrayList<HTMLFile> openFiles;
	
	/**
	 * Constructor for Editor class
	 */
	public Editor(){
		
	}
	
	/**
	 * 
	 * @param file the .html file that needs to be opened. This method will 
	 * create a new HTMLFile object, and store it in the openFiles ArrayList
	 */
	public void openFile(File file){
		HTMLFile openedFile=new HTMLFile(file);
		openFiles.add(openedFile);
	}
	
	

	
	


	
	
	//end class
}