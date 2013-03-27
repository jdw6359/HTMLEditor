package editorproxy;

public interface EditorAbstraction{

	//here, all of the methods that HTMLFile will have need to be laid out
	//HTMLFile and HTMLFileProxy will both implement this interface, thus
	//following the proxy pattern. 
	
	public void addFile();
	
	public void addBasicTag(String tag, int tabNum);
	
	public void addListTag(String tag, int numReps, int tabNum);
	
	public void addDictTag(String tag, int numReps, int tabNum);
	
	public void addTableTag(String tag, int numReps, int tabNum);
	
	public void cutText(String cut,String replace);
	
	public void pasteText(String before, String after);
	//end interface
}