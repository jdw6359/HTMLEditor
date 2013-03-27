package textcommands;

import commands.*;
import gui.*;
import editorproxy.*;
import javax.swing.*;

public class PasteText implements TextCommand{
	
	
	private EditorProxy editor=EditorProxy.getInstance();
	
	public PasteText(){
		
	}
	
	public void execute(JTabbedPane tabbedPane){
		JScrollPane scroll=(JScrollPane) tabbedPane.getComponentAt(tabbedPane.getSelectedIndex());
		JViewport viewport=scroll.getViewport();
		JTextArea area=(JTextArea)viewport.getView();
		int start=area.getSelectionStart();
		String textBefore=area.getText().substring(0,start);
		String textAfter=area.getText().substring(start,area.getText().length());
		editor.pasteText(textBefore,textAfter);
		
	}
}
