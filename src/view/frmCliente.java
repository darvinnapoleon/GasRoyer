package view;

import model.*;
import controllers.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DARVIN
 */
public class frmCliente extends javax.swing.JInternalFrame {

    public frmCliente() {
        initComponents();
        mostrar("");
        bloquear();
        idcli.setVisible(false);

    }

    void accionNuevo() {
        txtapecli.setText("");
        txtnomcli.setText("");
        txttelcli.setText("");
        txtdnicli.setText("");
        mes.setCalendar(null);
        idcli.setText("");
    }

    void bloquear() {
        this.txtapecli.setEnabled(false);
        this.txtnomcli.setEnabled(false);
        this.txttelcli.setEnabled(false);
        this.txtdnicli.setEnabled(false);
        this.btnGua.setEnabled(false);
        this.btnCan.setEnabled(false);
        this.btnAct.setEnabled(false);
        this.btnNue.setEnabled(true);
        this.mes.setEnabled(false);
    }

    void desbloquear() {
        this.txtapecli.setEnabled(true);
        this.txtnomcli.setEnabled(true);
        this.txttelcli.setEnabled(true);
        this.txtdnicli.setEnabled(true);
        this.mes.setEnabled(true);
    }

    void mostrar(String valor) {
        try {
            DefaultTableModel modelo;
            Cliente cat = new Cliente();
            modelo = cat.datos(valor);
            this.tbcli.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idcli = new javax.swing.JLabel();
        eticod1 = new javax.swing.JLabel();
        txtbusca = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnNue = new javax.swing.JButton();
        btnGua = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcli = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txttelcli = new javax.swing.JTextField();
        txtnomcli = new javax.swing.JTextField();
        txtapecli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdnicli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mes = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MANTENIMIENTO DE CLIENTES");
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                formCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jPanel1.setBackground(java.awt.Color.lightGray);

        idcli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        eticod1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        eticod1.setText("Apellidos");

        txtbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscaKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/new_page.png"))); // NOI18N
        btnNue.setText("Nuevo");
        btnNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueActionPerformed(evt);
            }
        });

        btnGua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnGua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/Save.png"))); // NOI18N
        btnGua.setText("Guardar");
        btnGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuaActionPerformed(evt);
            }
        });

        btnAct.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/if_Refresh_132740.png"))); // NOI18N
        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnCan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/Delete.png"))); // NOI18N
        btnCan.setText("Cancelar");
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });

        tbcli.setBackground(new java.awt.Color(204, 204, 204));
        tbcli.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbcli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbcli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcli);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNue)
                        .addGap(36, 36, 36)
                        .addComponent(btnGua, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnAct)
                        .addGap(31, 31, 31))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNue)
                    .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAct))
                .addGap(101, 101, 101))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        txttelcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelcliActionPerformed(evt);
            }
        });
        txttelcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelcliKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelcliKeyTyped(evt);
            }
        });

        txtnomcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomcliKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomcliKeyTyped(evt);
            }
        });

        txtapecli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapecliKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapecliKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Fec. Emisión");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Dni");

        txtdnicli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdnicliKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdnicliKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Telefono");

        mes.setDateFormatString("dd-MM-yyyy");
        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mesKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdnicli, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtapecli, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txttelcli))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtnomcli, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapecli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdnicli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttelcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagenes/gas.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(idcli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 282, Short.MAX_VALUE)
                        .addComponent(eticod1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idcli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eticod1)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapecliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapecliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapecliKeyTyped

    private void txtbuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtbuscaKeyTyped

    private void btnGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuaActionPerformed

        if (this.txtapecli.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingresar Apellidos");
            this.txtapecli.requestFocus();
            return;
        }

        if (this.txtnomcli.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingresar Nombres");
            this.txtnomcli.requestFocus();
            return;
        }
        if (txtdnicli.getText().length() == 0 || txtdnicli.getText().equals(0) || txtdnicli.getText().length() != 8) {
            JOptionPane.showMessageDialog(null, "Ingresar Dni");
            this.txtdnicli.requestFocus();
            return;
        }
        if (mes.getCalendar() == null) {
            JOptionPane.showMessageDialog(null, "Ingresar Fecha Emision");
            this.mes.requestFocus();
            return;
        }
        if (txttelcli.getText().length() == 0 || txttelcli.getText().equals(0) || txttelcli.getText().length() != 9) {
            JOptionPane.showMessageDialog(null, "Ingresar Telefono");
            this.txttelcli.requestFocus();
            return;
        } else {

            mCliente sSql = new mCliente();
            Cliente emp = new Cliente();
            sSql.setDnicli(txtdnicli.getText());
            if (emp.verificadni(sSql) == "") {
                sSql.setApecli(txtapecli.getText());
                sSql.setNomcli(txtnomcli.getText());
                DateFormat fechaHora = new SimpleDateFormat("dd-MM-yyyy");
                String convertido = fechaHora.format(mes.getDate());
                sSql.setFeccli(convertido);
                sSql.setTelcli(txttelcli.getText());
                if (emp.insertar(sSql)) {
                    mBidon sSql1 = new mBidon();
                    Bidon bid = new Bidon();
                    sSql1.setIdcli(1);
                    bid.insbidon(sSql1);
                    JOptionPane.showMessageDialog(rootPane, "Cliente Registrado");
                    accionNuevo();
                    this.txtapecli.requestFocus();
                    mostrar("");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El cliente ya esta registrado");
            }

        }
    }//GEN-LAST:event_btnGuaActionPerformed

    private void btnNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueActionPerformed
        // TODO add your handling code here:
        desbloquear();
        this.btnGua.setEnabled(true);
        this.btnCan.setEnabled(true);
        accionNuevo();
        this.txtapecli.requestFocus();
    }//GEN-LAST:event_btnNueActionPerformed

    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        // TODO add your handling code here:
        accionNuevo();
        bloquear();
        this.txtbusca.requestFocus();
    }//GEN-LAST:event_btnCanActionPerformed

    private void tbcliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcliMouseClicked
        // TODO add your handling code here:
        JPopupMenu popupmenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Eliminar");
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int col = tbcli.getSelectedRow();
                if (col == -1) {
                    JOptionPane.showMessageDialog(null, "Selecciona un Dato");
                } else {
                    int YesOrNo = JOptionPane.showConfirmDialog(null, "Deseas eliminar el registro", "Confirma el Mensaje", JOptionPane.YES_NO_OPTION);
                    if (YesOrNo == 0) {
                        idcli.setText(tbcli.getModel().getValueAt(col, 0).toString());
                        mBidon sSql1 = new mBidon();
                        Bidon bid = new Bidon();
                        sSql1.setIdcli(Integer.parseInt(idcli.getText()));
                        bid.eliminar1(sSql1);
                        mCliente sSql = new mCliente();
                        Cliente emp = new Cliente();
                        sSql.setIdcli(Integer.parseInt(idcli.getText()));
                        if (emp.eliminar(sSql)) {
                            btnGua.setEnabled(false);
                            mostrar("");
                            accionNuevo();
                            bloquear();
                        }
                    }
                }
            }
        });
        JMenuItem menuItem2 = new JMenuItem("Modificar");
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int col = tbcli.getSelectedRow();
                if (col == -1) {
                    JOptionPane.showMessageDialog(null, "Selecciona un Dato");
                } else {

                    txtapecli.setEnabled(true);
                    txtnomcli.setEnabled(true);
                    txttelcli.setEnabled(true);
                    txtdnicli.setEnabled(true);
                    mes.setEnabled(true);
                    btnAct.setEnabled(true);
                    btnCan.setEnabled(true);
                    btnGua.setEnabled(false);
                    Cliente cli3 = new Cliente();
                    idcli.setText(tbcli.getModel().getValueAt(col, 0).toString());
                    txtapecli.setText(tbcli.getModel().getValueAt(col, 1).toString());
                    txtnomcli.setText(tbcli.getModel().getValueAt(col, 2).toString());
                    txtdnicli.setText(tbcli.getModel().getValueAt(col, 3).toString());
                    mes.setDate(cli3.convert(tbcli.getModel().getValueAt(col, 4).toString()));
                    txttelcli.setText(tbcli.getModel().getValueAt(col, 5).toString());

                }
            }
        });
        popupmenu.add(menuItem1);
        popupmenu.add(menuItem2);
        tbcli.setComponentPopupMenu(popupmenu);
    }//GEN-LAST:event_tbcliMouseClicked

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        // TODO add your handling code here:
        if (this.txtapecli.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingresar Apellidos");
            this.txtapecli.requestFocus();
            return;
        }
        if (this.txtnomcli.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingresar Nombres");
            this.txtnomcli.requestFocus();
            return;
        }
        if (txtdnicli.getText().length() == 0 || txtdnicli.getText().equals(0) || txtdnicli.getText().length() != 8) {
            JOptionPane.showMessageDialog(null, "Ingresar Dni");
            this.txtdnicli.requestFocus();
            return;
        }
        if (mes.getCalendar() == null) {
            JOptionPane.showMessageDialog(null, "Ingresar Fecha Emision");
            this.mes.requestFocus();
            return;
        }
        if (txttelcli.getText().length() == 0 || txttelcli.getText().equals(0) || txttelcli.getText().length() != 9) {
            JOptionPane.showMessageDialog(null, "Ingresar Telefono");
            this.txttelcli.requestFocus();
            return;
        } else {
            mCliente sSql = new mCliente();
            Cliente emp = new Cliente();
            sSql.setIdcli(Integer.parseInt(idcli.getText()));
            sSql.setApecli(txtapecli.getText());
            sSql.setNomcli(txtnomcli.getText());
            sSql.setDnicli(txtdnicli.getText());
            DateFormat fechaHora = new SimpleDateFormat("dd-MM-yyyy");
                String convertido = fechaHora.format(mes.getDate());
                sSql.setFeccli(convertido);
            sSql.setTelcli(txttelcli.getText());
            if (emp.actualizar(sSql)) {
                JOptionPane.showMessageDialog(rootPane, "Cliente Actualizado");
                mostrar("");
                accionNuevo();
                bloquear();
            }
        }
    }//GEN-LAST:event_btnActActionPerformed

    private void formCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formCaretPositionChanged

    private void txtapecliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapecliKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txtnomcli.requestFocus();
        }
    }//GEN-LAST:event_txtapecliKeyPressed

    private void txtnomcliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomcliKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txtdnicli.requestFocus();
        }
    }//GEN-LAST:event_txtnomcliKeyPressed

    private void txttelcliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelcliKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txttelcliKeyPressed

    private void txttelcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelcliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelcliKeyTyped

    private void txtnomcliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomcliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnomcliKeyTyped

    private void txtdnicliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdnicliKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.mes.requestFocus();
        }
    }//GEN-LAST:event_txtdnicliKeyPressed

    private void txtdnicliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdnicliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdnicliKeyTyped

    private void txttelcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelcliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelcliActionPerformed

    private void mesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.txttelcli.requestFocus();
        }

    }//GEN-LAST:event_mesKeyPressed

    private void txtbuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        mostrar(this.txtbusca.getText().trim());
        txtbusca.requestFocus();
        txtbusca.setSelectionStart(0);
        txtbusca.setSelectionEnd(txtbusca.getText().length());}
    }//GEN-LAST:event_txtbuscaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnGua;
    private javax.swing.JButton btnNue;
    private javax.swing.JLabel eticod1;
    private javax.swing.JLabel idcli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser mes;
    private javax.swing.JTable tbcli;
    private javax.swing.JTextField txtapecli;
    private javax.swing.JTextField txtbusca;
    private javax.swing.JTextField txtdnicli;
    private javax.swing.JTextField txtnomcli;
    private javax.swing.JTextField txttelcli;
    // End of variables declaration//GEN-END:variables
}
