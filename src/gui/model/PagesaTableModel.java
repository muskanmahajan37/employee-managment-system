/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BL.PagesaRepository;
import DAL.Pagesa;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MR-ROBOT
 */
public class PagesaTableModel extends AbstractTableModel{
        List<Pagesa> list;
    PagesaRepository pr = new PagesaRepository();

    String[] cols = {"Emri dhe Mbiemri","Departmenti","Pozita", "Total Bruto", "Neto","Muaji"};

    public PagesaTableModel() {
    }

    public PagesaTableModel(List<Pagesa> list) {
        this.list = list;
    }

    public void addList(List<Pagesa> list) {
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

    public Pagesa getPagesa(int index) {
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
        Pagesa p = list.get(rowIndex);
         
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("MM"); // two digit numerical represenation
        String dateStr = simpleDateformat.format(p.getMuajiPageses());
            String str = "";
            switch(dateStr){
                case "01":
                    str ="Janar";
                    break;
                case "02":
                    str="Shkurt";
                    break;
                case "03":
                    str ="Mars";
                    break;
                case "04":
                    str ="Prill";
                    break;
                case "05":
                    str = "Maj";
                     break;
                    case "06":
                       
                    str ="Qershor";
                    break;
                case "07":
                    str ="Korrik";
                    break;
                case "08":
                    str = "Gusht";
                    break;
                    case "09":
                    str ="Shtator";
                    break;
                case "10":
                    str ="Tetor";
                    break;
                case "11":
                    str = "Nentor";
                    break;
                case "12":
                    str ="Dhjetor";
                    break;
                default:
                    str="JANAR";
                    break;
            }
            
            switch (columnIndex) {
                case 0:
                    return p.getPerdoruesiId().getPunetoriID().getEmri() + " "+p.getPerdoruesiId().getPunetoriID().getMbiemri();
                case 1:
                   return p.getPerdoruesiId().getPunetoriID().getDepartmentiId().getEmriDepartmentit();
                case 2:
                   return p.getPerdoruesiId().getPunetoriID().getTitulli().getTitulliPershkrimi();
                case 3:
                   return p.getTotaliBruto();
                case 4:
                  return  p.getTotaliNeto();
                case 5:
                    return str;
                default:
                    return null;
            }
        

    }
}
