/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BL.PushimiRepository;
import DAL.Pushimi;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rilin
 */
public class PushimiTableModel extends AbstractTableModel{
      List<Pushimi> list;
    PushimiRepository pr = new PushimiRepository();

    String[] cols = {"PushimiID", "Lloji pushimit","Nr.lejuar"};

    public PushimiTableModel() {
    }

    public PushimiTableModel(List<Pushimi> list) {
        this.list = list;
    }

    public void addList(List<Pushimi> list) {
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

    public Pushimi getPushimi(int index) {
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
        Pushimi p = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getPushimiID();
            case 1:
                return p.getEmriPushimit();
            case 2:
                return p.getDitet();
            case 3: 
            default:
                return null;
        }
    }
}
