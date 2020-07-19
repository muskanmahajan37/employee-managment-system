/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import DAL.Perdoruesi;
import DAL.Verejtja;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MR-ROBOT
 */
public class VerejtjaTableModel extends AbstractTableModel {
        List<Verejtja> list;
    

    String[] cols = {"ID","Punetori", "Emri i rastit","Verejtja Nga", "Me daten"};

    public VerejtjaTableModel() {
    }

    public VerejtjaTableModel(List<Verejtja> list) {
        this.list = list;
    }

    public void addList(List<Verejtja> list) {
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

    public Verejtja getVerejtja(int index) {
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
        Verejtja v = list.get(rowIndex);
        SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
        String data = simple.format(v.getData());
        Perdoruesi p = v.getPerdoruesiId();
        switch (columnIndex) {
            case 0:
                return v.getVerejtjaID();
            case 1:
                return p.getPunetoriID().getEmri() + "  "+p.getPunetoriID().getMbiemri();
            case 2:
                return v.getTitulliRastit();
            case 3:
                return v.getKrijuarNga();
            case 4:
                return data;
            default:
                return null;
        }

    }
}
