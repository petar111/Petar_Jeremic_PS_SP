
package forms;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author siux
 * 
 */
public class FMath extends JFrame{
    
    public FMath(){
        initComponents();
    }

   
    /**
     * Initializes components when frame has been instanced.
     * 
     */
    
    private void initComponents() {
        
        
        // Initializing components
        txtA = new JTextField();
        txtB = new JTextField();
        txtResult = new JTextField();
        
        lblA = new JLabel();
        lblB = new JLabel();
        lblResult = new JLabel();
        
        lblWarning = new JLabel();
        
        btnSub = new JButton();
        btnSum = new JButton();
        
        mathOperandsAndResultPanel = new JPanel(new GridLayout(3, 2));
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        warningPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        // Setting form properties
        this.setBounds(10, 50, 500, 300);
        this.setContentPane(new JPanel());
        
        
        Container pane = this.getContentPane();
        
        
        pane.setLayout(new BorderLayout());
        
        pane.add(mathOperandsAndResultPanel, BorderLayout.CENTER);
        pane.add(buttonsPanel, BorderLayout.SOUTH);
        pane.add(warningPanel, BorderLayout.NORTH);
        
        
        mathOperandsAndResultPanel.add(lblA);
        mathOperandsAndResultPanel.add(txtA);
        mathOperandsAndResultPanel.add(lblB);
        mathOperandsAndResultPanel.add(txtB);
        mathOperandsAndResultPanel.add(lblResult);
        mathOperandsAndResultPanel.add(txtResult);
        
        buttonsPanel.add(btnSum);
        buttonsPanel.add(btnSub);
        
        warningPanel.add(lblWarning);
        
        lblWarning.setForeground(Color.ORANGE);
        lblWarning.setFont(new Font("Default", Font.BOLD, 15));
        
        txtA.setBounds(40, 20, 100, 20);
        txtA.setMaximumSize(new Dimension(100, 20));
        
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
        
        
        
        /*
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
        */
       
        txtA.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                            }

            @Override
            public void keyReleased(KeyEvent e) {
                String currTextA = txtA.getText().trim();
                String currTextB = txtB.getText().trim();
                
                lblWarning.setText("");
                try {
                   Integer.parseInt(currTextA);
                   Integer.parseInt(currTextB);
                } catch (Exception exep) {
                    if(currTextA.equals("") || currTextB.equals("")){
                        lblWarning.setText("Warning: At least one of the fields is empty!");
                    }else{
                        lblWarning.setText("Warning: Some of values you typed is invalid!");
                    }
                    
                }
                //System.out.println("released a key");
                            }
        });
        
        
        txtB.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String currTextA = txtA.getText().trim();
                String currTextB = txtB.getText().trim();
                
                lblWarning.setText("");
                try {
                   Integer.parseInt(currTextA);
                   Integer.parseInt(currTextB);
                } catch (Exception exep) {
                    if(currTextA.equals("") || currTextB.equals("")){
                        lblWarning.setText("Warning: At least one of the fields is empty!");
                    }else{
                        lblWarning.setText("Warning: Some of values you typed is invalid!");
                    }
                    
                }
                //System.out.println("released a key");
            }
        });
        
        
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String currTextA = txtA.getText().trim();
                String currTextB = txtB.getText().trim();
                
                try {
                   int a = Integer.parseInt(currTextA);
                   int b = Integer.parseInt(currTextB);
                   txtResult.setText("" + (a + b));
                } catch (Exception exep) {
                    JOptionPane.showMessageDialog(null, "Error:  Some of values you typed is invalid!(SEE WARNING MESSAGE AT THE TOP OF THE SCREEN)");
                    
                }
            }
        });
        
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String currTextA = txtA.getText().trim();
                String currTextB = txtB.getText().trim();
                
                try {
                   int a = Integer.parseInt(currTextA);
                   int b = Integer.parseInt(currTextB);
                   txtResult.setText("" + (a - b));
                } catch (Exception exep) {
                    JOptionPane.showMessageDialog(null, "Error:  Some of values you typed is invalid!(SEE WARNING MESSAGE AT THE TOP OF THE SCREEN)");
                    
                }
            }
        });
       
       
    }
    private JPanel mathOperandsAndResultPanel;
    private JPanel buttonsPanel;
    private JPanel warningPanel;
    
    
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtResult;
    
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblResult;
    
    private JButton btnSum;
    private JButton btnSub;
    
    private JLabel lblWarning;
    
}
