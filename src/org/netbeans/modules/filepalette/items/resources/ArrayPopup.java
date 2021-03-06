/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

import edu.mass.qcc.qcccodewizard.CheckVariableName;
import edu.mass.qcc.qcccodewizard.CodeDrop;
import edu.mass.qcc.qcccodewizard.GroupButtonUtils;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.modules.filepalette.OpenHelpUrl;
import org.netbeans.modules.filepalette.items.Array;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Ian
 */
public class ArrayPopup extends javax.swing.JPanel {

    private Dialog dialog = null;
    private DialogDescriptor descriptor = null;
    private boolean dialogOK = false;
    Array ifitem;
    JTextComponent target;
    ArrayList<String> arrayKeyTextArray = new ArrayList<String>();
    ArrayList<String> arrayValueTextArray = new ArrayList<String>();
    JTextComponent jtc = EditorRegistry.lastFocusedComponent();
    

    /**
     * Creates new Popup form
     * @param item
     * @param target  
     */
    public ArrayPopup(Array item, JTextComponent target) {
        this.ifitem = item;
        this.target = target;
        
        initComponents();

    }

    /**
     *
     * @return
     */
    public boolean showDialog() {
        addVariableButton.setVisible(false);
        dialogOK = false;

        String displayName = "";
        try {
            displayName = NbBundle.getBundle("org.netbeans.modules.filepalette.items.resources.Bundle").getString("NAME_html-Array");
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

                            addVariableButton.doClick();
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

        String comment = jTextField1.getText();
        ifitem.setComment(comment);

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        varPane = new javax.swing.JPanel();
        varNameCombo1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        addVariableButton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arrayKeyText1 = new javax.swing.JComboBox();
        arrayValueText1 = new javax.swing.JComboBox();
        arrayKeyText2 = new javax.swing.JComboBox();
        arrayValueText2 = new javax.swing.JComboBox();
        arrayKeyText3 = new javax.swing.JComboBox();
        arrayValueText3 = new javax.swing.JComboBox();
        arrayKeyText4 = new javax.swing.JComboBox();
        arrayValueText4 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        element2Check = new javax.swing.JCheckBox();
        element3Check = new javax.swing.JCheckBox();
        element4Check = new javax.swing.JCheckBox();
        element1Check = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jTextField1.text")); // NOI18N
        jTextField1.setToolTipText(org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jTextField1.toolTipText")); // NOI18N

        varPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.varPane.border.title"))); // NOI18N
        varPane.setToolTipText(org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.varPane.toolTipText")); // NOI18N

        varNameCombo1.setEditable(true);
        varNameCombo1.setToolTipText(org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.varNameCombo1.toolTipText")); // NOI18N
        varNameCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNameCombo1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addVariableButton, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.addVariableButton.text")); // NOI18N
        addVariableButton.setToolTipText(org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.addVariableButton.toolTipText")); // NOI18N
        addVariableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVariableButtonActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel33, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel33.text")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel39, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel39.text")); // NOI18N

        javax.swing.GroupLayout varPaneLayout = new javax.swing.GroupLayout(varPane);
        varPane.setLayout(varPaneLayout);
        varPaneLayout.setHorizontalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33))
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVariableButton)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        varPaneLayout.setVerticalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(addVariableButton))
                .addGap(0, 0, 0))
        );

        try{
            varNameCombo1.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jPanel2.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel3.text")); // NOI18N

        arrayKeyText1.setEditable(true);
        arrayKeyText1.setEnabled(false);
        try{
            arrayKeyText1.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        arrayValueText1.setEditable(true);
        arrayValueText1.setEnabled(false);
        try{
            arrayValueText1.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        arrayKeyText2.setEditable(true);
        arrayKeyText2.setEnabled(false);
        try{
            arrayKeyText2.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        arrayValueText2.setEditable(true);
        arrayValueText2.setEnabled(false);
        try{
            arrayValueText2.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        arrayKeyText3.setEditable(true);
        arrayKeyText3.setEnabled(false);
        try{
            arrayKeyText3.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        arrayValueText3.setEditable(true);
        arrayValueText3.setEnabled(false);
        try{
            arrayValueText3.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        arrayKeyText4.setEditable(true);
        arrayKeyText4.setEnabled(false);
        try{
            arrayKeyText4.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        arrayValueText4.setEditable(true);
        arrayValueText4.setEnabled(false);
        try{
            arrayValueText4.setModel(new PHPVariableNameComboModel());
        }catch(FileNotFoundException ex){ ex.printStackTrace();}

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel7.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.jLabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(element2Check, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.element2Check.text")); // NOI18N
        element2Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                element2CheckActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(element3Check, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.element3Check.text")); // NOI18N
        element3Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                element3CheckActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(element4Check, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.element4Check.text")); // NOI18N
        element4Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                element4CheckActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(element1Check, org.openide.util.NbBundle.getMessage(ArrayPopup.class, "ArrayPopup.element1Check.text")); // NOI18N
        element1Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                element1CheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(142, 142, 142))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(element2Check)
                    .addComponent(element3Check)
                    .addComponent(element4Check)
                    .addComponent(element1Check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(arrayKeyText4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(arrayKeyText1, 0, 150, Short.MAX_VALUE)
                        .addComponent(arrayKeyText2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrayKeyText3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arrayValueText1, 0, 157, Short.MAX_VALUE)
                    .addComponent(arrayValueText4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arrayValueText3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arrayValueText2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrayKeyText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayValueText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(element1Check))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrayKeyText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayValueText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(element2Check))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrayKeyText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayValueText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(element3Check))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrayKeyText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayValueText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(element4Check))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(varPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    /*
     * Builds two arraylists based on the keys and values
     * a warning will pop up if the key is not matched with a value
     * and will not insert either that key or value
     */
    private void arrayFill(){
        
        if(element1Check.isSelected()==true){
            arrayKeyTextArray.add( (String) arrayKeyText1.getSelectedItem());
            arrayValueTextArray.add((String)arrayValueText1.getSelectedItem().toString());
        }
        
        if(element2Check.isSelected()==true){
            arrayKeyTextArray.add(arrayKeyText2.getSelectedItem().toString());
            arrayValueTextArray.add(arrayValueText2.getSelectedItem().toString());
        }
        
        if(element3Check.isSelected()==true){
            arrayKeyTextArray.add(arrayKeyText3.getSelectedItem().toString());
            arrayValueTextArray.add(arrayValueText3.getSelectedItem().toString());
        }
        
        if(element4Check.isSelected()==true){
            arrayKeyTextArray.add(arrayKeyText4.getSelectedItem().toString());
            arrayValueTextArray.add(arrayValueText4.getSelectedItem().toString());
        }
        
    }
    private void addVariableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVariableButtonActionPerformed

        //This adds a new variable into the current document

        //Get the currently open java source
        try {
            JTextComponent jtc = EditorRegistry.lastFocusedComponent();
            CodeDrop codedrop = new CodeDrop();
            //Find the type of variable
            GroupButtonUtils gbu = new GroupButtonUtils();
                arrayFill();
                
                

                
                
                //Get the name for the variable
                String varName = varNameCombo1.getSelectedItem().toString();
                System.out.println(varName);
                String code = "";
                //Make sure its a valid variable name...
                CheckVariableName cvn = new CheckVariableName();
                if (cvn.isGood(varName)) {
                    //add objects from the arraylist to an array
                    Object[] arrayKeys = arrayKeyTextArray.toArray();
                    Object[] arrayValues = arrayValueTextArray.toArray();
                    StringBuilder sb = new StringBuilder();
                    sb.append("$").append(varName).append(" = array(");
                       
                       //add keys and values 
                        int count = 0;
                        for (int index = 0; index < arrayKeys.length; index++) {
                            if (count == arrayKeys.length - 1) {
                                sb.append(arrayKeys[index]).append("=>").append(arrayValues[index]);

                            } else {
                                sb.append(arrayKeys[index]).append("=>").append(arrayValues[index]).append(",");
                            }
                            count++;
                        }
                        sb.append(");");
                        code = sb.toString();
                        try {
                            //Insert into document
                            System.out.println("Inserting Code");
                            CodeDrop.insert(code, jtc);
                        } catch (BadLocationException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    
                    
                    
                    

                } else {

                    JOptionPane.showMessageDialog(this, "Invalid Variable Name. Try Again.");
                    System.out.println("Variable name not valid!");
                }

            
        } catch (java.lang.Throwable t) {

            JOptionPane.showMessageDialog(this, "All Fields must be filled out.");
            t.printStackTrace();

        }
        //Call combobox models visit method to update with the new variable.
    }//GEN-LAST:event_addVariableButtonActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // Variable Help Page
        OpenHelpUrl o = new OpenHelpUrl("http://php.net/manual/en/language.types.array.php");
    }//GEN-LAST:event_jLabel33MouseClicked

    private void element1CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_element1CheckActionPerformed
        arrayKeyText1.setEnabled(true);
        arrayValueText1.setEnabled(true);
    }//GEN-LAST:event_element1CheckActionPerformed

    private void element2CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_element2CheckActionPerformed
        arrayKeyText2.setEnabled(true);
        arrayValueText2.setEnabled(true);
    }//GEN-LAST:event_element2CheckActionPerformed

    private void element3CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_element3CheckActionPerformed
        arrayKeyText3.setEnabled(true);
        arrayValueText3.setEnabled(true);
    }//GEN-LAST:event_element3CheckActionPerformed

    private void element4CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_element4CheckActionPerformed
        arrayKeyText4.setEnabled(true);
        arrayValueText4.setEnabled(true);
    }//GEN-LAST:event_element4CheckActionPerformed

    private void varNameCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNameCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNameCombo1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVariableButton;
    private javax.swing.JComboBox arrayKeyText1;
    private javax.swing.JComboBox arrayKeyText2;
    private javax.swing.JComboBox arrayKeyText3;
    private javax.swing.JComboBox arrayKeyText4;
    private javax.swing.JComboBox arrayValueText1;
    private javax.swing.JComboBox arrayValueText2;
    private javax.swing.JComboBox arrayValueText3;
    private javax.swing.JComboBox arrayValueText4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox element1Check;
    private javax.swing.JCheckBox element2Check;
    private javax.swing.JCheckBox element3Check;
    private javax.swing.JCheckBox element4Check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox varNameCombo1;
    private javax.swing.JPanel varPane;
    // End of variables declaration//GEN-END:variables
}
