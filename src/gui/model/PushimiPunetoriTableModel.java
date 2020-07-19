/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BL.PushimiPunetoriRepository;
import DAL.PushimiPunetori;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rilin
 */
public class PushimiPunetoriTableModel  extends AbstractTableModel {

    List<PushimiPunetori> list;
    PushimiPunetoriRepository pr = new PushimiPunetoriRepository();

    String[] cols = {"KerkesaID", "Punetori", "LlojiPushimit", "DataFillimit", "DataMbarimit", "Nr.lejuar","Nr.kerkuar","Nr.mbetur"};

    public PushimiPunetoriTableModel() {
    }

    public PushimiPunetoriTableModel(List<PushimiPunetori> list) {
        this.list = list;
    }

    public void addList(List<PushimiPunetori> list) {
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

    public PushimiPunetori getPushimiPunetori(int index) {
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
        PushimiPunetori p = list.get(rowIndex);
        
     
        
            switch (columnIndex) {
                case 0:
                    return p.getPushimipunetoriID();
                case 1:
                    return p.getPerdoruesiID().getPunetoriID().getEmri();
                case 2:
                    return p.getPushimiID().getEmriPushimit();
                case 3:
                   return new SimpleDateFormat("yyyy-MM-dd").format(p.getDataFillimit());
                case 4:
                  return new SimpleDateFormat("yyyy-MM-dd").format(p.getDataMbarimit());
                case 5:
                   return p.getTotali();
                case 6:
                    return p.getKerkuara();
                case 7:
                    return p.getMbetura();
                default:
                    return null;
            }
        

    }

}

