/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import components.interfaces.IGetValue;
import components.interfaces.IPanelInput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author siux
 */
public class PanelInputDate extends javax.swing.JPanel implements IPanelInput {

    /**
     * Creates new form PanelInputDate
     */
    public PanelInputDate() {
        initComponents();
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInputField = new javax.swing.JLabel();
        lblInputFieldError = new javax.swing.JLabel();
        cboxDay = new javax.swing.JComboBox<>();
        cboxMonth = new javax.swing.JComboBox<>();
        cboxYear = new javax.swing.JComboBox<>();

        lblInputField.setText("jLabel1");

        lblInputFieldError.setForeground(new java.awt.Color(255, 0, 51));
        lblInputFieldError.setText("jLabel2");

        cboxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInputField)
                .addGap(67, 67, 67)
                .addComponent(cboxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
            .addComponent(lblInputFieldError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInputField)
                    .addComponent(cboxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInputFieldError))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxDay;
    private javax.swing.JComboBox<String> cboxMonth;
    private javax.swing.JComboBox<String> cboxYear;
    private javax.swing.JLabel lblInputField;
    private javax.swing.JLabel lblInputFieldError;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getValue() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        
        
        try {
            date = sdf.parse(cboxDay.getSelectedItem() +  "." + cboxMonth.getSelectedItem() + "." + cboxYear.getSelectedItem());
        } catch (ParseException ex) {
            lblInputFieldError.setText(ex.getMessage());
        }

        return date;
        
    }

    private void prepareView() {
        lblInputField.setText("Date:");
        lblInputFieldError.setText("");
        
        cboxDay.removeAllItems();
        cboxMonth.removeAllItems();
        cboxYear.removeAllItems();
        
        for (int i = 1; i <= 31; i++) {
            cboxDay.addItem(i + "");
        }
        
        for (int i = 1; i <= 12; i++) {
            cboxMonth.addItem(i + "");
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();

        
        for (int i = 1950; i <= Integer.parseInt(sdf.format(date)) ; i++) {
            cboxYear.addItem(i + "");
        }
        
        
        
        
    }
}