/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.DConnection;
import BL.DepartmentiRepository;
import BL.EmployeeException;
import BL.PunetoriRepository;
import BL.TelefoniRepository;
import BL.Util;
import DAL.Departmenti;
import DAL.Punetori;
import DAL.Telefoni;
import gui.model.DepartmentiComboBoxModel;
import gui.model.PunetorComboBoxModel;
import gui.model.PunetoriTableModel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.eclipse.persistence.sessions.Session;
import java.util.Date;

/**
 *
 * @author MR-ROBOT
 */
public class KerkoPunetorin extends javax.swing.JInternalFrame {

    PunetoriRepository pr = new PunetoriRepository();
    TelefoniRepository tr = new TelefoniRepository();
    PunetoriTableModel ptm = new PunetoriTableModel();
    PunetoriTableModel ptm1 = new PunetoriTableModel();
    PunetoriTableModel ptm2 = new PunetoriTableModel();
    DepartmentiComboBoxModel dcbm = new DepartmentiComboBoxModel();
    DepartmentiRepository dr = new DepartmentiRepository();
    DConnection source = new DConnection();
    int numberOfEmployees = 0;
    int numberTotal = 0;
    int punetoriDep = 0;
    String departmenti;

    public KerkoPunetorin() throws ParseException, EmployeeException {
        initComponents();
        loadComboBox();
        this.setResizable(true);
        personiCB.setVisible(false);
        personiCB.setSelectedItem(null);
        setCurrentDate();
        loadTable();
        loadTableDate();
        departmentiComboBox.setSelectedIndex(0);
        loadTableDepartmenti();

    }

