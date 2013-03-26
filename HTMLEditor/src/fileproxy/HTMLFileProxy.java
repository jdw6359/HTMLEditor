package fileproxy;

public class HTMLFileProxy implements FileAbstraction{
	
	//used to decide whether or not to forward requests to the realSubject, HTMLFile
	
	private boolean limited;
	
	public HTMLFileProxy(boolean limited){
		this.limited=limited;
		
	}
	
	
}