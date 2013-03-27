package textcommands;

import commands.*;
import gui.*;
import editorproxy.*;
import javax.swing.*;

public class CutText implements TextCommand{
	
	
	private EditorProxy editor=EditorProxy.getInstance();
	
	public CutText(){
		
	}
	
	public void execute(JTabbedPane tabbedPane){
		JScrollPane scroll=(JScrollPane) tabbedPane.getComponentAt(tabbedPane.getSelectedIndex());
		JViewport viewport=scroll.getViewport();
		JTextArea area=(JTextArea)viewport.getView();
		String cutText=area.getSelectedText();
		int start=area.getSelectionStart();
		int end=area.getSelectionEnd();
		String textBefore=area.getText().substring(0,start);
		String textAfter=area.getText().substring(end,area.getText().length());
		editor.cutText(cutText,textBefore+textAfter);
		
	}
}

