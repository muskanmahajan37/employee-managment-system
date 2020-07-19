/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.EmployeeException;
import BL.NjoftimiRepository;
import DAL.Njoftimi;
import DAL.Perdoruesi;
import static com.lowagie.text.SpecialSymbol.index;
import gui.model.NjoftimiTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

/**
 *
 * @author MR-ROBOT
 */
public class NjoftimiFormPunetori extends javax.swing.JInternalFrame {

    NjoftimiTableModel ntm = new NjoftimiTableModel();
    NjoftimiRepository nr = new NjoftimiRepository();
    NjoftimiData nd = new NjoftimiData();
    
  
    int empId = Emp.empId;
    
    public NjoftimiFormPunetori() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        
    }

      public void loadTable() {
        try {
            List<Njoftimi> lista = nr.findNjoftimiPerdoruesi(empId);
            ntm.addList(lista);
            table.setModel(ntm);
            ntm.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("EmployeeManagmentSystemPU").createEntityManager();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int index = table.getSelectedRow();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
       
        TableModel model = table.getModel();
        String id = model.getValueAt(index, 0).toString();
        int x = Integer.parseInt(id);
          Njoftimi n = null;
        try {
          n = nr.findByID(x);
        } catch (EmployeeException ex) {
            Logger.getLogger(NjoftimiFormPunetori.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String subjekti = model.getValueAt(index, 3).toString();
        String data = model.getValueAt(index, 1).toString();
        //String pershkrimi = model.getValueAt(index,2).toString();
        
        Perdoruesi p = null;
         p = n.getPerdoruesiId();
        String str ;
        if(p!=null){
            str = p.getPunetoriID().getEmri();
            nd.perLabel.setText(str);
        }else{
            nd.perLabel.setText(" Te gjithe");
        }
        Date d = n.getDataDergeses();
        String dateSt = format.format(d);
        
        nd.datalbl.setText(dateSt);
        nd.setVisible(true);
        nd.setLocationRelativeTo(null);
        nd.pack();
        nd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nd.subjektiTxt.setText(subjekti);
        nd.dataTxt.setText(data);
        nd.pershkrimiTxt.setText((n.getMesazhi()));
        
    }//GEN-LAST:event_tableMouseClicked

    private void tabelaSelectedIndexChange() {
        final ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent Ise) {
                if (Ise.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {

                    Njoftimi n = ntm.getNjoftimi(selectedIndex);
                    if (selectedIndex > -1) {
                        System.out.println(n + " OBJEKTI");
                    }
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
