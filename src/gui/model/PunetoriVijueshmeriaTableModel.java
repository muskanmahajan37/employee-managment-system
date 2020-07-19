/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BL.PunetoriRepository;
import DAL.Punetori;
import DAL.Telefoni;
import DAL.Vijueshmeria;
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
public class PunetoriVijueshmeriaTableModel extends AbstractTableModel {

    List<Vijueshmeria> list;
    PunetoriRepository pr = new PunetoriRepository();

    String[] cols = {"PunetoriID.", "Emri dhe mbiemri", "Data", "Koha Fillimit", "Koha Mbarimit", "Total","Jashte-Orarit","Feste"};

    public PunetoriVijueshmeriaTableModel() {
    }

    public PunetoriVijueshmeriaTableModel(List<Vijueshmeria> list) {
        this.list = list;
    }

    public void addList(List<Vijueshmeria> list) {
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

    public Vijueshmeria getVijueshmeria(int index) {
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
        Vijueshmeria v = list.get(rowIndex);
        SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
        String data = simple.format(v.getData());
        switch (columnIndex) {
            case 0:
                return v.getPunetoriId().getPunetoriID();
            case 1:
                return v.getPunetoriId().getEmri() +" "+v.getPunetoriId().getMbiemri();
            case 2:
                return new SimpleDateFormat("yyyy-MM-dd").format(v.getData());
            case 3:
                return v.getKohaFillimit();
            case 4:
                return v.getKohaMbarimit();
            case 5:
                return v.getTotal();
            case 6:
                return v.getJashtOrarit();
            case 7:
                return v.getFesta();
           
            default:
                return null;
        }

    }
}
