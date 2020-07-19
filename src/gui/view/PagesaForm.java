/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.DConnection;
import BL.EmployeeException;
import BL.PagesaRepository;
import BL.PerdoruesiRepository;
import BL.VijueshmeriaRepository;
import BL.ZbritjaRepository;
import DAL.Kontrata;
import DAL.Pagesa;
import DAL.Perdoruesi;
import DAL.Zbritja;
import gui.model.PagesaTableModel;
import gui.model.PerdoruesiComboBoxModel;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
public class PagesaForm extends javax.swing.JInternalFrame {

    PerdoruesiRepository pr = new PerdoruesiRepository();
    PerdoruesiComboBoxModel pcbm = new PerdoruesiComboBoxModel();
    PerdoruesiComboBoxModel pcbm_1 = new PerdoruesiComboBoxModel();
    VijueshmeriaRepository vr = new VijueshmeriaRepository();
    String s;
    PagesaRepository pagesarepository = new PagesaRepository();
    ZbritjaRepository zr = new ZbritjaRepository();
    DConnection source = new DConnection();
    PagesaTableModel ptm = new PagesaTableModel();

    double jashtOrarit;
    double total;
    double festa;
    String trans = "TRANS";
    String trans1 = "TRANS";
    String muaji = "";

    /**
     * Creates new form PagesaForm
     */
    public PagesaForm() {
        initComponents();
        loadComboBox();
        loadTable();
        loadComboBox_1();
        month.setEnabled(false);
    }

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

