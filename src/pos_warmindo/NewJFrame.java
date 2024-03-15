
package pos_warmindo;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        
        //mengatur lebar kolom tabel
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
    }

    public void addtable(int id, String Name, int Qty, int Price ){
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();

        int totalPrice=Price*Integer.valueOf(Qty);
        
        
        //tambah jumlah saat produk diklik
          for(int row=0; row<jTable1.getRowCount();row++){
            if(Name==jTable1.getValueAt(row,1)){
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            }
        }
        
        Vector v=new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(totalPrice);
        
        dt.addRow(v);
    }
    
    public void cal() {
    // Menjumlahkan total harga
    int numOfRow = jTable1.getRowCount();
    int tot = 0;

    for (int i = 0; i < numOfRow; i++) {
        int value = Integer.parseInt(jTable1.getValueAt(i, 3).toString());

        tot += value;
    }

    total.setText(String.valueOf(tot));
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_item1 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        btn_item2 = new javax.swing.JButton();
        q2 = new javax.swing.JLabel();
        btn_item3 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        btn_item4 = new javax.swing.JButton();
        q4 = new javax.swing.JLabel();
        btn_item5 = new javax.swing.JButton();
        q5 = new javax.swing.JLabel();
        btn_item6 = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        btn_item7 = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        btn_item8 = new javax.swing.JButton();
        q8 = new javax.swing.JLabel();
        btn_item9 = new javax.swing.JButton();
        q9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        text_kembalian = new javax.swing.JLabel();
        kembalian = new javax.swing.JLabel();
        text_tunai = new javax.swing.JLabel();
        text_total = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        tunai = new javax.swing.JTextField();
        btn_print = new javax.swing.JButton();
        btn_pay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_item1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1.png"))); // NOI18N
        btn_item1.setBorder(null);
        btn_item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item1ActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");

        btn_item2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/2.png"))); // NOI18N
        btn_item2.setBorder(null);
        btn_item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item2ActionPerformed(evt);
            }
        });

        q2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");

        btn_item3.setIcon(new javax.swing.ImageIcon("D:\\Learn_Code\\Belajar Java\\POS_Warmindo\\src\\IMG\\3.png")); // NOI18N
        btn_item3.setBorder(null);
        btn_item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item3ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");

        btn_item4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/4.png"))); // NOI18N
        btn_item4.setBorder(null);
        btn_item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item4ActionPerformed(evt);
            }
        });

        q4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");

        btn_item5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/9.png"))); // NOI18N
        btn_item5.setBorder(null);
        btn_item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item5ActionPerformed(evt);
            }
        });

        q5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");

        btn_item6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/6.png"))); // NOI18N
        btn_item6.setBorder(null);
        btn_item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item6ActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");

        btn_item7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/7.png"))); // NOI18N
        btn_item7.setBorder(null);
        btn_item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item7ActionPerformed(evt);
            }
        });

        q7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");

        btn_item8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/8.png"))); // NOI18N
        btn_item8.setBorder(null);
        btn_item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item8ActionPerformed(evt);
            }
        });

        q8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");

        btn_item9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5.png"))); // NOI18N
        btn_item9.setBorder(null);
        btn_item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_item9ActionPerformed(evt);
            }
        });

        q9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Jumlah", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setText("Hapus");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        text_kembalian.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        text_kembalian.setText("Kembalian :");

        kembalian.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        kembalian.setText("0");

        text_tunai.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        text_tunai.setText("Tunai :");

        text_total.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        text_total.setText("Total :");

        total.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        total.setText("0");

        tunai.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunaiActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn_print.setText("Cetak");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_pay.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn_pay.setText("Bayar");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_total)
                    .addComponent(text_tunai)
                    .addComponent(text_kembalian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(tunai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_print)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_total, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_tunai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tunai, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(btn_item1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_item2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_item3)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_item4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btn_item5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_item6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_item7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_item8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_item9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_item1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_item4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_item2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_item3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_item5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_item6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_item7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_item8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_item9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item1ActionPerformed
       //btn code
        int i=Integer.valueOf(q1.getText());
        i++;
        q1.setText(String.valueOf(i));
        
        addtable(1,"Nasi Goreng     ",i, 14000);
        
        cal();
    }//GEN-LAST:event_btn_item1ActionPerformed

    private void btn_item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item2ActionPerformed
        int i=Integer.valueOf(q2.getText());
        i++;
        q2.setText(String.valueOf(i));
        
        addtable(2,"Magelangan      ",i, 13000);
        
        cal();
    }//GEN-LAST:event_btn_item2ActionPerformed

    private void btn_item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item3ActionPerformed
        int i=Integer.valueOf(q3.getText());
        i++;
        q3.setText(String.valueOf(i));
        
        addtable(3,"Mie Rebus      ",i, 10000);
        
        cal();
    }//GEN-LAST:event_btn_item3ActionPerformed

    private void btn_item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item4ActionPerformed
        int i=Integer.valueOf(q4.getText());
        i++;
        q4.setText(String.valueOf(i));
        
        addtable(4,"Mie Goreng      ",i, 10000);
        
        cal();
    }//GEN-LAST:event_btn_item4ActionPerformed

    private void btn_item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item5ActionPerformed
        int i=Integer.valueOf(q5.getText());
        i++;
        q5.setText(String.valueOf(i));
        
        addtable(5,"Ayam Geprek       ",i, 13000);
        
        cal();
    }//GEN-LAST:event_btn_item5ActionPerformed

    private void btn_item6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item6ActionPerformed
        int i=Integer.valueOf(q6.getText());
        i++;
        q6.setText(String.valueOf(i));
        
        addtable(6,"Es Jeruk Peras",i, 5000);
        
        cal();
    }//GEN-LAST:event_btn_item6ActionPerformed

    private void btn_item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item7ActionPerformed
        int i=Integer.valueOf(q7.getText());
        i++;
        q7.setText(String.valueOf(i));
        
        addtable(7,"Es Campur     ",i, 12000);
        
        cal();
    }//GEN-LAST:event_btn_item7ActionPerformed

    private void btn_item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item8ActionPerformed
        int i=Integer.valueOf(q8.getText());
        i++;
        q8.setText(String.valueOf(i));
        
        addtable(8,"Bubur Kacang Ijo",i, 10000);
        
        cal();
    }//GEN-LAST:event_btn_item8ActionPerformed

    private void btn_item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_item9ActionPerformed
        int i=Integer.valueOf(q9.getText());
        i++;
        q9.setText(String.valueOf(i));
        
        addtable(9,"Es Teh           ",i, 3000);
        
        cal();
    }//GEN-LAST:event_btn_item9ActionPerformed

    private void tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tunaiActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        //bill print
        
        try{
           b.setText("                                  WARMINDO \n");
           b.setText(b.getText()+"                                 Jl. Berlobang\n");
           b.setText(b.getText()+"       Blater, Kec. Kalimanah, Kab. Purbalingga, 53371\n");
           b.setText(b.getText()+"-------------------------------------------------------------------------------\n");
           b.setText(b.getText()+"   Item \t\tQty \tHarga\n");
           b.setText(b.getText()+"-------------------------------------------------------------------------------\n");
           
        DefaultTableModel df=(DefaultTableModel) jTable1.getModel();
        
        //get table product details
        for (int i=0;i<jTable1.getRowCount(); i++){
            String Name=df.getValueAt(i, 1).toString();
            String Qty=df.getValueAt(i, 2).toString();
            String Price=df.getValueAt(i, 3).toString();
            b.setText(b.getText()+"   "+Name+ "\t"+Qty+ "\t"+Price+"\n");
        }
        
         b.setText(b.getText()+"-------------------------------------------------------------------------------\n");
         b.setText(b.getText()+"Total :" + total.getText() +"\n");
         b.setText(b.getText()+"Tunai :" + tunai.getText() +"\n");
         b.setText(b.getText()+"Kembali :" + kembalian.getText() +"\n");
         b.setText(b.getText()+"-------------------------------------------------------------------------------\n");
         b.setText(b.getText()+"-------------------------T E R I M A K A S I H--------------------------\n");
         b.setText(b.getText()+"-------------------------------------------------------------------------------\n");
         
         b.print(); //print
         
        }catch(Exception e){
            System.out.println(e);
    }
    }//GEN-LAST:event_btn_printActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       //Hapus beberapa item
       
       DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
       
       String r=dt.getValueAt(jTable1.getSelectedRow(),0).toString();
       
       //hapus produk
       int row=jTable1.getSelectedRow();
       dt.removeRow(row);
       
      
       //hapus jumlah produk (Label)
        System.out.println("r");
       switch(r){
           case "1" :
               q1.setText("0");
               break;
           case "2" :
               q2.setText("0");
               break;
           case "3" :
               q3.setText("0");
               break;
           case "4" :
               q4.setText("0");
               break;
           case "5" :
               q5.setText("0");
               break;
           case "6" :
               q6.setText("0");
               break;
           case "7" :
               q7.setText("0");
               break;
           case "8" :
               q8.setText("0");
               break;
           case "9" :
               q9.setText("0");
               break;
           default:
               System.out.println("Habis");
       }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        // pay button
        
        int tot=Integer.valueOf(total.getText());
        int paid=Integer.valueOf(tunai.getText());
        int balance=paid-tot;
        
        kembalian.setText(String.valueOf(balance));
        
    }//GEN-LAST:event_btn_payActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea b;
    private javax.swing.JButton btn_item1;
    private javax.swing.JButton btn_item2;
    private javax.swing.JButton btn_item3;
    private javax.swing.JButton btn_item4;
    private javax.swing.JButton btn_item5;
    private javax.swing.JButton btn_item6;
    private javax.swing.JButton btn_item7;
    private javax.swing.JButton btn_item8;
    private javax.swing.JButton btn_item9;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kembalian;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel text_kembalian;
    private javax.swing.JLabel text_total;
    private javax.swing.JLabel text_tunai;
    private javax.swing.JLabel total;
    private javax.swing.JTextField tunai;
    // End of variables declaration//GEN-END:variables
}
