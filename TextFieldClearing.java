/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCode;

/**
 *
 * @author lap
 */
public class TextFieldClearing {
    public void  clearTextfield(javax.swing.JTextField[] arr){
        for(javax.swing.JTextField arrTextfield: arr){
            arrTextfield.setText("");
        }
    
    }
}
