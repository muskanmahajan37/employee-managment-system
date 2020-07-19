/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.DConnection;
import BL.EmployeeException;
import BL.PunetoriRepository;
import BL.VijueshmeriaRepository;
import DAL.Departmenti;
import DAL.Vijueshmeria;
import DAL.Punetori;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.TimePicker;
import gui.model.PunetorComboBoxModel;
import gui.model.PunetoriVijueshmeriaTableModel;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MR-ROBOT
 */
public class VijueshmeriaForm extends javax.swing.JInternalFrame {

    PunetoriVijueshmeriaTableModel pvtm = new PunetoriVijueshmeriaTableModel();
    PunetoriVijueshmeriaTableModel pvtm_1 = new PunetoriVijueshmeriaTableModel();
    PunetoriRepository pr = new PunetoriRepository();
    PunetorComboBoxModel pcbm = new PunetorComboBoxModel();
    VijueshmeriaRepository vr = new VijueshmeriaRepository();
    DConnection source = new DConnection();
    Punetori punetori;
    int numriPunetoreve;
    double total = 0;
    double jashtOrarit = 0;

    public VijueshmeriaForm() {
        initComponents();
        loadComboBox();
        timePicker1.getSettings().setFormatForDisplayTime("HH:mm");
        timePicker2.getSettings().setFormatForDisplayTime("HH:mm");
        timePicker1.getSettings().use24HourClockFormat();
        timePicker2.getSettings().use24HourClockFormat();
        loadTable();
        loadComboBoxVijueshmeria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        emriTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        departmenti = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        totalTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        timePicker2 = new com.github.lgooddatepicker.components.TimePicker();
        punetoriCB = new javax.swing.JComboBox();
        jashteOraritTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mbiemriTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        data = new com.toedter.calendar.JDateChooser();
        diteFeste = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        punetoriCb = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        ngaDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        deriDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vijueshmeriaTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        emriTxt.setEditable(false);

        jLabel3.setText("Mbiemri:");

        jLabel8.setText("Departmenti:");

        jLabel4.setText("Data:");

        departmenti.setEditable(false);

        jButton1.setText("Kalkulo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        totalTxt.setEditable(false);

        jLabel5.setText("Koha fillimit");

        jLabel9.setText("Total oret:");

        jLabel6.setText("Koha Mbarimit");

        punetoriCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                punetoriCBItemStateChanged(evt);
            }
        });
        punetoriCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punetoriCBActionPerformed(evt);
            }
        });
        punetoriCB.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                punetoriCBPropertyChange(evt);
            }
        });
        punetoriCB.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                punetoriCBVetoableChange(evt);
            }
        });

        jashteOraritTxt.setEditable(false);

        jLabel10.setText("Jashte Orarit:");

        jLabel1.setText("Punetori :");

        mbiemriTxt.setEditable(false);

        jButton2.setText("Ruaj te dhenat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Emri:");

        diteFeste.setText("Dite Feste");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(56, 56, 56)
                        .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jashteOraritTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mbiemriTxt)
                            .addComponent(emriTxt)
                            .addComponent(punetoriCB, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departmenti, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(timePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(diteFeste)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(timePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jButton2))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jashteOraritTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(punetoriCB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(emriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(mbiemriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(departmenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diteFeste))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Shto Vijueshmerine", jPanel1);

        punetoriCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                punetoriCbItemStateChanged(evt);
            }
        });
        punetoriCb.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                punetoriCbPropertyChange(evt);
            }
        });

        jLabel11.setText("Zgjidh Punetorin");

        ngaDate.setDateFormatString("yyyy-MM-dd");
        ngaDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ngaDatePropertyChange(evt);
            }
        });

        jLabel12.setText("Nga data:");

        deriDate.setDateFormatString("yyyy-MM-dd");
        deriDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                deriDatePropertyChange(evt);
            }
        });

        jLabel13.setText("Deri me:");

        vijueshmeriaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(vijueshmeriaTable);

        jButton4.setText("Shfaq");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Gjenero Raportin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31)
                        .addComponent(punetoriCb, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(ngaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(deriDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deriDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(ngaDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(punetoriCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton3)))
                .addGap(106, 106, 106)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vijueshmeria e punetorit", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String[] oraNga = timePicker1.getText().split(":");
        String[] oraTe = timePicker2.getText().split(":");

        int nga = Integer.parseInt(oraNga[0]);
        int te = Integer.parseInt(oraTe[0]);

        double totalOret = te - nga;

        double ngaMin = Double.parseDouble(oraNga[1]);
        double teMin = Double.parseDouble(oraTe[1]); 
        double minTotal = Math.abs(teMin - ngaMin);
        if (minTotal == 30) {
            totalOret = totalOret + 0.5;
        }

        if (totalOret > 8) {
            totalTxt.setText("8");
            jashteOraritTxt.setText(totalOret - 8 + "");
        } else {
            totalTxt.setText(totalOret + "");
            jashteOraritTxt.setText("" + 0);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void punetoriCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punetoriCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punetoriCBActionPerformed

    private void punetoriCBPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_punetoriCBPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_punetoriCBPropertyChange

    private void punetoriCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_punetoriCBItemStateChanged
        // TODO add your handling code here:
        Punetori p = (Punetori) punetoriCB.getSelectedItem();
        emriTxt.setText(p.getEmri());
        mbiemriTxt.setText(p.getMbiemri());
        String departmentiEmri = p.getDepartmentiId().getEmriDepartmentit();
        if (!departmentiEmri.equals("")) {
            departmenti.setText(p.getDepartmentiId().getEmriDepartmentit());
        } else {
            departmenti.setText("");
        }
    }//GEN-LAST:event_punetoriCBItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            boolean b = false;
            Punetori p = (Punetori) punetoriCB.getSelectedItem();
            List<Vijueshmeria> list = vr.findEmpId(p.getPunetoriID());
           
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = data.getDate();
            String date2 = format.format(date);

            System.out.println(date);
            for (Vijueshmeria v1 : list) {
                if (v1.getPunetoriId().getPunetoriID() == p.getPunetoriID()) {
                    String date1 = format.format(v1.getData());
                    if (date1.equals(date2)) {
                        b = true;
                    }
                }
            }

            Vijueshmeria v = new Vijueshmeria();

            if (b == false) {
                v.setData(data.getDate());
                v.setKohaFillimit(timePicker1.getText());
                v.setKohaMbarimit(timePicker2.getText());
                v.setPunetoriId(p);
                if(diteFeste.isSelected()){
                    double total = Double.parseDouble(totalTxt.getText()) + Double.parseDouble(jashteOraritTxt.getText());
                    v.setFesta(total);
                    v.setTotal(0.0);
                    v.setJashtOrarit(0.0);
                }else{
                v.setJashtOrarit(Double.parseDouble(jashteOraritTxt.getText()));
                v.setTotal(Double.parseDouble(totalTxt.getText()));
                }
                vr.create(v);
            } else {
                JOptionPane.showMessageDialog(null, "Ekziston");//
            }

        } catch (EmployeeException ex) {
        }

        loadTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loadTableVijueshmeria();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void punetoriCBVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_punetoriCBVetoableChange
    }//GEN-LAST:event_punetoriCBVetoableChange

    public void ReportTemplatePunetoriData(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            JRDesignQuery query = new JRDesignQuery();
            HashMap param = new HashMap();
            param.put("emriPunetorit", punetori.getEmri() + " " + punetori.getMbiemri());
            param.put("ngaDate", ngaDate.getDate());
            param.put("deriDate", deriDate.getDate());
            param.put("total", total);
            param.put("jashtOrarit", jashtOrarit);
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ReportTemplatePunetori(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            JRDesignQuery query = new JRDesignQuery();
            HashMap param = new HashMap();
            param.put("ngaDate", ngaDate.getDate());
            param.put("deriDate",deriDate.getDate());
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
        public void ReportTemplatePunetoriOnly(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            JRDesignQuery query = new JRDesignQuery();
            HashMap param = new HashMap();
            param.put("emriPunetorit", punetori.getEmri() + " " + punetori.getMbiemri());
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String path = "";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "";
        if (punetoriCb.getSelectedIndex() != -1) {
            if (ngaDate.getDate() != null && deriDate.getDate() != null) {
                path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\VijueshmeriaRaport.jrxml";
                sql = "select * from Vijueshmeria v JOIN Punetori p on p.punetoriID=v.punetori_id where v.punetori_id="
                        + punetori.getPunetoriID() + " and v.data between '" + format.format(ngaDate.getDate())
                        + "' and '" + format.format(deriDate.getDate()) + "'";
                ReportTemplatePunetoriData(sql, path);
            }
        }

        if (punetoriCb.getSelectedIndex() == -1) {
            if (ngaDate.getDate() != null && deriDate.getDate() != null) {
                path ="C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\VijueshmeriaPunetori.jrxml";
                sql = "select * from Vijueshmeria v JOIN Punetori p on v.punetori_id = p.punetoriID where  v.data between '" + format.format(ngaDate.getDate())
                        + "' and '" + format.format(deriDate.getDate()) + "'";
                ReportTemplatePunetori(sql, path);
            }
        }

        if (punetoriCb.getSelectedIndex() != -1 && ngaDate.getDate() == null && deriDate.getDate() == null) {
            path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\VijueshmeriaPunetoriOnly.jrxml";
            sql = "SELECT * FROM VIJUESHMERIA V JOIN PUNETORI P ON V.PUNETORI_ID = P.PUNETORIID WHERE P.PUNETORIID=" + punetori.getPunetoriID();
            ReportTemplatePunetoriOnly(sql, path);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void punetoriCbPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_punetoriCbPropertyChange
        // TODO add your handling code here:
        total = 0;
        jashtOrarit = 0;
    }//GEN-LAST:event_punetoriCbPropertyChange

    private void punetoriCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_punetoriCbItemStateChanged
        // TODO add your handling code here:
        total = 0;
        jashtOrarit = 0;
    }//GEN-LAST:event_punetoriCbItemStateChanged

    private void ngaDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ngaDatePropertyChange
        ngaDate.getDateEditor().addPropertyChangeListener(
                new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())) {
                    total = 0;
                    jashtOrarit = 0;

                }
            }

        });

    }//GEN-LAST:event_ngaDatePropertyChange

    private void deriDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_deriDatePropertyChange
        // TODO add your handling code here:
        deriDate.getDateEditor().addPropertyChangeListener(
                new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())) {
                    total = 0;
                    jashtOrarit = 0;

                }
            }

        });
    }//GEN-LAST:event_deriDatePropertyChange

    public void loadComboBox() {
        try {
            List<Punetori> lista = pr.findOnlyEmployees();
            pcbm.add(lista);
            punetoriCB.setModel(pcbm);
            punetoriCB.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void loadComboBoxVijueshmeria() {
        try {
            List<Punetori> lista = pr.findOnlyEmployees();
            pcbm.add(lista);
            punetoriCb.setModel(pcbm);
            punetoriCb.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void loadTable() {
        try {
            List<Vijueshmeria> list = vr.findAll();
            pvtm.addList(list);
            table.setModel(pvtm);
            pvtm.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void loadTableVijueshmeria() {
        try {
            Punetori p = (Punetori) punetoriCb.getSelectedItem();
            punetori = (Punetori) punetoriCb.getSelectedItem();
            if (p != null) {
                if (ngaDate.getDate() != null && deriDate.getDate() != null) {
                    int id = p.getPunetoriID();
                    List<Vijueshmeria> list = vr.findByEmpAndDate(id, ngaDate.getDate(), deriDate.getDate());
                    for (Vijueshmeria v : list) {
                        total += v.getTotal();
                        jashtOrarit += v.getJashtOrarit();
                    }
                    numriPunetoreve = list.size();
                    pvtm_1.addList(list);
                    vijueshmeriaTable.setModel(pvtm_1);
                    pvtm_1.fireTableDataChanged();

                } else if (ngaDate.getDate() == null && deriDate.getDate() == null) {
                    List<Vijueshmeria> lista = vr.findEmpId(p.getPunetoriID());
                    numriPunetoreve = lista.size();
                    pvtm_1.addList(lista);
                    vijueshmeriaTable.setModel(pvtm_1);
                    pvtm_1.fireTableDataChanged();
                }
            }

            if (p == null) {
                if (ngaDate.getDate() != null && deriDate.getDate() != null) {
                    List<Vijueshmeria> list = vr.findByDate(ngaDate.getDate(), deriDate.getDate());
                    numriPunetoreve = list.size();
                    pvtm_1.addList(list);
                    vijueshmeriaTable.setModel(pvtm_1);
                    pvtm_1.fireTableDataChanged();
                }
            }

        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void clear() {
        punetoriCb.repaint();
        ngaDate.setDate(null);
        deriDate.setDate(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JTextField departmenti;
    private com.toedter.calendar.JDateChooser deriDate;
    private javax.swing.JCheckBox diteFeste;
    private javax.swing.JTextField emriTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jashteOraritTxt;
    private javax.swing.JTextField mbiemriTxt;
    private com.toedter.calendar.JDateChooser ngaDate;
    private javax.swing.JComboBox punetoriCB;
    private javax.swing.JComboBox punetoriCb;
    private javax.swing.JTable table;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    private com.github.lgooddatepicker.components.TimePicker timePicker2;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JTable vijueshmeriaTable;
    // End of variables declaration//GEN-END:variables
}
