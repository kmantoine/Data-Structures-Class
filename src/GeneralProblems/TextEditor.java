package GeneralProblems;

//Notepad style application that can open, edit, and save text documents. Optional: Add syntax and highlighting and other features.

import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Keran Miguel Antoine
 */
public class TextEditor extends javax.swing.JFrame {

    String FileName = "";
    Clipboard Clipboard = getToolkit().getSystemClipboard();

    public TextEditor () {
        initComponents ();
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kerwan's File Editor");
        setLocationByPlatform(true);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        jButton1.setText("New");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(formListener);
        jToolBar1.add(jButton1);

        jButton2.setText("Open");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setName("jButton2"); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(formListener);
        jToolBar1.add(jButton2);

        jButton3.setText("Save");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setName("jButton3"); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(formListener);
        jToolBar1.add(jButton3);

        jSeparator2.setName("jSeparator2"); // NOI18N
        jToolBar1.add(jSeparator2);

        jToolBar2.setRollover(true);
        jToolBar2.setName("jToolBar2"); // NOI18N
        jToolBar1.add(jToolBar2);

        jSeparator4.setName("jSeparator4"); // NOI18N
        jToolBar1.add(jSeparator4);

        jButton4.setText("Exit");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setName("jButton4"); // NOI18N
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(formListener);
        jToolBar1.add(jButton4);

        jSeparator1.setName("jSeparator1"); // NOI18N
        jToolBar1.add(jSeparator1);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jEditorPane1.setContentType("text/html/rtf"); // NOI18N
        jEditorPane1.setName("jEditorPane1"); // NOI18N
        jScrollPane2.setViewportView(jEditorPane1);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText("File");
        jMenu1.setName("jMenu1"); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(formListener);
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(formListener);
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(formListener);
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(formListener);
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setName("jMenu2"); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Cut");
        jMenuItem5.setName("jMenuItem5"); // NOI18N
        jMenuItem5.addActionListener(formListener);
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Copy");
        jMenuItem6.setName("jMenuItem6"); // NOI18N
        jMenuItem6.addActionListener(formListener);
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Paste");
        jMenuItem7.setName("jMenuItem7"); // NOI18N
        jMenuItem7.addActionListener(formListener);
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton1) {
                TextEditor.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                TextEditor.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                TextEditor.this.jButton3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton4) {
                TextEditor.this.jButton4ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem1) {
                TextEditor.this.jMenuItem1ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem2) {
                TextEditor.this.jMenuItem2ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem3) {
                TextEditor.this.jMenuItem3ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem4) {
                TextEditor.this.jMenuItem4ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem5) {
                TextEditor.this.jMenuItem5ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem6) {
                TextEditor.this.jMenuItem6ActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem7) {
                TextEditor.this.jMenuItem7ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit (0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newFile();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        newFile();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        saveFile ();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        saveFile ();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        openFile ();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        openFile ();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit (0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        cutCopyPaste(1);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        cutCopyPaste(2);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        cutCopyPaste(3);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void newFile () {
        jEditorPane1.setText("This is a new text file");
        setTitle("Untitled");
        FileName = "new.txt";
    }

    private void openFile () {
        JFileChooser files = new JFileChooser();
        files.addActionListener((ActionEvent e) -> {
            if (JFileChooser.CANCEL_SELECTION.equals(e.getActionCommand())) {
                files.cancelSelection();
            }
            else if (JFileChooser.APPROVE_SELECTION.equals(e.getActionCommand())) {
                if(files.getSelectedFile() != null){
                    FileName = files.getSelectedFile().getPath();
                    setTitle(FileName);
                }
                try{
                    try (BufferedReader reader = new BufferedReader (new FileReader(FileName))) {
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while((line = reader.readLine()) != null){
                            sb.append(line).append("\n");
                            jEditorPane1.setText(sb.toString());
                        }
                    }
                }
                catch (IOException ex){
                    Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, "Error opening file", ex);
                }
            }
        });
        files.addChoosableFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        files.showOpenDialog(rootPane.getContentPane());
    }

    private void saveFile () {
        File file = new File(FileName);
        if(file.exists()){
            try (FileWriter fileWriter = new FileWriter(FileName)) {
                fileWriter.write(jEditorPane1.getText());
                setTitle(FileName);
            } catch (IOException ex) {
                Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, "Error overwriting file", ex);
            }
        }
        else {
            JFileChooser files = new JFileChooser();
            files.addActionListener((ActionEvent e) -> {
                if (JFileChooser.CANCEL_SELECTION.equals(e.getActionCommand())) {
                    files.cancelSelection();
                }
                else if (JFileChooser.APPROVE_SELECTION.equals(e.getActionCommand())) {
                    if(files.getSelectedFile() != null){
                        FileWriter fileWriter = null ;
                        try {
                            FileName = files.getSelectedFile().getPath().concat(".txt");
                            fileWriter = new FileWriter(FileName);
                            fileWriter.write(jEditorPane1.getText());
                            setTitle(FileName);
                        }
                        catch (IOException ex) {
                            Logger.getLogger (TextEditor.class.getName()).log (Level.SEVERE, "Error saving file", ex);
                        }
                        finally {
                            try {
                                if (fileWriter!=null)
                                    fileWriter.close ();
                            }
                            catch (IOException ex) {
                                Logger.getLogger (TextEditor.class.getName()).log (Level.SEVERE, "File error", ex);
                            }
                        }
                    }
                }
            });
            files.addChoosableFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
            files.showSaveDialog(rootPane.getContentPane());
        }
    }

    private void cutCopyPaste (int option) {
        switch (option) {
            case 1:
                String TextCut = jEditorPane1.getSelectedText();
                StringSelection CutSelection = new StringSelection(TextCut);
                Clipboard.setContents(CutSelection, CutSelection);
                jEditorPane1.replaceSelection ("");
                break;
            case 2:
                String TextCopy = jEditorPane1.getSelectedText();
                StringSelection CopySelection = new StringSelection(TextCopy);
                Clipboard.setContents(CopySelection, CopySelection);
                break;
            case 3:
                try {
                    Transferable TextPaste = Clipboard.getContents(this);
                    String Selection = (String) TextPaste.getTransferData(DataFlavor.stringFlavor);
                    jEditorPane1.replaceSelection (Selection);
                    break;
                }
                catch (UnsupportedFlavorException | IOException ex) {
                    Logger.getLogger (TextEditor.class.getName()).log (Level.SEVERE, "Paste Error", ex);
                }
        }
    }


public static void main (String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels ()) {
            if ("Nimbus".equals (info.getName ())) {
                javax.swing.UIManager.setLookAndFeel (info.getClassName ());
                break;
            }
        }
    }
    catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger (TextEditor.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger (TextEditor.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger (TextEditor.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger (TextEditor.class.getName ()).log (java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater (() -> {
        new TextEditor ().setVisible (true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jButton1;
    protected javax.swing.JButton jButton2;
    protected javax.swing.JButton jButton3;
    protected javax.swing.JButton jButton4;
    protected javax.swing.JEditorPane jEditorPane1;
    protected javax.swing.JMenu jMenu1;
    protected javax.swing.JMenu jMenu2;
    protected javax.swing.JMenuBar jMenuBar1;
    protected javax.swing.JMenuItem jMenuItem1;
    protected javax.swing.JMenuItem jMenuItem2;
    protected javax.swing.JMenuItem jMenuItem3;
    protected javax.swing.JMenuItem jMenuItem4;
    protected javax.swing.JMenuItem jMenuItem5;
    protected javax.swing.JMenuItem jMenuItem6;
    protected javax.swing.JMenuItem jMenuItem7;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JToolBar.Separator jSeparator1;
    protected javax.swing.JToolBar.Separator jSeparator2;
    protected javax.swing.JToolBar.Separator jSeparator4;
    protected javax.swing.JToolBar jToolBar1;
    protected javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
