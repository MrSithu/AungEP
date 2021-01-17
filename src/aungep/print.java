/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aungep;

import java.awt.print.PrinterException;
import javax.swing.table.TableModel;

/**
 *
 * @author hp
 */
public class print extends javax.swing.JFrame {

    /**
     * Creates new form print
     */
    public print() {
        initComponents();
    }
    
    String total;
    String pay;
    String balance;
    
    public print(String total,String pay,String balance,TableModel tableModel) throws PrinterException {
        initComponents();
        this.total = total;
        this.pay = pay;
        this.balance = balance;
        
        txt_print.setText(txt_print.getText()+"************************* ဗုဒၶံ ***********************  ဓမၼံ  *********************** သံဃံ **************************\n");
        txt_print.setText(txt_print.getText()+"************************************************** AUNG EP ***************************************************\n");
        txt_print.setText(txt_print.getText()+"******************************************** လၽွပ္စစ္ပစၥည္းေရာင္းဝယ္ေရး ********************************************\n");
        txt_print.setText(txt_print.getText()+"******************************** အိမ္တြင္းဝါယာရိမ္းတပ္ဆင္ျပဳျပင္ေရးႏွင့္ ေရပိုက္တပ္ဆင္ေရးလုပ္ငန္း  ***************************\n");
        txt_print.setText(txt_print.getText()+"\n\n");
        txt_print.setText(txt_print.getText()+"အမည္ ------------------------၊ \t\t\t\t\t\t      Date----------------------------------\n\n");
        txt_print.setText(txt_print.getText()+"အမ်ိဳးအမည္" + "\t\t\t\t" + "ဦးေရ" + "\t\t\t" + "နွုန္း" + "\t\t\t" + "စုစုေပါင္း" + "\n");
        
        for(int i=0; i<tableModel.getRowCount(); i++)
        {
            String item = (String) tableModel.getValueAt(i, 1);
            String price = (String) tableModel.getValueAt(i, 2);
            String qty = (String) tableModel.getValueAt(i, 3);
            int subtotal = (int) tableModel.getValueAt(i, 4);
            
            txt_print.setText(txt_print.getText() + item + "\t\t\t" + qty + "\t\t\t" + price + "\t\t\t" + subtotal + "\n");
        }
        txt_print.setText(txt_print.getText()+"\n");
        txt_print.setText(txt_print.getText()+"\n");
        
        txt_print.setText(txt_print.getText()+"\t\t\t\t\t\t\t\t\t စုစုေပါင္း      : " + total + "     \n");
        txt_print.setText(txt_print.getText()+"\t\t\t\t\t\t\t\t\t  ေပး            : " + pay + "     \n" );
        txt_print.setText(txt_print.getText()+"\t\t\t\t\t\t\t\t\t ျပန္အမ္း       : " + balance + "     \n");
        
        
        txt_print.setText(txt_print.getText()+"\n\n");
        txt_print.setText(txt_print.getText()+"*********************************************************************************************************\n");
        txt_print.setText(txt_print.getText()+"*************************************** အားေပးမႈကို အထူးေက်းဇူးတင္ပါသည္ *************************************\n");
        
        txt_print.print();

    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_print = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_print.setColumns(20);
        txt_print.setFont(new java.awt.Font("Zawgyi-One", 0, 13)); // NOI18N
        txt_print.setRows(5);
        jScrollPane1.setViewportView(txt_print);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_print;
    // End of variables declaration//GEN-END:variables
}
