/*Copyright (c) 2007, Center for Computational Sciences, University of Kentucky.  All rights reserved.

Developed by:

Center for Computational Sciences, University of Kentucky

http://www.ccs.uky.edu

Permission is hereby granted, free of charge, to any person 
obtaining a copy of this software and associated documentation
files (the "Software"), to deal with the Software without 
restriction, including without limitation the rights to use, 
copy, modify, merge, publish, distribute, sublicense, and/or 
sell copies of the Software, and to permit persons to whom 
the Software is furnished to do so, subject to the following 
conditions:
1. Redistributions of source code must retain the above copyright notice, 
   this list of conditions and the following disclaimers.
2. Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimers in the documentation
   and/or other materials provided with the distribution.
3. Neither the names of Center for Computational Sciences, University of Kentucky 
   nor the names of its contributors may be used to endorse or promote products 
   derived from this Software without specific prior written permission.
    
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  
IN NO EVENT SHALL THE CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
DEALINGS WITH THE SOFTWARE.

*/
/**
 * @author Michael Sheetz 
 * @author Pavithra Koka
 */

package Gamess.gamessGUI;

import java.awt.event.*;

import javax.swing.text.JTextComponent;
import javax.swing.undo.UndoManager;

public class EditMenuListener implements ActionListener
{
	private UndoManager undoManager = null;
	private JTextComponent textComponent = null;
	
	public EditMenuListener(JTextComponent _textComponent , UndoManager _undoManager)
	{
		undoManager = _undoManager;
		textComponent = _textComponent;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		String menuName = e.getActionCommand ();
	    
		if(menuName.equals ("Undo"))
		{
			if(undoManager != null && undoManager.canUndo())
				undoManager.undo();
		}
	    else if(menuName.equals("Redo"))
	    {
	    	if(undoManager != null && undoManager.canRedo())
	    		undoManager.redo();
	    }
	    else if(menuName.equals("Cut"))
	    {
	    	textComponent.cut();
	    }
		if(menuName.equals("Copy"))
		{
			textComponent.copy();
		}
		if(menuName.equals("Paste"))
		{
			textComponent.paste();
		}
	}
}
