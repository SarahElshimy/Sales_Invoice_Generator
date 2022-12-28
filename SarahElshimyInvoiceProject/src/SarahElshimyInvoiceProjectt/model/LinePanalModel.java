/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SarahElshimyInvoiceProjectt.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class LinePanalModel extends AbstractTableModel {

    private String[] cols = {"No.","Item Name", "Item Price", "Count", "Total"};
    private List<LineObject> lines;

    public LinePanalModel(List<LineObject> lines) {
        this.lines = lines;
    }

    public List<LineObject> getLines() {
        return lines;
    }
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineObject line = lines.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return line.getNum();
            case 1: return line.getItem();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getTotal();
        }
        return "";
    }
    
}
