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
	private String cutText="";
	
	
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
	
	public void addListTag(String tag, int numReps, int tabNum){
		//create complex tag
		ComplexTag complex=new ComplexTag(tag, new ArrayList<Construct>());
		
		//create basic tags using subTag and numReps 
		for(int i=0;i<numReps; i++){
			BasicTag base=new BasicTag("li","");
			//add subTag to the complex tag
			complex.append(base);
		}
		
		//add it to the textarea
		gui.addText(complex.toString(0),tabNum);
		
	}
	
	public void addTableTag(String tag,int numReps,int tabNum){
		//create complex tag
		ComplexTag table=new ComplexTag("table",new ArrayList<Construct>());
		//create numReps # of tr tags
		for(int i=0;i<numReps;i++){
			ComplexTag tr=new ComplexTag("tr",new ArrayList<Construct>());
			//create numReps # of td tags for each tr tag
			for(int j=0;j<numReps;j++){
				BasicTag td=new BasicTag("td","");
				//add the td tag to the tr
				tr.append(td);
			}
			//add the tr tag to the table
			table.append(tr);
		}
		//add it to the textarea
		gui.addText(table.toString(0), tabNum);
	}
	
	public void addDictTag(String tag, int numReps, int tabNum){
		//create complex tag
		ComplexTag dict=new ComplexTag("dl",new ArrayList<Construct>());
		
		//create numReps# of <dt>
		for(int i=0;i<numReps;i++){
			ComplexTag dt=new ComplexTag("dt",new ArrayList<Construct>());
			//create a dd
			BasicTag dd=new BasicTag("dd","");
			//add the dd to dt
			dt.append(dd);
			//add the dt to the dictionary
			dict.append(dt);
		}
		gui.addText(dict.toString(0),tabNum);
	}
	
	public void cutText(String cut,String replace){
		cutText=cut;
		gui.replaceText(replace);
	}
	
	public void pasteText(String before,String after){
		gui.replaceText(before+this.cutText+after);
	}
	
	

	
	

	
	


	
	
	//end class
}