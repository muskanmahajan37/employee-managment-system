/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.EmployeeException;
import BL.NjoftimiLlojiRepository;
import BL.NjoftimiRepository;
import BL.PerdoruesiRepository;
import DAL.Njoftimi;
import DAL.NjoftimiLloji;
import DAL.Perdoruesi;
import gui.model.NjoftimiComboBoxModel;
import gui.model.NjoftimiTableModel;
import gui.model.PerdoruesiComboBoxModel;
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
public class NjoftimetForm extends javax.swing.JInternalFrame {

    PerdoruesiComboBoxModel pcbm = new PerdoruesiComboBoxModel();
    NjoftimiRepository nr = new NjoftimiRepository();
    PerdoruesiRepository pr = new PerdoruesiRepository();
    NjoftimiComboBoxModel ncbm = new NjoftimiComboBoxModel();
    NjoftimiLlojiRepository nlr = new NjoftimiLlojiRepository();
    NjoftimiTableModel ntm = new NjoftimiTableModel();
    NjoftimiData_1 nd = new NjoftimiData_1();
    int empId = Emp.empId;
    static Njoftimi n;

    public NjoftimetForm() {
        initComponents();
        loadComboBox();
        loadComboBoxNjoftimi();
        loadTable();
        jLabel1.setVisible(false);
        perdoruesiCB.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        perdoruesiCB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        llojiComboBox = new javax.swing.JComboBox();
        data = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        titulliTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dergoBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        zgjidhCB = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perdoruesiCB.setToolTipText("");
        jPanel1.add(perdoruesiCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 69, 196, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Zgjidhni Punetorin:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 71, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Lloji Njoftimit");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 151, -1, -1));

        jPanel1.add(llojiComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 149, 196, -1));

        data.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 189, 196, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 194, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 239, 281, 147));
        jPanel1.add(titulliTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 109, 196, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mesazhi:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Titulli");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 111, -1, -1));

        dergoBtn.setText("Dergo");
        dergoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dergoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dergoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 404, 91, -1));

        jLabel6.setText("Dergo tek:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 26, -1, -1));

        zgjidhCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Te gjitheve", "Punetor te caktuar" }));
        zgjidhCB.setSelectedIndex(-1);
        zgjidhCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                zgjidhCBItemStateChanged(evt);
            }
        });
        jPanel1.add(zgjidhCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 23, 196, -1));

        jTabbedPane1.addTab("Dergo njoftimin", jPanel1);

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
        table.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tableComponentRemoved(evt);
            }
        });
        table.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                tableHierarchyChanged(evt);
            }
        });
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tableAncestorRemoved(evt);
            }
        });
        table.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tableMouseMoved(evt);
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tablePropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Shiko te gjitha njoftimet", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dergoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dergoBtnActionPerformed
        // TODO add your handling code here:

        try {
            Date d = new Date();//Current date per secilin dit bohet update.
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");//Format dite muaj vit.
            String dataStr = format.format(d); //Ndryshimi i formatti te dates (d) nga forma qe e ka pas ne dd-MM-yyyy

            Njoftimi n = new Njoftimi();//Krijo njoftimin e ri.
            n.setMesazhi(message.getText());
            n.setData(data.getDate());
            n.setTitulli(titulliTxt.getText());
            n.setDataDergeses(d);

            NjoftimiLloji nj = (NjoftimiLloji) llojiComboBox.getSelectedItem();//Merre llojin e njoftimin nga CB
            if (nj != null) {
                n.setLlojiId(nj);//Nese so null vendose te tabela e njoftimeve.
            } else {
                nj.setLlojiID(3);//Qe osht null merre si njoftim te llojit tjeter.
                nj.setEmertimi("Tjeter");
                n.setLlojiId(nj);//vendose.
            }

            Perdoruesi p = (Perdoruesi) perdoruesiCB.getSelectedItem();//Merre perdoruesin qe i takon ni njoftimi nese nuk osht null
            if (p != null) {
                n.setPerdoruesiId(p); //Vendose ne tabelen e Njoftimit
            }
            nr.create(n);//Krijo entitetin.

        } catch (EmployeeException e) {

        }
        JOptionPane.showMessageDialog(null, "U DERGUA");
        clear();
        loadTable();
    }//GEN-LAST:event_dergoBtnActionPerformed

    public void clear() {
        titulliTxt.setText("");
        data.setDate(null);
        message.setText(null);
        perdoruesiCB.setSelectedItem(null);
        llojiComboBox.setSelectedItem(null);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if (row != -1) {
            Object[] ob = {"Po", "Jo"};
            int i = JOptionPane.showOptionDialog(this, "A dëshironi te fshihni rekordin ?", "Fshirja",
                    JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if (i == 0) {
                Njoftimi n = ntm.getNjoftimi(row);

                try {
                    nr.delete(n);
                } catch (EmployeeException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                loadTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:

        // TODO add your handling code here:
        int index = table.getSelectedRow();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        TableModel model = table.getModel();
        String id = model.getValueAt(index, 0).toString();
        int x = Integer.parseInt(id);
        
        try {
            n = nr.findByID(x);
        } catch (EmployeeException ex) {
            Logger.getLogger(NjoftimiFormPunetori.class.getName()).log(Level.SEVERE, null, ex);
        }

        String subjekti = model.getValueAt(index, 3).toString();
        String data = model.getValueAt(index, 2).toString();

        Perdoruesi p = null;
        p = n.getPerdoruesiId();
        String str;
        if (p != null) {
            str = p.getPunetoriID().getEmri() + " " + p.getPunetoriID().getMbiemri();
            nd.perLabel.setText(str);
        } else {
            nd.perLabel.setText("Te gjithe");
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

    private void zgjidhCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_zgjidhCBItemStateChanged
        // TODO add your handling code here:
        if (zgjidhCB.getSelectedIndex() == 1) {
            perdoruesiCB.setVisible(true);
            jLabel1.setVisible(true);

        } else if (zgjidhCB.getSelectedIndex() == 0) {
            perdoruesiCB.setVisible(false);
            jLabel1.setVisible(false);
        }
    }//GEN-LAST:event_zgjidhCBItemStateChanged

    private void tableComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tableComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tableComponentRemoved

    private void tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablePropertyChange
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_tablePropertyChange

    private void tableAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorRemoved
        loadTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_tableAncestorRemoved

    private void tableHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_tableHierarchyChanged
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_tableHierarchyChanged

    private void tableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseMoved
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_tableMouseMoved

    public void loadTable() {
        try {
            List<Njoftimi> lista = nr.findAll();
            ntm.addList(lista);
            table.setModel(ntm);
            ntm.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /* METHODS */
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

    public void loadComboBoxNjoftimi() {
        try {
            List<NjoftimiLloji> lista = nlr.findAll();
            ncbm.add(lista);
            llojiComboBox.setModel(ncbm);
            llojiComboBox.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JButton dergoBtn;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox llojiComboBox;
    private javax.swing.JTextArea message;
    public javax.swing.JComboBox perdoruesiCB;
    private javax.swing.JTable table;
    private javax.swing.JTextField titulliTxt;
    private javax.swing.JComboBox<String> zgjidhCB;
    // End of variables declaration//GEN-END:variables
}
