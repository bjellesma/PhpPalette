/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

import edu.mass.qcc.qcccodewizard.CheckVariableName;
import edu.mass.qcc.qcccodewizard.CodeDrop;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.modules.filepalette.OpenHelpUrl;
import org.netbeans.modules.filepalette.items.Function;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Bill Jellesma
 */

public class FunctionPopup extends javax.swing.JPanel {
    
    private Dialog dialog = null;
    private DialogDescriptor descriptor = null;
    private boolean dialogOK = false;
    Function ifitem;
    JTextComponent target;
    int params = 0;
    String functionReturn = null;
    /**
     * Creates new Popup form
     * @param item
     * @param target  
     */
    public FunctionPopup(Function item, JTextComponent target) {
        this.ifitem = item;
        this.target = target;
        initComponents();

    }

    /**
     *
     * @return
     */
    public boolean showDialog() {
        addJavaDoc.setVisible(false);
        addMethodButton.setVisible(false);

        dialogOK = false;

        String displayName = "";
        try {
            displayName = NbBundle.getBundle("org.netbeans.modules.filepalette.items.resources.Bundle").getString("NAME_html-Function");
        } catch (Exception e) {
        }

        descriptor = new DialogDescriptor(this, NbBundle.getMessage(NewObjectPopup.class, "LBL_Customizer_InsertPrefix") + " " + displayName, true,
                DialogDescriptor.OK_CANCEL_OPTION, DialogDescriptor.CANCEL_OPTION,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!descriptor.getValue().equals(DialogDescriptor.CANCEL_OPTION)) {
                            evaluateInput();
                            dialogOK = true;

                            addJavaDoc.doClick();
                            addMethodButton.doClick();
                        }
                        dialog.dispose();

                    }
                });

        dialog = DialogDisplayer.getDefault().createDialog(descriptor);

        dialog.setVisible(true);
        repaint();

        return dialogOK;

    }

    private void evaluateInput() {

        //String comment = jTextField1.getText();
        ifitem.setComment("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        varPane = new javax.swing.JPanel();
        methodName = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        addMethodButton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        varPane1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addJavaDoc = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        param1 = new javax.swing.JTextField();
        param2 = new javax.swing.JTextField();
        param3 = new javax.swing.JTextField();
        param4 = new javax.swing.JTextField();
        paramReturn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        paramList = new javax.swing.JTextField();

        varPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.varPane.border.title"))); // NOI18N
        varPane.setToolTipText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.varPane.toolTipText")); // NOI18N

        methodName.setEditable(true);
        methodName.setToolTipText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.methodName.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addMethodButton, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.addMethodButton.text")); // NOI18N
        addMethodButton.setToolTipText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.addMethodButton.toolTipText")); // NOI18N
        addMethodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMethodButtonActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel33, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel33.text")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        varPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.varPane1.border.title"))); // NOI18N
        varPane1.setToolTipText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.varPane1.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addJavaDoc, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.addJavaDoc.text")); // NOI18N
        addJavaDoc.setToolTipText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.addJavaDoc.toolTipText")); // NOI18N
        addJavaDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJavaDocActionPerformed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel34, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel34.text")); // NOI18N

        jTextField1.setColumns(20);
        jTextField1.setRows(5);
        jScrollPane1.setViewportView(jTextField1);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel1.text")); // NOI18N

        author.setText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.author.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel7.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel8.text")); // NOI18N

        param1.setText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.param1.text")); // NOI18N

        param2.setText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.param2.text")); // NOI18N

        param3.setText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.param3.text")); // NOI18N

        param4.setText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.param4.text")); // NOI18N

        paramReturn.setText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.paramReturn.text")); // NOI18N

        javax.swing.GroupLayout varPane1Layout = new javax.swing.GroupLayout(varPane1);
        varPane1.setLayout(varPane1Layout);
        varPane1Layout.setHorizontalGroup(
            varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPane1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34))
            .addGroup(varPane1Layout.createSequentialGroup()
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(param4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(param3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(param2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(param1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(author)
                    .addComponent(paramReturn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addJavaDoc))
        );
        varPane1Layout.setVerticalGroup(
            varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(varPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel5))
                .addGap(82, 82, 82)
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(varPane1Layout.createSequentialGroup()
                        .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(param1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(param2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(param3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(param4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(varPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(paramReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJavaDoc)))
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.jLabel10.text")); // NOI18N

        paramList.setText(org.openide.util.NbBundle.getMessage(FunctionPopup.class, "FunctionPopup.paramList.text")); // NOI18N

        javax.swing.GroupLayout varPaneLayout = new javax.swing.GroupLayout(varPane);
        varPane.setLayout(varPaneLayout);
        varPaneLayout.setHorizontalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varPaneLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(methodName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(jLabel33))
            .addComponent(varPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addMethodButton))
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paramList)
                .addContainerGap())
        );

        varPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel4});

        varPaneLayout.setVerticalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(9, 9, 9)
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(methodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(paramList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMethodButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Add a method into the source.
     * @param evt 
     */
    private void addMethodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMethodButtonActionPerformed

        //This adds a new method into the current document
        
        //Get the currently open java source
        try {
            JTextComponent jtc = EditorRegistry.lastFocusedComponent();
            CodeDrop codedrop = new CodeDrop();

            String mName = methodName.getSelectedItem().toString();
            String[] methodParams = paramList.getText().toString().split(",");
            



            

            //Make sure its a valid variable name...
            CheckVariableName cvn = new CheckVariableName();
            if (cvn.isGood(mName)) {
                //If name is valid, add it to the editor.
                System.out.println("Valid Name");

                //Construct the output string
                StringBuilder sb = new StringBuilder();
                sb.append("/function ").append(mName).append("(");

                //Add the method params into the string
                params = methodParams.length;
                for (int count = 0; count < params; count++) {
                    if (count == methodParams.length - 1) {
                        sb.append(methodParams[count]).append(") ");
                    } else {
                        sb.append(methodParams[count]).append(", ");
                    }
                    
                }
                //Continue Building the String...
                sb.append("{\n\t//Function Body Goes Here\n\treturn; //<--Add return value or variable\n\t}");


                String code = sb.toString();
                try {
                    //Insert into document
                    System.out.println("Inserting Code");
                    CodeDrop.insert(code, jtc);
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                }



            }
        } catch (java.lang.Throwable t) {

            JOptionPane.showMessageDialog(this, "All Fields must be filled out.");

        }
        //Call combobox models visit method to update with the new variable.
    }//GEN-LAST:event_addMethodButtonActionPerformed

    private void addJavaDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJavaDocActionPerformed

        //This adds a new javaDoc into the current document

        //Get the currently open java source
        try {
            JTextComponent jtc = EditorRegistry.lastFocusedComponent();
            CodeDrop codedrop = new CodeDrop();
            //Grab all params for javaDoc and insert into document
            String description = jTextField1.getText();
            String paramAuthor = author.getText();
            StringBuilder sb = new StringBuilder();
            switch (params){
                case 1:
                   String p1 = param1.getText(); 
                   sb.append("@Param ").append(p1).append("\n *");
                case 2:
                    String p2 = param2.getText();
                    sb.append("@Param ").append(p2).append("\n *");
                case 3:
                    String p3 = param3.getText();
                    sb.append("@Param ").append(p3).append("\n *");
                case 4:
                    String p4 = param4.getText();
                    sb.append("@Param ").append(p4).append("\n *");
                    break;
                
            }
            if(functionReturn!=null){
                String pR = paramReturn.getText();
                sb.append("@Return ").append(pR).append("\n */");
            }
            
            
            
            
            //Construct the output string
            
            sb.append("/**\n * ").append(description).append("\n *@Author ").append(paramAuthor).append("\n *");
            
            
            
            
            

            String code = sb.toString();
            try {
                //Insert into document
                System.out.println("Inserting Code");
                CodeDrop.insert(code, jtc);
            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }

        } catch (java.lang.Throwable t) {

            JOptionPane.showMessageDialog(this, "All Fields must be filled out.");

        }
        //Call combobox models visit method to update with the new variable.
    }//GEN-LAST:event_addJavaDocActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // Help Page
        OpenHelpUrl o = new OpenHelpUrl("http://www.cplusplus.com");
    }//GEN-LAST:event_jLabel33MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJavaDoc;
    private javax.swing.JButton addMethodButton;
    private javax.swing.JTextField author;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextField1;
    private javax.swing.JComboBox methodName;
    private javax.swing.JTextField param1;
    private javax.swing.JTextField param2;
    private javax.swing.JTextField param3;
    private javax.swing.JTextField param4;
    private javax.swing.JTextField paramList;
    private javax.swing.JTextField paramReturn;
    private javax.swing.JPanel varPane;
    private javax.swing.JPanel varPane1;
    // End of variables declaration//GEN-END:variables
}
