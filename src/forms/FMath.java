
package forms;


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
 * Class FMath is used for doing simple calculations with integers supported with GUI. 
 */
public class FMath extends JFrame{
    
    public FMath(){
        initComponents();
    }

    /**
     * First initialization when FMath object has been made.
     * 
     */
    private void initComponents() {
        
        
        // Creating component objects.
        txtA = new JTextField();
        txtB = new JTextField();
        txtResult = new JTextField();
        
        lblA = new JLabel();
        lblB = new JLabel();
        lblResult = new JLabel();
        
        btnSub = new JButton();
        btnSum = new JButton();
        
        
        //Setting frame properties.
        this.setBounds(10, 50, 500, 300);
        this.setContentPane(new JPanel());
        this.setResizable(false);
        
        //Setting layout for main panel.
        this.getContentPane().setLayout(null);
        
        //Adding components to main panel.
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
        
        
        
        //Setting components properties.
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
        
        
        
        //Adding action listeners to buttons.
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
    
    // Text field for first operand.
    private JTextField txtA;
    // Text field for second operand.
    private JTextField txtB;
    // Text field for result.
    private JTextField txtResult;
    
    
    // Label for first operand.
    private JLabel lblA;
    
    // Label for second operand.
    private JLabel lblB;
    
    // Label for result.
    private JLabel lblResult;
    
    
    //Button that calls sum operation.
    private JButton btnSum;
    
    //Button that calls subtract operation
    private JButton btnSub;
    
    
}
