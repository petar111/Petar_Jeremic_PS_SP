/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import components.interfaces.IPanelInput;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author siux
 */
public class PanelInputThreeRadioButton extends javax.swing.JPanel implements IPanelInput{

    /**
     * Creates new form PanelInputThreeRadioBox
     */
    public PanelInputThreeRadioButton() {
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

        btnGrp1 = new javax.swing.ButtonGroup();
        lblInputField = new javax.swing.JLabel();
        lblInputFieldError = new javax.swing.JLabel();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        rbtn3 = new javax.swing.JRadioButton();

        lblInputField.setText("jLabel1");

        lblInputFieldError.setForeground(new java.awt.Color(255, 0, 51));
        lblInputFieldError.setText("jLabel2");

        btnGrp1.add(rbtn1);
        rbtn1.setSelected(true);

        btnGrp1.add(rbtn2);

        btnGrp1.add(rbtn3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInputFieldError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn3)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInputField)
                    .addComponent(rbtn1)
                    .addComponent(rbtn2)
                    .addComponent(rbtn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInputFieldError))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrp1;
    private javax.swing.JLabel lblInputField;
    private javax.swing.JLabel lblInputFieldError;
    private javax.swing.JRadioButton rbtn1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JRadioButton rbtn3;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getValue() {
        Enumeration buttons = btnGrp1.getElements();
        
        while(buttons.hasMoreElements()){
            AbstractButton button = (AbstractButton)buttons.nextElement();
            
            if(button.isSelected()){
                return button.getText();
            }
        }
        
        throw new RuntimeException("None of the buttons is selected");
    }

   

    @Override
    public void initialize(Object inputConf) {
        List<String> names = (List<String>)inputConf;
        
        Enumeration buttons = btnGrp1.getElements();
        
        int i = 0;
        while(buttons.hasMoreElements()){
            AbstractButton button = (AbstractButton)buttons.nextElement();
            button.setText(names.get(i++));
        }
    }
    
    
    

    public ButtonGroup getBtnGrp1() {
        return btnGrp1;
    }

    public JLabel getLblInputField() {
        return lblInputField;
    }

    public JLabel getLblInputFieldError() {
        return lblInputFieldError;
    }

    public JRadioButton getRbtn1() {
        return rbtn1;
    }

    public JRadioButton getRbtn2() {
        return rbtn2;
    }

    public JRadioButton getRbtn3() {
        return rbtn3;
    }


    
    
}