    public void loadComboBox_1() {
        try {
            List<Perdoruesi> lista = pr.findExceptAdmin();
            pcbm_1.add(lista);
            perdoruesiCBB.setModel(pcbm_1);
            perdoruesiCBB.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        perdoruesiCB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        idTxt = new javax.swing.JTextField();
        emriTxt = new javax.swing.JTextField();
        mbiemriTxt = new javax.swing.JTextField();
        departmentiTxt = new javax.swing.JTextField();
        pozitaTxt = new javax.swing.JTextField();
        telMobilTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        oreTeRregulltaTxt = new javax.swing.JTextField();
        jashtOraritTxt = new javax.swing.JTextField();
        festaTxt = new javax.swing.JTextField();
        brutoTxt = new javax.swing.JTextField();
        dataLindjes = new com.toedter.calendar.JDateChooser();
        dataPunesimit = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        kontributiPersonalTxt = new javax.swing.JTextField();
        totalTatimiTxt = new javax.swing.JTextField();
        netoTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        perdoruesiCBB = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        month = new com.toedter.calendar.JMonthChooser();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Zgjedh Punetorin");

        perdoruesiCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                perdoruesiCBItemStateChanged(evt);
            }
        });

        jLabel2.setText("Punetori ID");

        jLabel3.setText("Emri:");

        jLabel4.setText("Mbiemri");

        jLabel5.setText("Departmenti");

        jLabel6.setText("Pozita");

        jLabel7.setText("Data lindjes");

        jLabel8.setText("Data punesimit");

        jLabel12.setText("Nr tel");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Oret per muajin");

        jMonthChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMonthChooser1PropertyChange(evt);
            }
        });

        jLabel10.setText("Ore te rregullta");

        jLabel11.setText("Jasht orarit");

        jLabel13.setText("Ne festa:");

        jLabel14.setText("Total Bruto");

        oreTeRregulltaTxt.setEditable(false);

        jashtOraritTxt.setEditable(false);

        festaTxt.setEditable(false);

        brutoTxt.setEditable(false);

        jButton1.setText("Gjenero Oret");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Procedo Pagesen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        kontributiPersonalTxt.setEditable(false);

        totalTatimiTxt.setEditable(false);

        netoTxt.setEditable(false);

        jLabel15.setText("Kontributi Punetorit");

        jLabel17.setText("Total Neto");

        jLabel18.setText("Tatimi");

        jLabel16.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perdoruesiCB, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbiemriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pozitaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataLindjes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataPunesimit, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telMobilTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(33, 33, 33)
                        .addComponent(oreTeRregulltaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(57, 57, 57)
                        .addComponent(jashtOraritTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(69, 69, 69)
                        .addComponent(festaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(58, 58, 58)
                        .addComponent(brutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(12, 12, 12)
                        .addComponent(kontributiPersonalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(85, 85, 85)
                        .addComponent(totalTatimiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel17)
                        .addGap(50, 50, 50)
                        .addComponent(netoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(perdoruesiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(emriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mbiemriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(departmentiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(pozitaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dataLindjes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dataPunesimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telMobilTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9))
                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10))
                            .addComponent(oreTeRregulltaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(jashtOraritTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13))
                            .addComponent(festaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addComponent(brutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kontributiPersonalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel18))
                            .addComponent(totalTatimiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel17))
                            .addComponent(netoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Krijo Pagesen", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 891, 277));

        jPanel2.add(perdoruesiCBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 33, 159, -1));

        jLabel19.setText("Pagesa per:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, -1, -1));
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 32, -1, -1));

        jLabel20.setText("Per muajin:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 36, -1, -1));

        jButton3.setText("Gjenero Pagesat");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 165, 40));

        jButton4.setText("Shfaq");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 82, 145, 40));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Te gjithe pagesat");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 32, -1, -1));

        jTabbedPane1.addTab("Shiko Pagesat", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 920, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String str;
            if (jMonthChooser1.getMonth() < 9) {
                str = "0" + (jMonthChooser1.getMonth() + 1);
            } else {
                str = (jMonthChooser1.getMonth() + 1) + "";
            }
            String sDate1 = "2019-" + str + "-01";//Prej ciles dat tu ja shtu qat mujin qe e zgedh te forma
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1); //per me e kriju ni format dates ,
            // TODO add your handling code here:

            Perdoruesi p1 = (Perdoruesi) perdoruesiCB.getSelectedItem();
            Pagesa p = new Pagesa();
            p.setTotaliBruto(Double.parseDouble(brutoTxt.getText()));
            p.setTotaliNeto(Double.parseDouble(netoTxt.getText()));
            p.setDataPageses(new Date());
            p.setPerdoruesiId(p1);
            p.setMuajiPageses(date1);
            pagesarepository.create(p);

            Zbritja z = new Zbritja();
            z.setBruto(Double.parseDouble(brutoTxt.getText()));
            z.setKontributiPersonal(Double.parseDouble(kontributiPersonalTxt.getText()));
            z.setZbritjaTatimore(Double.parseDouble(totalTatimiTxt.getText()));
            z.setPagesaID(p);
            zr.create(z);
            JOptionPane.showMessageDialog(null, " U SHTUA");
            String sql = "SELECT * FROM PERDORUESI PR INNER JOIN PUNETORI P ON PR.punetoriID = P.punetoriID INNER JOIN Titulli_Punetorit TP ON P.titulli = TP.TitulliID\n"
                    + "INNER JOIN DEPARTMENTI D ON D.departmentiID = P.departmenti_id INNER JOIN PAGESA PA ON PR.PerdoruesiID = PA.perdoruesi_id INNER JOIN ZBRITJA Z\n"
                    + "ON Z.PagesaID = PA.PagesaID INNER JOIN KONTRATA K ON k.punetori_id=P.punetoriID WHERE pr.perdoruesiID=" + p1.getPerdoruesiID();
            String path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\PagesaReport.jrxml";
            ReportTemplate(sql, path);

        } catch (EmployeeException ex) {
            Logger.getLogger(PagesaForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PagesaForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            DecimalFormat dec = new DecimalFormat("##.##");
            String str;
            if (jMonthChooser1.getMonth() < 9) {
                str = "0" + (jMonthChooser1.getMonth() + 1);
            } else {
                str = (jMonthChooser1.getMonth() + 1) + "";
            }

            String sDate1 = "2019-" + str + "-01";//Prej ciles dat tu ja shtu qat mujin qe e zgedh te forma
            String sDate2 = "2019-" + str + "-31"; // Deri te cila dat dmth qito dyja i bin per 1 muj tcaktum qe e zgedh atje.
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1); //per me e kriju ni format dates ,
            //edhe daten ne string(sdate1,dhe sdate2) per mi kthy ne Date object se na vyn per me ja dergu parametra querit.
            Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate2);
            try {

                Perdoruesi p = (Perdoruesi) perdoruesiCB.getSelectedItem();//Krijo perdoruesin sipas comboboxit
                int id = p.getPunetoriID().getPunetoriID();//merrja id e punetorit
                jashtOrarit = vr.findJashtOrarit(id, date1, d2);//Merja krejt ort per 1 muj tcaktum ni punetori
                total = vr.findTotal(id, date1, d2);//Merrja krejt ort e rregullta 1 punetori
                festa = vr.findFesta(id, date1, d2);//Merrja krejt ort nese ka punu najher per festa , sepse festat paguhen

                /*
                Vendosja e vlerave totale nga databasa ne fielda te pagesaForm
                 */
                oreTeRregulltaTxt.setText(total + "");
                jashtOraritTxt.setText(jashtOrarit + "");
                festaTxt.setText(festa + "");

                /*

                Kalkulimet per pagesa, e kena llogarit totalin e orve * sa paguhet punetori per 1 pozit tcaktume rreshti par
                E kena llogarit totalin e orve jasht orarit * sa paguhet per 1 pozit tcaktume per or
                Rreshti 3t e llogarit qat jasht orarit 50% ma shum dmth 0.5*(sa or jasht orarit) +
                jashtOrarit qe e kena llogarit ma nalt
                Rreshti 4 e llogarit ne $E oret sa ka punu*sa paguhet , pastaj rreshti fundit krejt qato e llogarit me 50%

                 */
                ArrayList<Kontrata> kontratat = new ArrayList<>(p.getPunetoriID().getKontrataCollection());

                double pagesaPerOre = kontratat.get(0).getPagesaPerOre();
                double kontributiPersonal = kontratat.get(0).getKontributiPersonal() / 100.0;

                double totalCalc = total * pagesaPerOre; //Total oret * sa paguhet ora.
                double jashtCalc = jashtOrarit * pagesaPerOre; //Jasht orarit * sa paguhet ora
                double jashtCalcPerqindja = (0.5 * jashtCalc) + jashtCalc;//Me ja llogarit 50% ma shume.
                double holiday = festa * pagesaPerOre;//Sa or per fest * sa i paguhet ora
                double holidayCalc = (0.5 * holiday) + holiday;//Me llogarit 50% ma shum.

                //Kalkulimet per tvsh dhe kontribute personale...
                // double bruto = totalCalc+jashtCalcPerqindja+holidayCalc;
                double bruto = totalCalc + jashtCalcPerqindja + holidayCalc;
                double kontributetPersonale = (kontributiPersonal * bruto);//0.05*400 psh ..
                double vleraTatim = bruto - kontributetPersonale; //Vlera qe tatohet , qe i bjen 400 tkan dal bruto - 20 per kontribut
                //Vlera e tatuar mbet 380.

                brutoTxt.setText(dec.format(bruto) + "");
                kontributiPersonalTxt.setText(dec.format(kontributetPersonale) + "");

                double perqindja_0 = 0.0;//0-80;
                double perqindja_1 = 0.04; //80-250
                double perqindja_2 = 0.08;//250-450
                double perqindja_3 = 0.1;//over 450

                double totaliITatimit = 0;

                if (vleraTatim > 0 || vleraTatim <= 80) {
                    totaliITatimit = 0;
                }

                if (vleraTatim >= 250) {
                    totaliITatimit += 6.8;

                } else if (vleraTatim < 250 && vleraTatim >= 80) {//240
                    totaliITatimit += (vleraTatim - 80) * perqindja_1;//6.8
                }

                if (vleraTatim > 450) {
                    totaliITatimit += 16.00;
                    totaliITatimit += (vleraTatim - 450) * 0.1;
                } else if (vleraTatim < 450 && vleraTatim > 250) {
                    totaliITatimit += (vleraTatim - 250) * perqindja_2;
                }

                totalTatimiTxt.setText(Double.parseDouble(dec.format(totaliITatimit)) + "");

                double neto = vleraTatim - totaliITatimit;
                netoTxt.setText(dec.format(neto) + "");

            } catch (EmployeeException ex) {
            }
        } catch (ParseException ex) {
            Logger.getLogger(PagesaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMonthChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMonthChooser1PropertyChange
        // TODO add your handling code here:

        if (jMonthChooser1.getMonth() < 9) {
            s = "0" + (jMonthChooser1.getMonth() + 1);//PER ME EMARR MUJIN SE KJO MA KTHEJKE VEQ INT E JA KOM SHTU QAT 0 NESE OSHT
            //NDERMJET 0-9 MUJT , TANI PERNDRYSHE E BON 10 , 11 ,12. E QE JON MAT VOGJEL 01,02,03,04,05
        } else {
            s = (jMonthChooser1.getMonth() + 1) + "";
        }
    }//GEN-LAST:event_jMonthChooser1PropertyChange

    private void perdoruesiCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_perdoruesiCBItemStateChanged
        // TODO add your handling code here:
        Perdoruesi p = (Perdoruesi) perdoruesiCB.getSelectedItem();

        idTxt.setText(p.getPunetoriID().getPunetoriID().toString());
        emriTxt.setText(p.getPunetoriID().getEmri());
        mbiemriTxt.setText(p.getPunetoriID().getMbiemri());
        dataLindjes.setDate(p.getPunetoriID().getDataLindjes());
        dataPunesimit.setDate(p.getPunetoriID().getDataPunesimit());
        //telMobilTxt.setText(p.getPunetoriID().getTelefoniCollection().i`terator().next().toString());
        departmentiTxt.setText(p.getPunetoriID().getDepartmentiId().getEmriDepartmentit());
        pozitaTxt.setText(p.getPunetoriID().getTitulli().toString());
    }//GEN-LAST:event_perdoruesiCBItemStateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged

    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            month.setEnabled(false);
        } else if (!jCheckBox1.isSelected()) {
            month.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    public void load() {
        // TODO add your handling code here:
        List<Pagesa> list = null;
        Perdoruesi p = (Perdoruesi) perdoruesiCBB.getSelectedItem();
        try {
            if (jCheckBox1.isSelected()) {
                list = pagesarepository.findEmpId(p.getPerdoruesiID());
                ptm.addList(list);
                table.setModel(ptm);
                ptm.fireTableDataChanged();

            } else if (!jCheckBox1.isSelected()) {

                String str = "0" + (month.getMonth() + 1);
                System.out.println(str);

                List<Pagesa> lista = pagesarepository.em.createQuery("Select p from Pagesa p where p.perdoruesiId.perdoruesiID=" + p.getPerdoruesiID() + " and p.muajiPageses LIKE '2019-" + str + "-%'").getResultList();
                ptm.addList(lista);
                table.setModel(ptm);
                ptm.fireTableDataChanged();
            }
        } catch (EmployeeException ex) {
        }

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        load();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String sql = "";
        String path = "";
          String str;
            if (month.getMonth() < 9) {
                
                  str = "0" + (month.getMonth() + 1);
            } else {
                str = (month.getMonth() + 1) + "";
            }
        System.out.println(month.getMonth());
        System.out.println(str);

        Perdoruesi p = (Perdoruesi) perdoruesiCBB.getSelectedItem();
        if (jCheckBox1.isSelected()) {
            sql = "SELECT * FROM PERDORUESI PR INNER JOIN PUNETORI P ON PR.punetoriID = P.punetoriID INNER JOIN Titulli_Punetorit TP ON P.titulli = TP.TitulliID\n"
                    + "INNER JOIN DEPARTMENTI D ON D.departmentiID = P.departmenti_id INNER JOIN PAGESA PA ON PR.PerdoruesiID = PA.perdoruesi_id INNER JOIN ZBRITJA Z\n"
                    + "ON Z.PagesaID = PA.PagesaID INNER JOIN KONTRATA K ON k.punetori_id=P.punetoriID where pa.perdoruesi_id=" + p.getPerdoruesiID();
            path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\PagesaAllReport.jrxml";
            ReportTemplateAll(sql, path);

        } else if (!jCheckBox1.isSelected()) {
            try {
                
                String sDate1 = "2019-" + str + "-01";
                String sDate2 = "2019-" + str + "-31";
                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);

                Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate2);
                try {

                    int id = p.getPunetoriID().getPunetoriID();
                    jashtOrarit = vr.findJashtOrarit(id, date1, d2);
                    total = vr.findTotal(id, date1, d2);
                    festa = vr.findFesta(id, date1, d2);

                    path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\PagesaReport.jrxml";
                    sql = "SELECT * FROM PERDORUESI PR INNER JOIN PUNETORI P ON PR.punetoriID = P.punetoriID INNER JOIN Titulli_Punetorit TP ON P.titulli = TP.TitulliID\n"
                            + "INNER JOIN DEPARTMENTI D ON D.departmentiID = P.departmenti_id INNER JOIN PAGESA PA ON PR.PerdoruesiID = PA.perdoruesi_id INNER JOIN ZBRITJA Z\n"
                            + "ON Z.PagesaID = PA.PagesaID INNER JOIN KONTRATA K ON k.punetori_id=P.punetoriID where pa.muaji_pageses LIKE '2019-" + str + "-%' AND pa.perdoruesi_id=" + p.getPerdoruesiID();

                    ReportTemplate(sql, path);

                } catch (EmployeeException ex) {
                }

            } catch (ParseException ex) {
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    public void ReportTemplate(String SqlStatement, String path) {
        try {

            int x = (int) (Math.random() * 500);
            trans1 += 001 + "" + x;
            JasperDesign jd = JRXmlLoader.load(path);
            HashMap param = new HashMap();
            param.put("trans1", trans1);
            param.put("total", total);
            param.put("muaji", muaji);
            param.put("jashtOrarit", jashtOrarit);
            param.put("festa", festa);
            JRDesignQuery query = new JRDesignQuery();
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

    public void ReportTemplateAll(String SqlStatement, String path) {
        try {
            int x = (int) (Math.random() * 1000);
            trans += 000 + "" + x;
            Perdoruesi p = (Perdoruesi) perdoruesiCBB.getSelectedItem();
            JasperDesign jd = JRXmlLoader.load(path);
            HashMap param = new HashMap();
            param.put("emri", p.getPunetoriID().getEmri() + " " + p.getPunetoriID().getMbiemri());
            param.put("departmenti", p.getPunetoriID().getDepartmentiId().getEmriDepartmentit());
            param.put("pozita", p.getPunetoriID().getTitulli().getTitulliPershkrimi());
            param.put("trans", trans);

            JRDesignQuery query = new JRDesignQuery();
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

    public void loadTable() {
        try {
            List<Pagesa> list = pagesarepository.findAll();
            ptm.addList(list);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brutoTxt;
    private com.toedter.calendar.JDateChooser dataLindjes;
    private com.toedter.calendar.JDateChooser dataPunesimit;
    private javax.swing.JTextField departmentiTxt;
    private javax.swing.JTextField emriTxt;
    private javax.swing.JTextField festaTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jashtOraritTxt;
    private javax.swing.JTextField kontributiPersonalTxt;
    private javax.swing.JTextField mbiemriTxt;
    private com.toedter.calendar.JMonthChooser month;
    private javax.swing.JTextField netoTxt;
    private javax.swing.JTextField oreTeRregulltaTxt;
    private javax.swing.JComboBox perdoruesiCB;
    private javax.swing.JComboBox perdoruesiCBB;
    private javax.swing.JTextField pozitaTxt;
    private javax.swing.JTable table;
    private javax.swing.JTextField telMobilTxt;
    private javax.swing.JTextField totalTatimiTxt;
    // End of variables declaration//GEN-END:variables
}
