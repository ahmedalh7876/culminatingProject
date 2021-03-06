/*
 * Author: Ahmed A.
 * Last Edit: 24/01/2019
 * To learn about this program, please read the README note.
 */

//Importing java input and output API, allowing for the reading of external files
import java.io.*;

public class culminatingTest extends javax.swing.JFrame {

    //Global variable declaration and initialization
    int[] wpnDmg = new int[4], wpnPrice = new int[4], wpnKaward = new int[4], clipSize = new int[4], resAmmo = new int[4];
    int[] dmgSort = new int[4];
    String ph, wep1, wep2, wep3, wep4;

    /**
     * Creates new form culminatingTest
     */
    public culminatingTest() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        sideLbl = new javax.swing.JLabel();
        wpnDmgLbl = new javax.swing.JLabel();
        wpnPriceLbl = new javax.swing.JLabel();
        wpnKawardLbl = new javax.swing.JLabel();
        clipSizeLbl = new javax.swing.JLabel();
        resAmmoLbl = new javax.swing.JLabel();
        cmprGunsBtn = new javax.swing.JButton();
        wepList1CB = new javax.swing.JComboBox();
        type1OPLbl = new javax.swing.JLabel();
        side1OPLbl = new javax.swing.JLabel();
        wepDmg1OPLbl = new javax.swing.JLabel();
        wepPrice1OPLbl = new javax.swing.JLabel();
        kAward1OPLbl = new javax.swing.JLabel();
        clipSize1OPLbl = new javax.swing.JLabel();
        resAmmo1OPLbl = new javax.swing.JLabel();
        wepList2CB = new javax.swing.JComboBox();
        type2OPLbl = new javax.swing.JLabel();
        side2OPLbl = new javax.swing.JLabel();
        wepDmg2OPLbl = new javax.swing.JLabel();
        wepPrice2OPLbl = new javax.swing.JLabel();
        kAward2OPLbl = new javax.swing.JLabel();
        clipSize2OPLbl = new javax.swing.JLabel();
        resAmmo2OPLbl = new javax.swing.JLabel();
        wepList3CB = new javax.swing.JComboBox();
        type3OPLbl = new javax.swing.JLabel();
        side3OPLbl = new javax.swing.JLabel();
        wepDmg3OPLbl = new javax.swing.JLabel();
        wepPrice3OPLbl = new javax.swing.JLabel();
        kAward3OPLbl = new javax.swing.JLabel();
        clipSize3OPLbl = new javax.swing.JLabel();
        resAmmo3OPLbl = new javax.swing.JLabel();
        wepList4CB = new javax.swing.JComboBox();
        type4OPLbl = new javax.swing.JLabel();
        side4OPLbl = new javax.swing.JLabel();
        wepDmg4OPLbl = new javax.swing.JLabel();
        wepPrice4OPLbl = new javax.swing.JLabel();
        kAward4OPLbl = new javax.swing.JLabel();
        clipSize4OPLbl = new javax.swing.JLabel();
        resAmmo4OPLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        titleLbl.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 51));
        titleLbl.setText("CS:GO Weapon Master");

        typeLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        typeLbl.setForeground(new java.awt.Color(0, 51, 51));
        typeLbl.setText("Weapon type");

        sideLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        sideLbl.setForeground(new java.awt.Color(0, 51, 51));
        sideLbl.setText("Usable on (CT/T)");

        wpnDmgLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wpnDmgLbl.setForeground(new java.awt.Color(0, 51, 51));
        wpnDmgLbl.setText("Weapon Damage");

        wpnPriceLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wpnPriceLbl.setForeground(new java.awt.Color(0, 51, 51));
        wpnPriceLbl.setText("Weapon Price");

        wpnKawardLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wpnKawardLbl.setForeground(new java.awt.Color(0, 51, 51));
        wpnKawardLbl.setText("Kill Award");

        clipSizeLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clipSizeLbl.setForeground(new java.awt.Color(0, 51, 51));
        clipSizeLbl.setText("Clip Size");

        resAmmoLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        resAmmoLbl.setForeground(new java.awt.Color(0, 51, 51));
        resAmmoLbl.setText("Reserve Ammo");

        cmprGunsBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmprGunsBtn.setForeground(new java.awt.Color(0, 51, 51));
        cmprGunsBtn.setText("Compare items");
        cmprGunsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmprGunsBtnActionPerformed(evt);
            }
        });

        wepList1CB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        wepList1CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weapon 1", "Nova", "P250", "MP7", "AK-47", "AUG", "SG 553", "Negev", "SSG 08" }));
        wepList1CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wepList1CBActionPerformed(evt);
            }
        });

        type1OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        type1OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        type1OPLbl.setText("0");

        side1OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        side1OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        side1OPLbl.setText("0");

        wepDmg1OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepDmg1OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepDmg1OPLbl.setText("0");

        wepPrice1OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepPrice1OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepPrice1OPLbl.setText("0");

        kAward1OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        kAward1OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        kAward1OPLbl.setText("0");

        clipSize1OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clipSize1OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        clipSize1OPLbl.setText("0");

        resAmmo1OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        resAmmo1OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        resAmmo1OPLbl.setText("0");

        wepList2CB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        wepList2CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weapon 2", "Nova", "P250", "MP7", "AK-47", "AUG", "SG 553", "Negev", "SSG 08" }));
        wepList2CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wepList2CBActionPerformed(evt);
            }
        });

        type2OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        type2OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        type2OPLbl.setText("0");

        side2OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        side2OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        side2OPLbl.setText("0");

        wepDmg2OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepDmg2OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepDmg2OPLbl.setText("0");

        wepPrice2OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepPrice2OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepPrice2OPLbl.setText("0");

        kAward2OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        kAward2OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        kAward2OPLbl.setText("0");

        clipSize2OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clipSize2OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        clipSize2OPLbl.setText("0");

        resAmmo2OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        resAmmo2OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        resAmmo2OPLbl.setText("0");

        wepList3CB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        wepList3CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weapon 3", "Nova", "P250", "MP7", "AK-47", "AUG", "SG 553", "Negev", "SSG 08" }));
        wepList3CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wepList3CBActionPerformed(evt);
            }
        });

        type3OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        type3OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        type3OPLbl.setText("0");

        side3OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        side3OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        side3OPLbl.setText("0");

        wepDmg3OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepDmg3OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepDmg3OPLbl.setText("0");

        wepPrice3OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepPrice3OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepPrice3OPLbl.setText("0");

        kAward3OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        kAward3OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        kAward3OPLbl.setText("0");

        clipSize3OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clipSize3OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        clipSize3OPLbl.setText("0");

        resAmmo3OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        resAmmo3OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        resAmmo3OPLbl.setText("0");

        wepList4CB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        wepList4CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weapon 4", "Nova", "P250", "MP7", "AK-47", "AUG", "SG 553", "Negev", "SSG 08" }));
        wepList4CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wepList4CBActionPerformed(evt);
            }
        });

        type4OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        type4OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        type4OPLbl.setText("0");

        side4OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        side4OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        side4OPLbl.setText("0");

        wepDmg4OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepDmg4OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepDmg4OPLbl.setText("0");

        wepPrice4OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        wepPrice4OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        wepPrice4OPLbl.setText("0");

        kAward4OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        kAward4OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        kAward4OPLbl.setText("0");

        clipSize4OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clipSize4OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        clipSize4OPLbl.setText("0");

        resAmmo4OPLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        resAmmo4OPLbl.setForeground(new java.awt.Color(0, 51, 51));
        resAmmo4OPLbl.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(kAward1OPLbl)
                            .addComponent(clipSize1OPLbl)
                            .addComponent(side1OPLbl)
                            .addComponent(type1OPLbl)
                            .addComponent(resAmmo1OPLbl)
                            .addComponent(wepPrice1OPLbl)
                            .addComponent(wepDmg1OPLbl)
                            .addComponent(wepList1CB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(wepList2CB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type2OPLbl)
                            .addComponent(side2OPLbl)
                            .addComponent(wepDmg2OPLbl)
                            .addComponent(wepPrice2OPLbl)
                            .addComponent(kAward2OPLbl)
                            .addComponent(clipSize2OPLbl)
                            .addComponent(resAmmo2OPLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(typeLbl)
                            .addComponent(sideLbl)
                            .addComponent(wpnDmgLbl)
                            .addComponent(wpnPriceLbl)
                            .addComponent(wpnKawardLbl)
                            .addComponent(clipSizeLbl)
                            .addComponent(resAmmoLbl)
                            .addComponent(cmprGunsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(kAward3OPLbl)
                            .addComponent(clipSize3OPLbl)
                            .addComponent(side3OPLbl)
                            .addComponent(type3OPLbl)
                            .addComponent(resAmmo3OPLbl)
                            .addComponent(wepPrice3OPLbl)
                            .addComponent(wepDmg3OPLbl)
                            .addComponent(wepList3CB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(wepList4CB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type4OPLbl)
                            .addComponent(side4OPLbl)
                            .addComponent(wepDmg4OPLbl)
                            .addComponent(wepPrice4OPLbl)
                            .addComponent(kAward4OPLbl)
                            .addComponent(clipSize4OPLbl)
                            .addComponent(resAmmo4OPLbl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(titleLbl)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(wepList2CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(type2OPLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(side2OPLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wepDmg2OPLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wepPrice2OPLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kAward2OPLbl)
                                        .addGap(1, 1, 1)
                                        .addComponent(clipSize2OPLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resAmmo2OPLbl))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(typeLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sideLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wpnDmgLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wpnPriceLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(wpnKawardLbl)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(resAmmoLbl))
                                            .addComponent(clipSizeLbl)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(wepList4CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(type4OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(side4OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wepDmg4OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wepPrice4OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kAward4OPLbl)
                                .addGap(1, 1, 1)
                                .addComponent(clipSize4OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resAmmo4OPLbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(wepList3CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(type3OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(side3OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wepDmg3OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wepPrice3OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kAward3OPLbl)
                                .addGap(0, 0, 0)
                                .addComponent(clipSize3OPLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resAmmo3OPLbl)))
                        .addGap(18, 18, 18)
                        .addComponent(cmprGunsBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(wepList1CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(type1OPLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(side1OPLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wepDmg1OPLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wepPrice1OPLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kAward1OPLbl)
                        .addGap(0, 0, 0)
                        .addComponent(clipSize1OPLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resAmmo1OPLbl)))
                .addContainerGap(16, Short.MAX_VALUE))
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
    private void wepList1CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wepList1CBActionPerformed
    }//GEN-LAST:event_wepList1CBActionPerformed
    private void wepList2CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wepList2CBActionPerformed
    }//GEN-LAST:event_wepList2CBActionPerformed
    private void wepList3CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wepList3CBActionPerformed
    }//GEN-LAST:event_wepList3CBActionPerformed
    private void wepList4CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wepList4CBActionPerformed
    }//GEN-LAST:event_wepList4CBActionPerformed

    /**
     * This button action performed method executes all required processes in
     * the program after the button is pressed, local variables are declared and
     * other methods are called.
     *
     * @param evt
     */
    private void cmprGunsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmprGunsBtnActionPerformed

        /* Create arrays for all possible outputs. All arrays have
         4 elements because they're going to be used in parallelism. */
        String[] type = new String[4], side = new String[4], wepSort = new String[4];
        //Assign each weapon slot variable the appropriate weapon by parsing the combo box object to a string.
        String wep1 = (wepList1CB.getSelectedItem()).toString(), wep2 = (wepList2CB.getSelectedItem()).toString(), wep3 = (wepList3CB.getSelectedItem()).toString(), wep4 = (wepList4CB.getSelectedItem()).toString();

        /* 4 separate method calls to display necessary information on all stat labels
        Parameters forwarded to method are correspondant weapon variables and the 3
        String type stat variables. */
        wep1Stats(wep1, ph, type, side);
        wep2Stats(wep2, ph, type, side);
        wep3Stats(wep3, ph, type, side);
        wep4Stats(wep4, ph, type, side);
    }//GEN-LAST:event_cmprGunsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(culminatingTest.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(culminatingTest.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(culminatingTest.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(culminatingTest.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new culminatingTest().setVisible(true);
            }
        });
    }

    /**
     * This method reads external files for the dedicated weapon selected by
     * user, then displays the stats on the appropriate labels, otherwise
     * displays an error prompting user to check for correct input of
     * information in the external file.
     *
     * @param wep1
     * @param ph
     * @param type
     * @param side
     */
    public void wep1Stats(String wep1, String ph, String type[], String side[]) {
        //Usage of a try statement to avoid a program crash.
        try {
            //Initializes a filereader using the weapon name then file type (csp or CS program).
            FileReader firstWep = new FileReader(wep1 + ".csp");
            //Initializes buffered reader which reads the contents of the external file.
            BufferedReader buffer1 = new BufferedReader(firstWep);

            //Reads alternate lines by first using a placeholder then reading the line containing useful code.
            //String variables:
            ph = buffer1.readLine();
            type[0] = buffer1.readLine();
            ph = buffer1.readLine();
            side[0] = buffer1.readLine();

            //Integer variables:
            //Try statement allows program to continue running after external file was set up incorrectly.
            try {
                ph = buffer1.readLine();
                wpnDmg[0] = Integer.parseInt(buffer1.readLine());
                ph = buffer1.readLine();
                wpnPrice[0] = Integer.parseInt(buffer1.readLine());
                ph = buffer1.readLine();
                wpnKaward[0] = Integer.parseInt(buffer1.readLine());
                ph = buffer1.readLine();
                clipSize[0] = Integer.parseInt(buffer1.readLine());
                ph = buffer1.readLine();
                resAmmo[0] = Integer.parseInt(buffer1.readLine());
            } catch (NumberFormatException nfe) {
                System.err.println("There was an error reading the file for " + wep1 + ", please set it up correctly.");

                //Changes all stat labels to FNF or file not found.
                type1OPLbl.setText("FNF");
                side1OPLbl.setText("FNF");
                wepDmg1OPLbl.setText("FNF");
                wepPrice1OPLbl.setText("FNF");
                kAward1OPLbl.setText("FNF");
                clipSize1OPLbl.setText("FNF");
                resAmmo1OPLbl.setText("FNF");
            }
            //Closes and clears/flushes buffer 1
            buffer1.close();

            //Sets labels to appropriate description using variables that were initialized by external file above.
            type1OPLbl.setText(type[0]);
            side1OPLbl.setText(side[0]);
            wepDmg1OPLbl.setText("" + wpnDmg[0]);
            wepPrice1OPLbl.setText("$" + wpnPrice[0]);
            kAward1OPLbl.setText("$" + wpnKaward[0]);
            clipSize1OPLbl.setText("" + clipSize[0]);
            resAmmo1OPLbl.setText("" + resAmmo[0]);

            //Catches file reading exception, allowing for program to continue running when file isn't found.
        } catch (IOException e) {
            System.err.println("The file for the \"" + wep1 + "\" was not found.");

            type1OPLbl.setText("FNF");
            side1OPLbl.setText("FNF");
            wepDmg1OPLbl.setText("FNF");
            wepPrice1OPLbl.setText("FNF");
            kAward1OPLbl.setText("FNF");
            clipSize1OPLbl.setText("FNF");
            resAmmo1OPLbl.setText("FNF");
        }
        /* Sets damage sort variable to the damage variable previously set up,this allows
        program to sort damage in later methods without eliminating the parallelism of the arrays */
        dmgSort[0] = wpnDmg[0];
    }

    //Remaining 3 methods are duplicates of wep1Stats method therefore all comments apply here too.
    /**
     * This method reads external files for the dedicated weapon selected by
     * user, then displays the stats on the appropriate labels, otherwise
     * displays an error prompting user to check for correct input of
     * information in the external file.
     *
     * @param wep2
     * @param ph
     * @param type
     * @param side
     */
    public void wep2Stats(String wep2, String ph, String type[], String side[]) {
        try {
            FileReader secondWep = new FileReader(wep2 + ".csp");
            BufferedReader buffer2 = new BufferedReader(secondWep);

            ph = buffer2.readLine();
            type[1] = buffer2.readLine();
            ph = buffer2.readLine();
            side[1] = buffer2.readLine();

            try {
                ph = buffer2.readLine();
                wpnDmg[1] = Integer.parseInt(buffer2.readLine());
                ph = buffer2.readLine();
                wpnPrice[1] = Integer.parseInt(buffer2.readLine());
                ph = buffer2.readLine();
                wpnKaward[1] = Integer.parseInt(buffer2.readLine());
                ph = buffer2.readLine();
                clipSize[1] = Integer.parseInt(buffer2.readLine());
                ph = buffer2.readLine();
                resAmmo[1] = Integer.parseInt(buffer2.readLine());

                type2OPLbl.setText(type[1]);
                side2OPLbl.setText(side[1]);
                wepDmg2OPLbl.setText("" + wpnDmg[1]);
                wepPrice2OPLbl.setText("$" + wpnPrice[1]);
                kAward2OPLbl.setText("$" + wpnKaward[1]);
                clipSize2OPLbl.setText("" + clipSize[1]);
                resAmmo2OPLbl.setText("" + resAmmo[1]);

            } catch (NumberFormatException nfe) {
                System.err.println("There was an error reading the file for " + wep2 + ", please set it up correctly.");

                type4OPLbl.setText("FNF");
                side4OPLbl.setText("FNF");
                wepDmg4OPLbl.setText("FNF");
                wepPrice4OPLbl.setText("FNF");
                kAward4OPLbl.setText("FNF");
                clipSize4OPLbl.setText("FNF");
                resAmmo4OPLbl.setText("FNF");
            }
            buffer2.close();

        } catch (IOException e) {
            System.err.println("The file for the \"" + wep2 + "\" was not found.");

            type2OPLbl.setText("FNF");
            side2OPLbl.setText("FNF");
            wepDmg2OPLbl.setText("FNF");
            wepPrice2OPLbl.setText("FNF");
            kAward2OPLbl.setText("FNF");
            clipSize2OPLbl.setText("FNF");
            resAmmo2OPLbl.setText("FNF");
        }
        dmgSort[1] = wpnDmg[1];
    }

    /**
     * This method reads external files for the dedicated weapon selected by
     * user, then displays the stats on the appropriate labels, otherwise
     * displays an error prompting user to check for correct input of
     * information in the external file.
     *
     * @param wep3
     * @param ph
     * @param type
     * @param side
     */
    public void wep3Stats(String wep3, String ph, String type[], String side[]) {
        try {
            FileReader thirdWep = new FileReader(wep3 + ".csp");
            BufferedReader buffer3 = new BufferedReader(thirdWep);

            ph = buffer3.readLine();
            type[2] = buffer3.readLine();
            ph = buffer3.readLine();
            side[2] = buffer3.readLine();

            try {
                ph = buffer3.readLine();
                wpnDmg[2] = Integer.parseInt(buffer3.readLine());
                ph = buffer3.readLine();
                wpnPrice[2] = Integer.parseInt(buffer3.readLine());
                ph = buffer3.readLine();
                wpnKaward[2] = Integer.parseInt(buffer3.readLine());
                ph = buffer3.readLine();
                clipSize[2] = Integer.parseInt(buffer3.readLine());
                ph = buffer3.readLine();
                resAmmo[2] = Integer.parseInt(buffer3.readLine());

                type3OPLbl.setText(type[2]);
                side3OPLbl.setText(side[2]);
                wepDmg3OPLbl.setText("" + wpnDmg[2]);
                wepPrice3OPLbl.setText("$" + wpnPrice[2]);
                kAward3OPLbl.setText("$" + wpnKaward[2]);
                clipSize3OPLbl.setText("" + clipSize[2]);
                resAmmo3OPLbl.setText("" + resAmmo[2]);
            } catch (NumberFormatException nfe) {
                System.err.println("There was an error reading the file for " + wep3 + ", please set it up correctly.");

                type4OPLbl.setText("FNF");
                side4OPLbl.setText("FNF");
                wepDmg4OPLbl.setText("FNF");
                wepPrice4OPLbl.setText("FNF");
                kAward4OPLbl.setText("FNF");
                clipSize4OPLbl.setText("FNF");
                resAmmo4OPLbl.setText("FNF");
            }
            buffer3.close();

        } catch (IOException e) {
            System.err.println("The file for the \"" + wep3 + "\" was not found.");

            type3OPLbl.setText("FNF");
            side3OPLbl.setText("FNF");
            wepDmg3OPLbl.setText("FNF");
            wepPrice3OPLbl.setText("FNF");
            kAward3OPLbl.setText("FNF");
            clipSize3OPLbl.setText("FNF");
            resAmmo3OPLbl.setText("FNF");
        }
        dmgSort[2] = wpnDmg[2];
    }

    /**
     * This method reads external files for the dedicated weapon selected by
     * user, then displays the stats on the appropriate labels, otherwise
     * displays an error prompting user to check for correct input of
     * information in the external file.
     *
     * @param wep4
     * @param ph
     * @param type
     * @param side
     */
    public void wep4Stats(String wep4, String ph, String type[], String side[]) {
        try {
            FileReader fourthWep = new FileReader(wep4 + ".csp");
            BufferedReader buffer4 = new BufferedReader(fourthWep);

            ph = buffer4.readLine();
            type[3] = buffer4.readLine();
            ph = buffer4.readLine();
            side[3] = buffer4.readLine();

            try {
                ph = buffer4.readLine();
                wpnDmg[3] = Integer.parseInt(buffer4.readLine());
                ph = buffer4.readLine();
                wpnPrice[3] = Integer.parseInt(buffer4.readLine());
                ph = buffer4.readLine();
                wpnKaward[3] = Integer.parseInt(buffer4.readLine());
                ph = buffer4.readLine();
                clipSize[3] = Integer.parseInt(buffer4.readLine());
                ph = buffer4.readLine();
                resAmmo[3] = Integer.parseInt(buffer4.readLine());

                type4OPLbl.setText(type[3]);
                side4OPLbl.setText(side[3]);
                wepDmg4OPLbl.setText("" + wpnDmg[3]);
                wepPrice4OPLbl.setText("$" + wpnPrice[3]);
                kAward4OPLbl.setText("$" + wpnKaward[3]);
                clipSize4OPLbl.setText("" + clipSize[3]);
                resAmmo4OPLbl.setText("" + resAmmo[3]);
            } catch (NumberFormatException nfe) {
                System.err.println("There was an error reading the file for " + wep4 + ", please set it up correctly.");

                type4OPLbl.setText("FNF");
                side4OPLbl.setText("FNF");
                wepDmg4OPLbl.setText("FNF");
                wepPrice4OPLbl.setText("FNF");
                kAward4OPLbl.setText("FNF");
                clipSize4OPLbl.setText("FNF");
                resAmmo4OPLbl.setText("FNF");
            }

            buffer4.close();

        } catch (IOException e) {
            System.err.println("The file for the \"" + wep4 + "\" was not found.");

            type4OPLbl.setText("FNF");
            side4OPLbl.setText("FNF");
            wepDmg4OPLbl.setText("FNF");
            wepPrice4OPLbl.setText("FNF");
            kAward4OPLbl.setText("FNF");
            clipSize4OPLbl.setText("FNF");
            resAmmo4OPLbl.setText("FNF");
        }
        dmgSort[3] = wpnDmg[3];

        //On the final weapon stats method, the sort method is called, as all weapon damage variables have been initialized.
        sort(dmgSort);
    }

    /**
     * This bubble sort algorithm compares 2 adjacent elements in an array then
     * swaps them to sort them in ascending order. After sorting elements in
     * ascending order, it determines the weapon with the highest damage, and
     * marks it with *'s.
     *
     * @param stat
     */
    public void sort(int stat[]) {
        //Temporary variable allows for a tertiary element while swapping values during the bubble sort.
        int temp;

        //Primary for loop counts number of passes and ensures it only runs 1 less than the length of the array, avoiding unnecessary, excessive, and useless sorting.
        for (int numOfPasses = 1; numOfPasses < (stat.length); numOfPasses++) {
            //Nested loop declares i value, index of the array, which stops 2 before the length of the array, as that's the index of second last element that gets compared to last element.
            for (int i = 0; i <= (stat.length) - 2; i++) {
                //Checks if element with smaller index is larger than element with bigger index, then swaps them if the condition is true.
                if (stat[i] > stat[i + 1]) {
                    temp = stat[i + 1];
                    stat[i + 1] = stat[i];
                    stat[i] = temp;
                }
            }
        }

        /* A series of if statements that checks to see if the weapon damage on a certain weapon 1/2/3/4 is the same as the highest
        damage according to sort algorithm. This isn't an "if, else if" condition statement because multiple guns can have highest damage. */
        if (wpnDmg[0] == stat[stat.length - 1]) {
            wepDmg1OPLbl.setText("* " + wepDmg1OPLbl.getText() + " *");
            (wepDmg1OPLbl.getText()).charAt(0);
        }
        if (wpnDmg[1] == stat[stat.length - 1]) {
            wepDmg2OPLbl.setText("* " + wepDmg2OPLbl.getText() + " *");
        }
        if (wpnDmg[2] == stat[stat.length - 1]) {
            wepDmg3OPLbl.setText("* " + wepDmg3OPLbl.getText() + " *");
        }
        if (wpnDmg[3] == stat[stat.length - 1]) {
            wepDmg4OPLbl.setText("* " + wepDmg4OPLbl.getText() + " *");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clipSize1OPLbl;
    private javax.swing.JLabel clipSize2OPLbl;
    private javax.swing.JLabel clipSize3OPLbl;
    private javax.swing.JLabel clipSize4OPLbl;
    private javax.swing.JLabel clipSizeLbl;
    private javax.swing.JButton cmprGunsBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kAward1OPLbl;
    private javax.swing.JLabel kAward2OPLbl;
    private javax.swing.JLabel kAward3OPLbl;
    private javax.swing.JLabel kAward4OPLbl;
    private javax.swing.JLabel resAmmo1OPLbl;
    private javax.swing.JLabel resAmmo2OPLbl;
    private javax.swing.JLabel resAmmo3OPLbl;
    private javax.swing.JLabel resAmmo4OPLbl;
    private javax.swing.JLabel resAmmoLbl;
    private javax.swing.JLabel side1OPLbl;
    private javax.swing.JLabel side2OPLbl;
    private javax.swing.JLabel side3OPLbl;
    private javax.swing.JLabel side4OPLbl;
    private javax.swing.JLabel sideLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel type1OPLbl;
    private javax.swing.JLabel type2OPLbl;
    private javax.swing.JLabel type3OPLbl;
    private javax.swing.JLabel type4OPLbl;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JLabel wepDmg1OPLbl;
    private javax.swing.JLabel wepDmg2OPLbl;
    private javax.swing.JLabel wepDmg3OPLbl;
    private javax.swing.JLabel wepDmg4OPLbl;
    private javax.swing.JComboBox wepList1CB;
    private javax.swing.JComboBox wepList2CB;
    private javax.swing.JComboBox wepList3CB;
    private javax.swing.JComboBox wepList4CB;
    private javax.swing.JLabel wepPrice1OPLbl;
    private javax.swing.JLabel wepPrice2OPLbl;
    private javax.swing.JLabel wepPrice3OPLbl;
    private javax.swing.JLabel wepPrice4OPLbl;
    private javax.swing.JLabel wpnDmgLbl;
    private javax.swing.JLabel wpnKawardLbl;
    private javax.swing.JLabel wpnPriceLbl;
    // End of variables declaration//GEN-END:variables
}
