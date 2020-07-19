/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BL.DepartmentiRepository;
import BL.PunetoriRepository;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import DAL.Departmenti;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author MR-ROBOT
 */


public class DepartmentiTableModel  extends AbstractTableModel{
      List<Departmenti> list;
    DepartmentiRepository dr = new DepartmentiRepository();

    String[] cols = {"DepartmentID", "Emri Departmentit"};

    public DepartmentiTableModel() {
    }

    public DepartmentiTableModel(List<Departmenti> list) {
        this.list = list;
    }

    public void addList(List<Departmenti> list) {
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

    public Departmenti getDepartmenti(int index) {
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
        Departmenti d = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getDepartmentiID();
            case 1:
                return d.getEmriDepartmentit();
            default:
                return null;
        }
    }
}
