/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.VFPK.Visao;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author ageuv
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCore = new javax.swing.JPanel();
        jPanelGuia = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelLateral = new javax.swing.JPanel();
        jPanelRelatorios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelVeiculos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelGastos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelGrafico = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon("./src/com/VFPK/icones/131226-abstract-dark-blue-polygon-pattern-background.jpg");
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanelCore.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGuia.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGuia.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelGuiaMouseDragged(evt);
            }
        });
        jPanelGuia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelGuiaMousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/CtrlCar_Logo.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Sistema de controle de Gastos");

        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/icons8_minus_20px.png"))); // NOI18N
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/icons8_multiply_20px.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanelGuiaLayout = new javax.swing.GroupLayout(jPanelGuia);
        jPanelGuia.setLayout(jPanelGuiaLayout);
        jPanelGuiaLayout.setHorizontalGroup(
            jPanelGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230)
                .addComponent(jLabelMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose))
        );
        jPanelGuiaLayout.setVerticalGroup(
            jPanelGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuiaLayout.createSequentialGroup()
                .addGroup(jPanelGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuiaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelMinimize))
                    .addComponent(jLabelClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelGuiaLayout.createSequentialGroup()
                        .addGroup(jPanelGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGuiaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelGuiaLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanelGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelCore.add(jPanelGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 25));

        jPanelLateral.setBackground(new java.awt.Color(0, 0, 51));
        jPanelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRelatorios.setBackground(new java.awt.Color(0, 0, 51));
        jPanelRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRelatoriosMouseExited(evt);
            }
        });
        jPanelRelatorios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/icons8_notepad_35px.png"))); // NOI18N
        jPanelRelatorios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Relatório");
        jPanelRelatorios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanelLateral.add(jPanelRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, -1));

        jPanelVeiculos.setBackground(new java.awt.Color(0, 0, 51));
        jPanelVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelVeiculosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVeiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelVeiculosMouseExited(evt);
            }
        });
        jPanelVeiculos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/icons8_car_35px.png"))); // NOI18N
        jPanelVeiculos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Veículos");
        jPanelVeiculos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanelLateral.add(jPanelVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, -1));

        jPanelGastos.setBackground(new java.awt.Color(0, 0, 51));
        jPanelGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelGastosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelGastosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelGastosMouseExited(evt);
            }
        });
        jPanelGastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/icons8_money_bag_35px.png"))); // NOI18N
        jPanelGastos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gastos");
        jPanelGastos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanelLateral.add(jPanelGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CtrlCar");
        jPanelLateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 110, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 210, -1));

        jPanelGrafico.setBackground(new java.awt.Color(0, 0, 51));
        jPanelGrafico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelGraficoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelGraficoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelGraficoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelGraficoMousePressed(evt);
            }
        });
        jPanelGrafico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/icons8_bar_chart_35px.png"))); // NOI18N
        jPanelGrafico.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gráfico");
        jPanelGrafico.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanelLateral.add(jPanelGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/VFPK/icones/CtrlCar_Logo40px.png"))); // NOI18N
        jPanelLateral.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanelCore.add(jPanelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, 520));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        jPanelCore.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 25, 770, 515));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx,xy,z = 0;
    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked
        
      
    private void jPanelGuiaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuiaMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanelGuiaMouseDragged

    private void jPanelGuiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGuiaMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanelGuiaMousePressed

    private void jPanelVeiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVeiculosMouseEntered
        // TODO add your handling code here:
        jPanelVeiculos.setBackground(Color.decode("#4169E1"));
    }//GEN-LAST:event_jPanelVeiculosMouseEntered

    private void jPanelVeiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVeiculosMouseExited
        // TODO add your handling code here:
        jPanelVeiculos.setBackground(Color.decode("#000033"));
    }//GEN-LAST:event_jPanelVeiculosMouseExited

    private void jPanelGastosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGastosMouseEntered
        // TODO add your handling code here:
        jPanelGastos.setBackground(Color.decode("#4169E1"));
    }//GEN-LAST:event_jPanelGastosMouseEntered

    private void jPanelGastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGastosMouseExited
        // TODO add your handling code here:
        jPanelGastos.setBackground(Color.decode("#000033"));
    }//GEN-LAST:event_jPanelGastosMouseExited

    private void jPanelGraficoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGraficoMouseEntered
        // TODO add your handling code here:
        jPanelGrafico.setBackground(Color.decode("#4169E1"));
    }//GEN-LAST:event_jPanelGraficoMouseEntered

    private void jPanelGraficoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGraficoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelGraficoMousePressed

    private void jPanelGraficoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGraficoMouseExited
        // TODO add your handling code here:
        jPanelGrafico.setBackground(Color.decode("#000033"));
    }//GEN-LAST:event_jPanelGraficoMouseExited

    private void jPanelRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelatoriosMouseEntered
        // TODO add your handling code here:
        jPanelRelatorios.setBackground(Color.decode("#4169E1"));
    }//GEN-LAST:event_jPanelRelatoriosMouseEntered

    private void jPanelRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelatoriosMouseExited
        // TODO add your handling code here:
        jPanelRelatorios.setBackground(Color.decode("#000033"));
    }//GEN-LAST:event_jPanelRelatoriosMouseExited

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("./src/com/VFPK/icones/icons8_multiply_20px_select.png");
        jLabelClose.setIcon(icon);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("./src/com/VFPK/icones/icons8_multiply_20px.png");
        jLabelClose.setIcon(icon);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("./src/com/VFPK/icones/icons8_minus_20px_select.png");
        jLabelMinimize.setIcon(icon);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("./src/com/VFPK/icones/icons8_minus_20px.png");
        jLabelMinimize.setIcon(icon);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jPanelVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVeiculosMouseClicked
        try {
            TelaVeiculo abrirVeiculo = new TelaVeiculo();
            TelaGastos abrirGastos = new TelaGastos();
            TelaGrafico abrirGrafico = new TelaGrafico();
            TelaRelatorios abrirRelatorio = new TelaRelatorios();
            jDesktopPane1.add(abrirVeiculo);
            abrirGastos.dispose();
            abrirRelatorio.dispose();
            abrirGrafico.dispose();
            abrirVeiculo.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelVeiculosMouseClicked

    private void jPanelGraficoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGraficoMouseClicked
        // TODO add your handling code here:
        try {
            TelaVeiculo abrirVeiculo = new TelaVeiculo();
            TelaGastos abrirGastos = new TelaGastos();
            TelaRelatorios abrirRelatorio = new TelaRelatorios();
            TelaGrafico abrirGrafico = new TelaGrafico();
            jDesktopPane1.add(abrirGrafico);
            abrirGrafico.setVisible(true);
            abrirGastos.dispose();
            abrirRelatorio.dispose();
            abrirVeiculo.dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelGraficoMouseClicked

    private void jPanelGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelGastosMouseClicked
        // TODO add your handling code here:
        try {
            TelaVeiculo abrirVeiculo = new TelaVeiculo();
            TelaGastos abrirGastos = new TelaGastos();
            TelaRelatorios abrirRelatorio = new TelaRelatorios();
            TelaGrafico abrirGrafico = new TelaGrafico();
            jDesktopPane1.add(abrirGastos);
            abrirVeiculo.dispose();
            abrirRelatorio.dispose();
            abrirGrafico.dispose();
            abrirGastos.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelGastosMouseClicked

    private void jPanelRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRelatoriosMouseClicked
        // TODO add your handling code here:
        try {
            TelaVeiculo abrirVeiculo = new TelaVeiculo();
            TelaGastos abrirGastos = new TelaGastos();
            TelaRelatorios abrirRelatorios = new TelaRelatorios();
            TelaGrafico abrirGrafico = new TelaGrafico();
            jDesktopPane1.add(abrirRelatorios);
            abrirRelatorios.setVisible(true);
            abrirGastos.dispose();
            abrirGrafico.dispose();
            abrirVeiculo.dispose();
        
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jPanelRelatoriosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCore;
    private javax.swing.JPanel jPanelGastos;
    private javax.swing.JPanel jPanelGrafico;
    private javax.swing.JPanel jPanelGuia;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JPanel jPanelRelatorios;
    private javax.swing.JPanel jPanelVeiculos;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    }
