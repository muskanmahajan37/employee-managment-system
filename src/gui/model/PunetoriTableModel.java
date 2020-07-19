/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BL.EmployeeException;
import BL.PunetoriRepository;
import BL.TelefoniInterface;
import BL.TelefoniRepository;
import DAL.Punetori;
import DAL.Telefoni;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MR-ROBOT
 */
public class PunetoriTableModel extends AbstractTableModel {

    List<Punetori> list;
    PunetoriRepository pr = new PunetoriRepository();

    String[] cols = {"Emri", "Mbiemri","Departmenti","Pozita", "Email", "mobil"};

    public PunetoriTableModel() {
    }

    public PunetoriTableModel(List<Punetori> list) {
        this.list = list;
    }

    public void addList(List<Punetori> list, List<Telefoni> list2) {
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

    public Punetori getPersoni(int index) {
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
        Punetori p = list.get(rowIndex);
        ArrayList<Telefoni> telefonNumbers = new ArrayList<>(p.getTelefoniCollection());
        List<Telefoni> telNumbers = pr.getAllNumbersOfPunetori(p.getPunetoriID());
     
        
            switch (columnIndex) {
                case 0:
                    return p.getEmri();
                case 1:
                    return p.getMbiemri();
                case 2:
                    return p.getDepartmentiId().getEmriDepartmentit();
                case 3:
                    if(!p.getTitulli().getTitulliPershkrimi().equals(null)){
                    return p.getTitulli().getTitulliPershkrimi();
                    }
                case 4:
                    return p.getEmail();
                case 5:
                    if (telNumbers.size() >= 1) {
                        return telefonNumbers.get(0).getTelefoniShtepise();
                    }

//            case 8:
//                if(telNumbers.size() >=1){
//                return telefonNumbers.get(0).getTelefoniBiznesit(); 
//                }
//            case 9:
//                 if(telNumbers.size() >=1){
//                return telefonNumbers.get(0).getTelefoniMobil(); 
//                }
                default:
                    return null;
            }
        

    }

}
