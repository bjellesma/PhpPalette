
/*
 *-----------------------------------------------------------------------------------------
 *---This file was generated using Snip - A Snippets Source Code Generator 
 *---for use with Netbeans Palettes. This project is an expansion of the sample
 *---Java Palette by Geertjan Wielenga.
 *---Quinsigamond Community College - 2013
 *-----------------------------------------------------------------------------------------
 */

package org.netbeans.modules.filepalette.items;
import org.netbeans.modules.filepalette.items.resources.NewObjectPopup;
import org.openide.text.ActiveEditorDrop;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

/**
 * This class gets and sets comments for the code snippet and calls
 *  the popup or customizer associated with this class.
 */
public class NewObject implements ActiveEditorDrop {
    private String comment = "";

    /**
     *
     */
    public NewObject() {}

    private String createBody() {
        comment = getComment();
        StringBuilder buffer = new StringBuilder();
        buffer.append("// ").append(comment).append("\n");
        return buffer.toString();
    }

    /**
     *
     * @param targetComponent
     * @return
     */
    public boolean handleTransfer(JTextComponent targetComponent) {
        NewObjectPopup c      = new NewObjectPopup(this, targetComponent);
        boolean         accept = c.showDialog();

        if (accept) {
            String body = this.createBody();

            try {
               FilePaletteUtilities.insert(body, targetComponent);
            } catch (BadLocationException ble) {
                accept = false;
            }
        }

        return accept;
    }

    /**
     *
     * @return Returns a comment.
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     */
    public void setComment(String comment) {
     this.comment = comment;
    }
}
