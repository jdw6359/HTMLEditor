package editorproxy;
import java.util.ArrayList;


public class EditorProxy implements EditorAbstraction{
	
	//used to decide whether or not to forward requests to the realSubject, HTMLFile
	
	
	private static final EditorProxy proxy=new EditorProxy();
	private Editor editor=Editor.getInstance();
	private Validator validate=new Validator();
	//uses the boolean object
	private ArrayList<Boolean> validated=new ArrayList<Boolean>();
	
	private EditorProxy(){
		
	}
	
	public static EditorProxy getInstance(){
		return proxy;
	}
	
	
	//these are the proxy methods
	
	
	public void addFile(){
		editor.addFile();
	}

	//need to use check for validation in future:
	//validated.get(tabNum).booleanValue()==true
	public void addBasicTag(String tag, int tabNum) {
		if(true){
			//send request through because the text is validated
			editor.addBasicTag(tag,tabNum);
		}else{
			//do some popup saying that the text is invalid
			System.out.println("Text is invalid");
		}
		
	}
	
	
}