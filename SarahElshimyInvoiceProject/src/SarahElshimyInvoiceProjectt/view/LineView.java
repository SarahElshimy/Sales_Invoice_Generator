/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SarahElshimyInvoiceProjectt.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class LineView extends JDialog{
    private int itemNum;
    
    private JTextField itemNumField;
    private JTextField itemNameField;
    private JTextField itemCountField;
    private JTextField itemPriceField;
    private JLabel itemNumLbl;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public LineView(InvoiceGUI frame) {
        itemNumField = new JTextField(20);
        itemNumLbl = new JLabel("No.");
        
        itemNameField = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCountField = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPriceField = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
        okBtn = new JButton("save");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("newLineOK");
        cancelBtn.setActionCommand("newLineCancel");
        
        okBtn.addActionListener(frame.getListener());
        cancelBtn.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLbl);
        add(itemNameField);
        add(itemCountLbl);
        add(itemCountField);
        add(itemPriceLbl);
        add(itemPriceField);
        add(okBtn);
        add(cancelBtn);
        setModal(true);
        pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }

    public int getItemNum() {
        return 1;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public JTextField getItemNumField() {
        return itemNumField;
    }

    public void setItemNumField(JTextField itemNumField) {
        this.itemNumField = itemNumField;
    }

    public JLabel getItemNumLbl() {
        return itemNumLbl;
    }

    public void setItemNumLbl(JLabel itemNumLbl) {
        this.itemNumLbl = itemNumLbl;
    }
    
    
    
}
