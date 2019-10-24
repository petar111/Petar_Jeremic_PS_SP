/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import components.interfaces.IPanelInput;
import domain.Gender;
import domain.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.forms.FrmPerson;

/**
 *
 * @author siux
 */
public class PanelInputPersonv2 extends javax.swing.JPanel implements IPanelInput{

    /**
     * Creates new form PanelInputPersonv2
     */
    public PanelInputPersonv2() {
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

        pnliFirstName = new components.PanelInputTxtField();
        pnliLastName = new components.PanelInputTxtField();
        pnliBirthday = new components.PanelInputTxtField();
        pnliGender = new components.PanelInputTxtField();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnliFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnliLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnliBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnliGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnliFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnliLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnliBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnliGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.PanelInputTxtField pnliBirthday;
    private components.PanelInputTxtField pnliFirstName;
    private components.PanelInputTxtField pnliGender;
    private components.PanelInputTxtField pnliLastName;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        pnliFirstName.getLblInputField().setText("First name:");
        pnliFirstName.getLblInputFieldError().setText("");
        
        // fixed( because we assume that user data is not located in some storage and only solution is to input some text)
        
        //fixed
        pnliLastName.getLblInputField().setText("Last name:");
        pnliLastName.getLblInputFieldError().setText("");
        
        // fixed( because we assume that user data is not located in some storage and only solution is to input some text)
        
        //fixed
        pnliGender.getLblInputField().setText("Gender:");
        pnliGender.getLblInputFieldError().setText("");
        
        pnliBirthday.getLblInputField().setText("Birthday:");
        pnliBirthday.getLblInputFieldError().setText("");
    }

    @Override
    public Object getValue() {
        Person person = new Person();
        
        person.setFirstName((String)pnliFirstName.getValue());
        person.setLastName((String)pnliLastName.getValue());
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
        try {
            person.setBirthday((Date)sdf.parse((String)pnliBirthday.getValue()));
        } catch (ParseException ex) {
            Logger.getLogger(FrmPerson.class.getName()).log(Level.SEVERE, null, ex);
            pnliGender.getLblInputFieldError().setText(ex.getMessage());
        }
        person.setGender(Gender.valueOf((String)pnliGender.getValue()));
        
        
        return person;
    }
}
