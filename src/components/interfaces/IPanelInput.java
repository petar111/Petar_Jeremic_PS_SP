/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.interfaces;

import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author siux
 */
public interface IPanelInput {
    public Object getValue();
    public default void initialize(Object inputConf){
        
    }
}