    public void setCurrentDate() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date now = new Date();
        String dateInString = "01/05/2019";
        Date d = dateFormat.parse(dateInString);
        ngaDate.setDate(d);
        deriDate.setDate(now);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        chooseTxt = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        punetoriIDTxt = new javax.swing.JTextField();
        emriTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mbiemriTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gjiniaTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        departmentiTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataLindjes = new com.toedter.calendar.JDateChooser();
        adresaTxt = new javax.swing.JTextField();
        dataPunesimit = new com.toedter.calendar.JDateChooser();
        emailTxt = new javax.swing.JTextField();
        errorTxt = new javax.swing.JLabel();
        telBiznisTxt = new javax.swing.JTextField();
        telMobilTxt = new javax.swing.JTextField();
        telHomeTxt = new javax.swing.JTextField();
        pagaTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        qytetiTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        filtredSearchTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        kerkoSipasCB = new javax.swing.JComboBox<>();
        personiCB = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ngaDate = new com.toedter.calendar.JDateChooser();
        deriDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        departmentiComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dep_table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(chooseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 70, -1, -1));

        jLabel18.setText("Kerko sipas:");

        jLabel3.setText("Mbiemri:");

        jLabel4.setText("Data Lindjes:");

        jLabel6.setText("Address ");

        punetoriIDTxt.setEditable(false);

        emriTxt.setEditable(false);

        jLabel8.setText("Email:");

        mbiemriTxt.setEditable(false);

        jLabel10.setText("Departamenti:");

        gjiniaTxt.setEditable(false);

        jLabel12.setText("Paga:");

        departmentiTxt.setEditable(false);

        jLabel15.setText("TEL mobil");

        jLabel17.setText("Gjinia:");

        jLabel1.setText("Punetori ID:");

        jLabel2.setText("Emri:");

        dataLindjes.setEnabled(false);

        adresaTxt.setEditable(false);

        dataPunesimit.setEnabled(false);

        emailTxt.setEditable(false);

        errorTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        errorTxt.setForeground(new java.awt.Color(255, 51, 0));

        telBiznisTxt.setEditable(false);

        telMobilTxt.setEditable(false);

        telHomeTxt.setEditable(false);

        pagaTxt.setEditable(false);

        jLabel16.setText("Data Punesimit:");

        jLabel19.setText("TEL Home:");

        jLabel20.setText("TEL Biznis");

        qytetiTxt.setEditable(false);

        jLabel9.setText("Qyteti:");

        jButton1.setText("Kerko");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        kerkoSipasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zgjidh.....", "ID", "Emri" }));
        kerkoSipasCB.setToolTipText("");
        kerkoSipasCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kerkoSipasCBActionPerformed(evt);
            }
        });

        personiCB.setSelectedItem(null);
        personiCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personiCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel8))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(38, 38, 38)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adresaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qytetiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(punetoriIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dataLindjes, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mbiemriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel15)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(gjiniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel12)))
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(personiCB, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kerkoSipasCB, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(filtredSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pagaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telMobilTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departmentiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(telHomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(errorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(telBiznisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataPunesimit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(kerkoSipasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtredSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(punetoriIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(departmentiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(errorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(121, 121, 121))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(106, 106, 106)))
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(59, 59, 59)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataPunesimit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(telHomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(emriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel19))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(mbiemriTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel20)
                                                        .addComponent(telBiznisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dataLindjes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15)))
                                        .addComponent(telMobilTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(gjiniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel17)))
                                .addComponent(pagaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qytetiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(adresaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(153, 153, 153))))
        );

        jTabbedPane1.addTab("Sipas Parametrave", jPanel1);

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

        jButton5.setText("Gjenero Raportin");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Te gjithe punetoret", jPanel2);

        ngaDate.setToolTipText("");
        ngaDate.setDateFormatString("dd/MM/yyyy");
        ngaDate.setMaxSelectableDate(new java.util.Date(1577836883000L));
        ngaDate.setMinSelectableDate(new java.util.Date(1514764883000L));

        deriDate.setDateFormatString("dd/MM/yyyy");

        jLabel5.setText("Nga:");

        jLabel7.setText("Deri");

        jButton3.setText("Shfaq");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(table2);

        jButton6.setText("Gjenero Raportin");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addComponent(ngaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(deriDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(182, 182, 182))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(deriDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel7)
                    .addComponent(ngaDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sipas Dates se regjistrimit", jPanel3);

        jLabel11.setText("Zgjedh Departmentin:");

        dep_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(dep_table);

        jButton4.setText("Shfaq");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("Gjenero Raportin");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(91, 91, 91)
                        .addComponent(departmentiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11)
                    .addComponent(departmentiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sipas Departmentit", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            clear();

            int count = 0;
            List<Punetori> lista = pr.findAll();
            if (kerkoSipasCB.getSelectedItem().equals("ID")) {

                for (int i = 0; i < lista.size(); i++) {
                    Punetori p = lista.get(i);
                    if (p.getPunetoriID() == Integer.parseInt(filtredSearchTxt.getText())) {

                        ArrayList<Telefoni> telefonNumbers = new ArrayList<>(p.getTelefoniCollection());
                        punetoriIDTxt.setText(" " + (p.getPunetoriID()));
                        emriTxt.setText(p.getEmri());
                        mbiemriTxt.setText(p.getMbiemri());
                        dataLindjes.setDate(p.getDataLindjes());
                        adresaTxt.setText(p.getAdresa());
                        dataPunesimit.setDate(p.getDataPunesimit());
                        emailTxt.setText(p.getEmail());
                        adresaTxt.setText(p.getAdresa());
                        String gjinia = p.getGjinia();
                        gjiniaTxt.setText(gjinia.equals("M") ? "Mashkull" : "Femer");
                        Telefoni t = telefonNumbers.get(0);
                        departmentiTxt.setText(p.getDepartmentiId().getEmriDepartmentit());
                        telHomeTxt.setText(t.getTelefoniShtepise());
                        telBiznisTxt.setText(t.getTelefoniBiznesit());
                        telMobilTxt.setText(t.getTelefoniMobil());
                        qytetiTxt.setText(p.getQyteti());

                    }
                }
            } else if (kerkoSipasCB.getSelectedItem().equals("Emri")) {
                for (int i = 0; i < lista.size(); i++) {
                    Punetori p = lista.get(i);
                    if (p.getEmri().equals(filtredSearchTxt.getText())) {
                        count++;
                    }
                }
                ArrayList<Punetori> punetoret = new ArrayList<>();
                if (count > 1) {
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getEmri().equals(filtredSearchTxt.getText())) {
                            punetoret.add(lista.get(i));
                        }
                    }
                    for (int i = 0; i < punetoret.size(); i++) {
                        Punetori p = punetoret.get(i);
                        if (((DefaultComboBoxModel) personiCB.getModel()).getIndexOf(p) == -1) {
                            personiCB.addItem(p);
                        }

                    }

                    personiCB.setVisible(true);

                    Punetori p = (Punetori) personiCB.getSelectedItem();
                    ArrayList<Telefoni> telefonNumbers = new ArrayList<>(p.getTelefoniCollection());
                    punetoriIDTxt.setText(" " + (p.getPunetoriID()));
                    emriTxt.setText(p.getEmri());
                    mbiemriTxt.setText(p.getMbiemri());
                    dataLindjes.setDate(p.getDataLindjes());
                    adresaTxt.setText(p.getAdresa());
                    dataPunesimit.setDate(p.getDataPunesimit());
                    emailTxt.setText(p.getEmail());
                    adresaTxt.setText(p.getAdresa());
                    String gjinia = p.getGjinia();
                    gjiniaTxt.setText(gjinia.equals("M") ? "Mashkull" : "Femer");
                    Telefoni t = telefonNumbers.get(0);
                    departmentiTxt.setText(p.getDepartmentiId().getEmriDepartmentit());
                    telHomeTxt.setText(t.getTelefoniShtepise());
                    telBiznisTxt.setText(t.getTelefoniBiznesit());
                    telMobilTxt.setText(t.getTelefoniMobil());
                    qytetiTxt.setText(p.getQyteti());

                } else if (count == 1) {
                    personiCB.setVisible(false);
                    for (Punetori p : lista) {
                        personiCB.setSelectedItem(null);
                        if (p.getEmri().equalsIgnoreCase(filtredSearchTxt.getText())) {
                            punetoriIDTxt.setText(" " + (p.getPunetoriID()));
                            ArrayList<Telefoni> telefonNumbers = new ArrayList<>(p.getTelefoniCollection());
                            emriTxt.setText(p.getEmri());
                            mbiemriTxt.setText(p.getMbiemri());
                            dataLindjes.setDate(p.getDataLindjes());
                            adresaTxt.setText(p.getAdresa());
                            dataPunesimit.setDate(p.getDataPunesimit());
                            emailTxt.setText(p.getEmail());
                            adresaTxt.setText(p.getAdresa());
                            String gjinia = p.getGjinia();
                            gjiniaTxt.setText(gjinia.equals("M") ? "Mashkull" : "Femer");
                            Telefoni t = telefonNumbers.get(0);
                            departmentiTxt.setText(p.getDepartmentiId().getEmriDepartmentit());
                            telHomeTxt.setText(t.getTelefoniShtepise());
                            telBiznisTxt.setText(t.getTelefoniBiznesit());
                            telMobilTxt.setText(t.getTelefoniMobil());
                            qytetiTxt.setText(p.getQyteti());
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void clear() {
        punetoriIDTxt.setText("");
        emriTxt.setText("");
        mbiemriTxt.setText("");
        dataLindjes.setDate(null);
        adresaTxt.setText("");
        dataPunesimit.setDate(null);
        emailTxt.setText("");
        adresaTxt.setText("");
        gjiniaTxt.setText("");
        departmentiTxt.setText("");
        telHomeTxt.setText("");
        telBiznisTxt.setText("");
        telMobilTxt.setText("");
        qytetiTxt.setText("");
    }

    public void loadTable() {
        try {
            List<Punetori> lista = pr.findOnlyEmployees();
            numberTotal = lista.size();
            List<Telefoni> lista_tel = tr.findAll();
            ptm.addList(lista, lista_tel);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            loadTableDate();
        } catch (ParseException ex) {
            Logger.getLogger(KerkoPunetorin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void loadComboBox() {
        try {
            List<Departmenti> lista = dr.findAll();
            dcbm.add(lista);
            departmentiComboBox.setModel(dcbm);
            departmentiComboBox.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }


    private void kerkoSipasCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kerkoSipasCBActionPerformed

        if (kerkoSipasCB.getSelectedItem().equals("ID")) {
            personiCB.setVisible(false);
        }
        kerkoSipasCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                //kryn ni funksion sa her qe comboboxit i ndryshon Elementi.
                clear();
                filtredSearchTxt.setText("");
            }
        });
    }//GEN-LAST:event_kerkoSipasCBActionPerformed

    private void personiCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personiCBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_personiCBActionPerformed

    public void loadTableDepartmenti() throws EmployeeException {
        // TODO add your handling code here:
        Departmenti d = (Departmenti) departmentiComboBox.getSelectedItem();
        List<Punetori> lista = pr.getByDepartmenti(d.getDepartmentiID());
        punetoriDep = lista.size();
        List<Telefoni> lista_tel = tr.findAll();
        List<Punetori> filteredList = new ArrayList<>();
        for (Punetori p : lista) {
            if (p.getPerdoruesi().getRoliID().getRoliID() != 1) {
                filteredList.add(p);
            }
        }
        dep_table.setModel(ptm2);
        ptm2.fireTableDataChanged();
        ptm2.addList(filteredList, lista_tel);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            loadTableDepartmenti();
        } catch (EmployeeException ex) {
            Logger.getLogger(KerkoPunetorin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    public void ReportTemplateParam(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            HashMap param = new HashMap();
            param.put("ngaDate", ngaDate.getDate());
            param.put("deriDate", deriDate.getDate());
            param.put("numberOfEmployees", numberOfEmployees);

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

    public void ReportTemplate(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            JRDesignQuery query = new JRDesignQuery();
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void ReportTemplateAll(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            HashMap param = new HashMap();
            param.put("numberTotal", numberTotal);
            int nr = new Random().nextInt(1000);
            String text = "emp2019-" + nr + "";
            param.put("randomNumber", text);
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


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\PunetoriReports.jrxml";
        String sql = "Select * from Punetori p Inner join Perdoruesi pr on pr.punetoriID = p.punetoriID where  pr.RoliID=2";
        ReportTemplateAll(sql, path);


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String ngaDateStr = format.format(ngaDate.getDate());
        String deriDateStr = format.format(deriDate.getDate());

        String path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\PunetoriDataRaport.jrxml";
        String sql = "SELECT DISTINCT * from PUNETORI p inner join Departmenti d on P.departmenti_id = D.departmentiID WHERE DATA_PUNESIMIT BETWEEN " + "'" + ngaDateStr + "'" + " AND" + "'" + deriDateStr + "'";
        ReportTemplateParam(sql, path);

    }//GEN-LAST:event_jButton6ActionPerformed


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Departmenti d = (Departmenti) departmentiComboBox.getSelectedItem();
        int numri = d.getDepartmentiID();
        String path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\PunetoriDepartmenti.jrxml";
        String sql = "SELECT * FROM PUNETORI P INNER JOIN DEPARTMENTI DR ON P.DEPARTMENTI_ID = DR.DEPARTMENTIID INNER JOIN PERDORUESI PR ON PR.PUNETORIID=P.PUNETORIID WHERE PR.ROLIID=2 AND p.departmenti_ID=" + numri;
        ReportTemplateDepartmenti(sql, path);

    }//GEN-LAST:event_jButton7ActionPerformed

    public void ReportTemplateDepartmenti(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            HashMap param = new HashMap();
            param.put("punetoriDep", punetoriDep);
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

    public void loadTableDate() throws ParseException {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String dateInString = "01-05-2019";
            Date d = sdf.parse(dateInString);

            List<Punetori> lista = pr.getByDateRegjistrimit(ngaDate.getDate(), deriDate.getDate());
            List<Telefoni> lista_tel = tr.findAll();
            numberOfEmployees = lista.size();
            ptm1.addList(lista, lista_tel);
            table2.setModel(ptm1);
            ptm1.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresaTxt;
    private javax.swing.JLabel chooseTxt;
    private com.toedter.calendar.JDateChooser dataLindjes;
    private com.toedter.calendar.JDateChooser dataPunesimit;
    private javax.swing.JTable dep_table;
    private javax.swing.JComboBox departmentiComboBox;
    private javax.swing.JTextField departmentiTxt;
    private com.toedter.calendar.JDateChooser deriDate;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField emriTxt;
    private javax.swing.JLabel errorTxt;
    private javax.swing.JTextField filtredSearchTxt;
    private javax.swing.JTextField gjiniaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> kerkoSipasCB;
    private javax.swing.JTextField mbiemriTxt;
    private com.toedter.calendar.JDateChooser ngaDate;
    private javax.swing.JTextField pagaTxt;
    private javax.swing.JComboBox<Punetori> personiCB;
    private javax.swing.JTextField punetoriIDTxt;
    private javax.swing.JTextField qytetiTxt;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    private javax.swing.JTextField telBiznisTxt;
    private javax.swing.JTextField telHomeTxt;
    private javax.swing.JTextField telMobilTxt;
    // End of variables declaration//GEN-END:variables

}
