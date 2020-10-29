package RMIProyecto;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import javax.swing.JOptionPane;

public class Cliente_Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Cliente_Interfaz
     */
    public Cliente_Interfaz() {
        initComponents();
        
        txtnum1.setHorizontalAlignment(txtnum1.CENTER);
        txtnum2.setHorizontalAlignment(txtnum2.CENTER);
        txtden1.setHorizontalAlignment(txtden1.CENTER);
        txtden2.setHorizontalAlignment(txtden2.CENTER);

        txtres1.setHorizontalAlignment(txtres1.CENTER);
        txtres2.setHorizontalAlignment(txtres2.CENTER);
        txtres3.setHorizontalAlignment(txtres3.CENTER);
        txtres4.setHorizontalAlignment(txtres4.CENTER);
        
        txtres1.setEditable(false);
        txtres2.setEditable(false);
        txtres3.setEditable(false);
        txtres4.setEditable(false);
        txtres5.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtres1 = new javax.swing.JTextField();
        txtres2 = new javax.swing.JTextField();
        txtres3 = new javax.swing.JTextField();
        txtres4 = new javax.swing.JTextField();
        txtres5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtden1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        txtden2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnsumar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(113, 198, 198));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel1.setText("Programación cliente/servidor");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel2.setText("Resultados");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel3.setText("Guerrero Artiño Marcos Adrian - 17231726");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel5.setText("CALCULADORA DE FRACCIONES");

        jPanel1.setBackground(new java.awt.Color(220, 200, 119));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel7.setText("Resultado real");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel8.setText("Resultado");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel9.setText("Simplificado");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel10.setText("Resultado Decimal");

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtres3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                                        .addComponent(txtres4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtres2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtres1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtres5)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtres1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtres2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtres3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtres4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtres5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel4.setText("Fracción 2");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel6.setText("Fracción 1");

        txtnum1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnum1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum1KeyTyped(evt);
            }
        });

        txtden1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtden1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtden1KeyTyped(evt);
            }
        });

        txtnum2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtnum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnum2KeyTyped(evt);
            }
        });

        txtden2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtden2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtden2KeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        btnsumar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsumar.setText("+");
        btnsumar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });

        btnrestar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrestar.setText("-");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });

        btnmultiplicar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmultiplicar.setText("x");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });

        btndividir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndividir.setText("%");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(txtden1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btndividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnmultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnsumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(btnlimpiar)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsalir))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtden2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(145, 145, 145)
                .addComponent(jLabel4)
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(218, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(130, 130, 130)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnsumar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnrestar))
                            .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtden1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnmultiplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndividir))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtden2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar)
                            .addComponent(btnsalir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel5)
                    .addContainerGap(369, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtnum1.setText("");
        txtnum2.setText("");
        txtden1.setText("");
        txtden2.setText("");
        
        txtres1.setText("");
        txtres2.setText("");
        txtres3.setText("");
        txtres4.setText("");
        txtres5.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed
        try
        {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 9999);
            
            metodos_rmi metodos = (metodos_rmi)registro.lookup("servidorarti");
            
            float numerador1, numerador2, denominador1, denominador2;
            
            numerador1 = Float.parseFloat(txtnum1.getText());
            denominador1 = Float.parseFloat(txtden1.getText());
            numerador2 = Float.parseFloat(txtnum2.getText());
            denominador2 = Float.parseFloat(txtden2.getText());
            jLabel11.setText("Suma:");
            float[] suma;
            suma = metodos.sumar(new float[]{numerador1,denominador1,numerador2,denominador2,0});
            
            switch (suma.length) {
                
                //Si se puede simplificar..
                case 5 -> {
                    int n1,d1,n2,d2;
                    n1 = Math.round(suma[0]);
                    d1 = Math.round(suma[1]);
                    n2 = Math.round(suma[3]);
                    d2 = Math.round(suma[4]);
                    
                    txtres1.setText(Integer.toString(n1));
                    txtres2.setText(Integer.toString(d1));
                    //simplificacion
                    txtres3.setText(Integer.toString(n2));
                    if (d2 == 0)
                    {
                        txtres4.setText("1");
                    }
                    else
                    {
                        txtres4.setText(Integer.toString(d2));
                    }
                    
                    
                    //decimal
                    txtres5.setText(Float.toString(suma[2]));
                }
                default -> {
                }
            }
        }
        catch(RemoteException | NotBoundException | NumberFormatException rex){
            JOptionPane.showMessageDialog(this,rex.getMessage());
        }
    }//GEN-LAST:event_btnsumarActionPerformed

    private void txtnum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum1KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo numeros!");
        }
    }//GEN-LAST:event_txtnum1KeyTyped

    private void txtden1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtden1KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo numeros!");
        }
    }//GEN-LAST:event_txtden1KeyTyped

    private void txtnum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum2KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo numeros!");
        }
    }//GEN-LAST:event_txtnum2KeyTyped

    private void txtden2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtden2KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo numeros!");
        }
    }//GEN-LAST:event_txtden2KeyTyped

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        try
        {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 9999);
            
            metodos_rmi metodos = (metodos_rmi)registro.lookup("servidorarti");
            
            float numerador1, numerador2, denominador1, denominador2;
            
            jLabel11.setText("Resta:");
            
            numerador1 = Float.parseFloat(txtnum1.getText());
            denominador1 = Float.parseFloat(txtden1.getText());
            numerador2 = Float.parseFloat(txtnum2.getText());
            denominador2 = Float.parseFloat(txtden2.getText());
            
            float[] resta;
            resta = metodos.restar(new float[]{numerador1,denominador1,numerador2,denominador2,0});
            
            switch (resta.length) {
                
                //Si se puede simplificar..
                case 5 -> {
                    int n1,d1,n2,d2;
                    n1 = Math.round(resta[0]);
                    d1 = Math.round(resta[1]);
                    n2 = Math.round(resta[3]);
                    d2 = Math.round(resta[4]);
                    
                    txtres1.setText(Integer.toString(n1));
                    txtres2.setText(Integer.toString(d1));
                    //simplificacion
                    txtres3.setText(Integer.toString(n2));
                    if (d2 == 0)
                    {
                        txtres4.setText("1");
                    }
                    else
                    {
                        txtres4.setText(Integer.toString(d2));
                    }
                    
                    
                    //decimal
                    txtres5.setText(Float.toString(resta[2]));
                }
                default -> {
                }
            }
        }
        catch(RemoteException | NotBoundException | NumberFormatException rex){
            JOptionPane.showMessageDialog(this,rex.getMessage());
        }
    }//GEN-LAST:event_btnrestarActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
        try
        {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 9999);
            
            metodos_rmi metodos = (metodos_rmi)registro.lookup("servidorarti");
            
            float numerador1, numerador2, denominador1, denominador2;
            
            numerador1 = Float.parseFloat(txtnum1.getText());
            denominador1 = Float.parseFloat(txtden1.getText());
            numerador2 = Float.parseFloat(txtnum2.getText());
            denominador2 = Float.parseFloat(txtden2.getText());
            jLabel11.setText("Multiplicación:");
            float[] multi;
            multi = metodos.multiplicar(new float[]{numerador1,denominador1,numerador2,denominador2,0});
            
            switch (multi.length) {
                
                //Si se puede simplificar..
                case 5 -> {
                    int n1,d1,n2,d2;
                    n1 = Math.round(multi[0]);
                    d1 = Math.round(multi[1]);
                    n2 = Math.round(multi[3]);
                    d2 = Math.round(multi[4]);
                    
                    txtres1.setText(Integer.toString(n1));
                    txtres2.setText(Integer.toString(d1));
                    //simplificacion
                    txtres3.setText(Integer.toString(n2));
                    if (d2 == 0)
                    {
                        txtres4.setText("1");
                    }
                    else
                    {
                        txtres4.setText(Integer.toString(d2));
                    }
                    
                    
                    //decimal
                    txtres5.setText(Float.toString(multi[2]));
                }
                default -> {
                }
            }
        }
        catch(RemoteException | NotBoundException | NumberFormatException rex){
            JOptionPane.showMessageDialog(this,rex.getMessage());
        }
    }//GEN-LAST:event_btnmultiplicarActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        try
        {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 9999);
            
            metodos_rmi metodos = (metodos_rmi)registro.lookup("servidorarti");
            
            float numerador1, numerador2, denominador1, denominador2;
            
            numerador1 = Float.parseFloat(txtnum1.getText());
            denominador1 = Float.parseFloat(txtden1.getText());
            numerador2 = Float.parseFloat(txtnum2.getText());
            denominador2 = Float.parseFloat(txtden2.getText());
            jLabel11.setText("División:");
            float[] div;
            div = metodos.dividir(new float[]{numerador1,denominador1,numerador2,denominador2,0});
            
            switch (div.length) {
                
                //Si se puede simplificar..
                case 5 -> {
                    int n1,d1,n2,d2;
                    n1 = Math.round(div[0]);
                    d1 = Math.round(div[1]);
                    n2 = Math.round(div[3]);
                    d2 = Math.round(div[4]);
                    
                    txtres1.setText(Integer.toString(n1));
                    txtres2.setText(Integer.toString(d1));
                    //simplificacion
                    txtres3.setText(Integer.toString(n2));
                    if (d2 == 0)
                    {
                        txtres4.setText("1");
                    }
                    else
                    {
                        txtres4.setText(Integer.toString(d2));
                    }
                    
                    
                    //decimal
                    txtres5.setText(Float.toString(div[2]));
                }
                default -> {
                }
            }
        }
        catch(RemoteException | NotBoundException | NumberFormatException rex){
            JOptionPane.showMessageDialog(this,rex.getMessage());
        }
    }//GEN-LAST:event_btndividirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtden1;
    private javax.swing.JTextField txtden2;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtres1;
    private javax.swing.JTextField txtres2;
    private javax.swing.JTextField txtres3;
    private javax.swing.JTextField txtres4;
    private javax.swing.JTextField txtres5;
    // End of variables declaration//GEN-END:variables
}
