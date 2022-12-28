/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SarahElshimyInvoiceProjectt.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import SarahElshimyInvoiceProjectt.view.InvoiceGUI;

/**
 *
 * @author DELL
 */
public class InvoicePanalModel extends AbstractTableModel {
    private String[] cols = {"No.", "Date", 
        "Customer", "Total"};
    private List<InvoiceObject> invoices;
    
    public InvoicePanalModel(List<InvoiceObject> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return cols[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceObject inv = invoices.get(rowIndex);
        switch (columnIndex) {
            case 0: return inv.getNum();
            case 1: return InvoiceGUI.sdf.format(inv.getDate());
            case 2: return inv.getCustomer();
            case 3: return inv.getTotal();
        }
        return "";
        //return "(" + rowIndex + ", " + columnIndex + ")";
    }
    
}

