/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.simplejframepractise.forms;

import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author siux
 */
public class FMath extends JFrame{
    
    public FMath(){
        initComponents();
    }

    private void initComponents() {
        txtA = new JTextField();
        txtB = new JTextField();
        txtResult = new JTextField();
        
        lblA = new JLabel();
        lblB = new JLabel();
        lblResult = new JLabel();
        
        btnSub = new JButton();
        btnSum = new JButton();
        
        this.setBounds(10, 50, 500, 300);
        this.setContentPane(new JPanel());
        this.getContentPane().setLayout(null);
        this.setResizable(false);
        
        this.getContentPane().add(txtA);
        this.getContentPane().add(txtB);
        this.getContentPane().add(txtResult);
        
        this.getContentPane().add(txtA);
        this.getContentPane().add(txtB);
        this.getContentPane().add(txtResult);
        
        
        this.getContentPane().add(lblA);
        this.getContentPane().add(lblB);
        this.getContentPane().add(lblResult);
        
        this.getContentPane().add(btnSum);
        this.getContentPane().add(btnSub);
        
        txtA.setBounds(40, 20, 100, 20);
        
        lblA.setBounds(20, 20, 15, 20);
        lblA.setText("a: ");
        
        txtB.setBounds(40, 60, 100, 20);
        
        lblB.setBounds(20, 60, 15, 20);
        lblB.setText("b: ");
        
        
        txtResult.setBounds(60, 100, 100, 20);
        txtResult.setEditable(false);
        
        lblResult.setBounds(15, 100, 40, 20);
        lblResult.setText("result: ");
        
        btnSum.setBounds(10, 150, 70, 20);
        btnSum.setText("Sum");
        
        btnSub.setBounds(100, 150, 70, 20);
        btnSub.setText("Sub");
        
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                txtResult.setText(String.valueOf((Integer.parseInt(txtA.getText()) + Integer.parseInt(txtB.getText()))));
            }
        });
        
        
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                txtResult.setText(String.valueOf((Integer.parseInt(txtA.getText()) - Integer.parseInt(txtB.getText()))));
            }
        });
       
       
    }
    
    private JLabel testLabel;
    
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtResult;
    
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblResult;
    
    private JButton btnSum;
    private JButton btnSub;
    
    
}
