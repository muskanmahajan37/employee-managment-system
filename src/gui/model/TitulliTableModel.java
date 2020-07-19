/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BL.TitulliRepository;
import DAL.Punetori;
import DAL.TitulliPunetorit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MR-ROBOT
 */
public class TitulliTableModel  extends AbstractTableModel{
        List<TitulliPunetorit> list;
    TitulliRepository tr = new TitulliRepository();

    String[] cols = {"ID.", "Titulli","Departmenti"};

    public TitulliTableModel() {
    }

    public TitulliTableModel(List<TitulliPunetorit> list) {
        this.list = list;
    }

    public void addList(List<TitulliPunetorit> list) {
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

    public TitulliPunetorit getPersoni(int index) {
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
        TitulliPunetorit t = list.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return t.getTitulliID();
                case 1:
                    return t.getTitulliPershkrimi();
                case 2:
                    
                    if(t.getDepartmentiId()!=null){
                        return t.getDepartmentiId().getEmriDepartmentit();
                    }
                default:
                    return null;
            }
        

    }
}
