/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.EmployeeException;
import BL.PerdoruesiRepository;
import BL.VerejtjaRepository;
import DAL.Njoftimi;
import DAL.Perdoruesi;
import DAL.Verejtja;
import gui.model.PerdoruesiComboBoxModel;
import gui.model.VerejtjaTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author MR-ROBOT
 */
public class VleresoPunetorin extends javax.swing.JInternalFrame {

    PerdoruesiComboBoxModel pcbm = new PerdoruesiComboBoxModel();
    PerdoruesiRepository pr = new PerdoruesiRepository();
    VerejtjaRepository vr = new VerejtjaRepository();
    int id = Emp.empId;
    VerejtjaTableModel vtm = new VerejtjaTableModel();
    VerejtjaFormData vfd = new VerejtjaFormData();
    static Verejtja v;

    public VleresoPunetorin() {
//        if(Emp.empId ==0 || Emp.empUsername == null ){
//            JOptionPane.showMessageDialog(null, "Duhet te jesh i kyqur per te bere ndryshime");
//        }else{
        initComponents();
        loadComboBox();
        loadTable();
//        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        titulliTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        perdoruesiCB = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        pershkrimiTxt = new javax.swing.JTextArea();

        setClosable(true);

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
        table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tableMouseMoved(evt);
            }
        });
        table.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tableMouseWheelMoved(evt);
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        saveBtn.setText("Shto verejtjen");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Zgjedh Perdoruesin:");

        jLabel3.setText("Pershkrimi");

        jLabel2.setText("Titulli verejtjes");

        pershkrimiTxt.setColumns(20);
        pershkrimiTxt.setRows(5);
        jScrollPane1.setViewportView(pershkrimiTxt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perdoruesiCB, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(titulliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(perdoruesiCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
           
            // TODO add your handling code here:
            Verejtja v = new Verejtja();
            Perdoruesi p = (Perdoruesi) perdoruesiCB.getSelectedItem();
            Perdoruesi p1 = pr.findByID(id);
            System.out.println(p1);
            if (p != null) {
                v.setPerdoruesiId(p);
            }
            v.setPershkrimi(pershkrimiTxt.getText());
            v.setTitulliRastit(titulliTxt.getText());
            v.setData(new Date());
            v.setEmriPunetorit(v.getPerdoruesiId().getPunetoriID().getEmri());
            v.setMbiemriPunetorit(v.getPerdoruesiId().getPunetoriID().getMbiemri());
            v.setKrijuarNga(p1.getPunetoriID().getEmri() + " " +p1.getPunetoriID().getMbiemri());
            vr.create(v);
            loadTable();
            clear();
        } catch (EmployeeException ex) {
            Logger.getLogger(VleresoPunetorin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            // TODO add your handling code here:
            // TODO add your handling code here:
            int index = table.getSelectedRow();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

            TableModel model = table.getModel();
            String id = model.getValueAt(index, 0).toString();
            int x = Integer.parseInt(id);
            v = vr.findByID(x);
            vfd.emriTxt.setText(v.getEmriPunetorit() + " " + v.getMbiemriPunetorit());
            vfd.titulliTxt.setText(v.getTitulliRastit());
            vfd.verejtaNgaTxt.setText(v.getKrijuarNga());
            vfd.pershkrimiTxt.setText(v.getPershkrimi());
            vfd.setVisible(true);
            vfd.setLocationRelativeTo(null);
            vfd.pack();
            vfd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vfd.dataRastit.setDate(v.getData());
        } catch (EmployeeException ex) {
            Logger.getLogger(VleresoPunetorin.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_tableMouseClicked

    private void tableMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tableMouseWheelMoved
     
    }//GEN-LAST:event_tableMouseWheelMoved

    private void tableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseMoved
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_tableMouseMoved

    public void loadComboBox() {
        try {
            List<Perdoruesi> lista = pr.findExceptAdmin();
            pcbm.add(lista);
            perdoruesiCB.setModel(pcbm);
            perdoruesiCB.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void loadTable() {
        try {
            List<Verejtja> lista = vr.findAll();
            vtm.addList(lista);
            table.setModel(vtm);
            vtm.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox perdoruesiCB;
    private javax.swing.JTextArea pershkrimiTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField titulliTxt;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        titulliTxt.setText("");
        pershkrimiTxt.setText("");
        perdoruesiCB.setSelectedItem(null);
    }
}
