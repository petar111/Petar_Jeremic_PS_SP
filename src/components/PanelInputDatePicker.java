/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import components.interfaces.IPanelInput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author siux
 */
public class PanelInputDatePicker extends javax.swing.JPanel implements IPanelInput{

    /**
     * Creates new form PanelInputDatePicker
     */
    public PanelInputDatePicker() {
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

        lblInputField = new javax.swing.JLabel();
        lblInputFieldError = new javax.swing.JLabel();
        jdatePicker = new components.JDatePickerMy();

        lblInputField.setText("jLabel1");

        lblInputFieldError.setForeground(new java.awt.Color(255, 0, 51));
        lblInputFieldError.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInputFieldError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblInputField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInputFieldError))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JDatePickerMy getJdatePicker() {
        return jdatePicker;
    }

    public JLabel getLblInputField() {
        return lblInputField;
    }

    public JLabel getLblInputFieldError() {
        return lblInputFieldError;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.JDatePickerMy jdatePicker;
    private javax.swing.JLabel lblInputField;
    private javax.swing.JLabel lblInputFieldError;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getValue() {
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(jdatePicker.getTxtResult().getText());
            return date;
        } catch (ParseException ex) {
            Logger.getLogger(PanelInputDatePicker.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
