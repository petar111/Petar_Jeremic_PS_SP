
package ui.forms;
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
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *Class FMath provides simple mathematics operations supported with GUI.
 * @author siux
 * 
 */
public class FMath extends JFrame{
    
    
    
    /**
     * Constructor for FMath object.
     */
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
        txtWarning = new JTextField();
        
        lblA = new JLabel();
        lblB = new JLabel();
        lblResult = new JLabel();
        
        lblWarning = new JLabel();
        
        btnSub = new JButton();
        btnSum = new JButton();
        
        
        
        //Initializing panels
        warningPane = new JScrollPane(txtWarning, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
     
        
        mathOperandsAndResultPanel = new JPanel();
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        warningPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        // Setting form properties
        this.setBounds(10, 50, 500, 300);
        this.setContentPane(new JPanel());
        this.setMinimumSize(new Dimension(150, 190));
        
        //Adding reference variable of main panel for simplicity.
        Container pane = this.getContentPane();
        
        //Setting layout for main panel.
        pane.setLayout(new BorderLayout());
        
        
        //Adding panels to main panel.
        pane.add(mathOperandsAndResultPanel, BorderLayout.CENTER);
        pane.add(buttonsPanel, BorderLayout.SOUTH);
        //pane.add(warningPanel, BorderLayout.NORTH);
        pane.add(warningPane, BorderLayout.NORTH);

        //Setting layout to mathOperandsAndResultPanel
        GroupLayout mathOandRLayout = new GroupLayout(mathOperandsAndResultPanel);
        mathOandRLayout.setAutoCreateContainerGaps(true);
        mathOandRLayout.setAutoCreateGaps(true);
        mathOperandsAndResultPanel.setLayout(mathOandRLayout);
        //mathOperandsAndResultPanel.setMinimumSize(new Dimension(30, 90));
        
        
        
        //mathOperandsAndResultPanel has a group layout
        mathOandRLayout.setHorizontalGroup(
                                mathOandRLayout.createSequentialGroup()
                                        .addGroup(mathOandRLayout
                                                .createParallelGroup()
                                                .addComponent(lblA)
                                                .addComponent(lblB)
                                                .addComponent(lblResult))
                                        .addGroup(mathOandRLayout.createParallelGroup()
                                                .addComponent(txtA)
                                                .addComponent(txtB)
                                                .addComponent(txtResult)));
                                        //.addComponent(lblA)
                                       // .addComponent(txtA));
        mathOandRLayout.setVerticalGroup(
                                mathOandRLayout.createSequentialGroup()
                                        .addGroup(mathOandRLayout.createParallelGroup()
                                                .addComponent(lblA)
                                                .addComponent(txtA))
                                        .addGroup(mathOandRLayout.createParallelGroup()
                                                .addComponent(lblB)
                                                .addComponent(txtB))
                                        .addGroup(mathOandRLayout.createParallelGroup()
                                                .addComponent(lblResult)
                                                .addComponent(txtResult))
                                        );
        
        //previous version mathOperandsAndResultPanel had a grid layout
        /*
        mathOperandsAndResultPanel.add(lblA);
        mathOperandsAndResultPanel.add(txtA);
        mathOperandsAndResultPanel.add(lblB);
        mathOperandsAndResultPanel.add(txtB);
        mathOperandsAndResultPanel.add(lblResult);
        mathOperandsAndResultPanel.add(txtResult);
        */
        
        //Adding buttons to buttonsPanel.
        buttonsPanel.add(btnSum);
        buttonsPanel.add(btnSub);
       // buttonsPanel.setMinimumSize(new Dimension(110, 20));
        
        //warningPanel.add(lblWarning);
        //warningPanel.add(scrollPaneWarning);
        //warningPanel.add(lblWarning);
       // warningPanel.setMinimumSize(new Dimension(200, 20));
       
        
        //Setting components properties.
        lblWarning.setForeground(Color.ORANGE);
        lblWarning.setFont(new Font("Default", Font.BOLD, 15));
       // lblWarning.setPreferredSize(new Dimension(100, 20));
        //lblWarning.setPreferredSize(new Dimension(100, 20));
        
        
        
        txtA.setBounds(40, 20, 100, 20);
        txtA.setMaximumSize(new Dimension(200, 100));
        
        
        lblA.setBounds(20, 20, 15, 20);
        lblA.setText("a: ");
        
        txtB.setBounds(40, 60, 100, 20);
        txtB.setMaximumSize(new Dimension(200, 100));
        
        lblB.setBounds(20, 60, 15, 20);
        lblB.setText("b: ");
        
        
        txtResult.setBounds(60, 100, 100, 20);
        txtResult.setMaximumSize(new Dimension(200, 100));
        txtResult.setEditable(false);
        
        lblResult.setBounds(15, 100, 40, 20);
        lblResult.setText("result: ");
        
        btnSum.setBounds(10, 150, 70, 20);
        btnSum.setText("Sum");
        
        btnSub.setBounds(100, 150, 70, 20);
        btnSub.setText("Sub");
        
        txtWarning.setPreferredSize(new Dimension(1, 20));
        txtWarning.setEditable(false);
        txtWarning.setForeground(Color.ORANGE);
        txtWarning.setFont(new Font("Default", Font.BOLD, 15));
        txtWarning.setBackground(null);
        
       
        
        
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
        
        //Adding listeners to components.
        txtWarning.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                check();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                check();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                check();
            }

            private void check() {
                if(txtWarning.getText().equals("")){
                    txtWarning.setPreferredSize(new Dimension(1, 20));
                }else{
                    txtWarning.setPreferredSize(new Dimension(325, 20));
                }
            }
        });
       
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
                
                txtWarning.setText("");
                try {
                   Integer.parseInt(currTextA);
                   Integer.parseInt(currTextB);
                } catch (Exception exep) {
                    if(currTextA.equals("") || currTextB.equals("")){
                        txtWarning.setText("Warning: At least one of the fields is empty!");
                    }else{
                        txtWarning.setText("Warning: Some of values you typed is invalid!");
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
                
                txtWarning.setText("");
                try {
                   Integer.parseInt(currTextA);
                   Integer.parseInt(currTextB);
                } catch (Exception exep) {
                    if(currTextA.equals("") || currTextB.equals("")){
                        txtWarning.setText("Warning: At least one of the fields is empty!");
                    }else{
                        txtWarning.setText("Warning: Some of values you typed is invalid!");
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
    
    private JScrollPane warningPane;
    
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtResult;
    private JTextField txtWarning;
    
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblResult;
    
    private JButton btnSum;
    private JButton btnSub;
    
    private JLabel lblWarning;
    
}
