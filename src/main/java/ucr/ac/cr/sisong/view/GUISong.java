/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.sisong.view;

import javax.swing.JOptionPane;

/**
 *
 * @author lara3
 */
public class GUISong extends javax.swing.JFrame {

    /**
     * Creates new form GUISONG
     */
    public GUISong() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel2 = new ucr.ac.cr.sisong.view.ButtonPanel();
        dataPanelSong1 = new ucr.ac.cr.sisong.view.DataPanelSong();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(buttonPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 500, -1));
        getContentPane().add(dataPanelSong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   public DataPanelSong getDataPanelSong(){
    return this.dataPanelSong1;
   }
   public ButtonPanel getButtonsPanel(){
       return this.buttonPanel2;
   }
   
   public static void setMessage(String msj){
       JOptionPane.showMessageDialog(null, msj);
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ucr.ac.cr.sisong.view.ButtonPanel buttonPanel2;
    private ucr.ac.cr.sisong.view.DataPanelSong dataPanelSong1;
    // End of variables declaration//GEN-END:variables
}
