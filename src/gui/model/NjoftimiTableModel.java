/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.Njoftimi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MR-ROBOT
 */
public class NjoftimiTableModel extends AbstractTableModel {
    List<Njoftimi> list;
   

    String[] cols = {"Nr.Njoftimit", "Data e dergimit","Data per lajmrim" ,"Titulli"};

    public NjoftimiTableModel() {
    }

    public NjoftimiTableModel(List<Njoftimi> list) {
        this.list = list;
    }

    public void addList(List<Njoftimi> list) {
        this.list = list;
    }

    @Override
    public String getColumnName(int col) {
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    public void remove(int row) {
        list.remove(row);
    }

    public Njoftimi getNjoftimi(int index) {
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    public String getDateToString(Date d) {
        DateFormat da = new SimpleDateFormat("dd-MM-yyyy");
        return da.format(d);

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Njoftimi n = list.get(rowIndex);
        SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
        String data = simple.format(n.getDataDergeses());
        String dataPerLajrmim = simple.format(n.getData());
        switch (columnIndex) {
            case 0:
                return n.getNjoftimiID();
            case 1:
                return data;
            case 2:
                return dataPerLajrmim;
            case 3:
                return n.getTitulli();
            default:
                return null;
        }

    }
}
