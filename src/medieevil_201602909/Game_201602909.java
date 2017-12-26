/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medieevil_201602909;

import Hilos.Up1;
import Hilos.Right1;
import Hilos.Down1;
import Hilos.Down2;
import Hilos.Left1;
import Hilos.Left2;
import Hilos.Right2;
import Hilos.Up2;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static medieevil_201602909.Composicion_201602909.Dimension;
import static medieevil_201602909.MedieEvil_201602909.Player1;
import static medieevil_201602909.MedieEvil_201602909.Player2;

/**
 *
 * @author edgom
 */
public class Game_201602909 extends javax.swing.JFrame {

   ImageIcon d1, d2, d3, d4, d5, d6,up,down,left,right;
   Icon N,D1,D2,D3,D4,D5,D6,UP,DOWN,LEFT,RIGHT; 
   public int NoDado;
   public static int Vidasp1=5;
   public static int Vidasp2=5;
   public static int Turno=0;
   ImageIcon v8,v7,v6,v5,v4,v3,v2,v1,v0;
   Icon V8,V7,V6,V5,V4,V3,V2,V1,V0;
   public static int tiempo=50;
   
   
   public Tablero_201602909 tab;
    
    public Game_201602909() {
        initComponents();
        this.setLocationRelativeTo(null);
        lp1.setText(Player1);
        lp2.setText(Player2);
        AgregarFlechas();
        this.repaint();
    }    
    public void AgregarFlechas()
    {
    up = new ImageIcon(getClass().getResource("/imagenes/up.png"));
    down = new ImageIcon(getClass().getResource("/imagenes/down.png"));
    left = new ImageIcon(getClass().getResource("/imagenes/left.png"));
    right = new ImageIcon(getClass().getResource("/imagenes/right.png"));
    UP = new ImageIcon(up.getImage().getScaledInstance(75, 30, Image.SCALE_DEFAULT));
    DOWN = new ImageIcon(down.getImage().getScaledInstance(75, 30, Image.SCALE_DEFAULT));
    LEFT = new ImageIcon(left.getImage().getScaledInstance(75, 30, Image.SCALE_DEFAULT));
    RIGHT = new ImageIcon(right.getImage().getScaledInstance(75, 30, Image.SCALE_DEFAULT));
    btnup.setIcon(UP);
    btndown.setIcon(DOWN);
    btnleft.setIcon(LEFT);
    btnright.setIcon(RIGHT);
    bntup2.setIcon(UP);
    btndown2.setIcon(DOWN);
    btnleft2.setIcon(LEFT);
    btnright2.setIcon(RIGHT);
    tab = new Tablero_201602909(Dimension,pj);
    }
    
    public void AgregarVidasP1()
    {
    v8 = new ImageIcon(getClass().getResource("/imagenes/8vidas.png"));
    v7 = new ImageIcon(getClass().getResource("/imagenes/7vidas.png"));
    v6 = new ImageIcon(getClass().getResource("/imagenes/6vidas.png"));
    v5 = new ImageIcon(getClass().getResource("/imagenes/5vidas.png"));
    v4 = new ImageIcon(getClass().getResource("/imagenes/4vidas.png"));
    v3 = new ImageIcon(getClass().getResource("/imagenes/3vidas.png"));
    v2 = new ImageIcon(getClass().getResource("/imagenes/2vidas.png"));
    v1 = new ImageIcon(getClass().getResource("/imagenes/1vidas.png"));
    v0 = new ImageIcon(getClass().getResource("/imagenes/0vidas.png"));
    V8 = new ImageIcon(v8.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V7 = new ImageIcon(v7.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V6 = new ImageIcon(v6.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V5 = new ImageIcon(v5.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V4 = new ImageIcon(v4.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V3 = new ImageIcon(v3.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V2 = new ImageIcon(v2.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V1 = new ImageIcon(v1.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V0 = new ImageIcon(v0.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    
    switch(Vidasp1)
    {
        case 8:
            lvidasp1.setIcon(V8);
        break;
        case 7:
            lvidasp1.setIcon(V7);
        break;
        case 6:
            lvidasp1.setIcon(V6);
        break;
        case 5:
            lvidasp1.setIcon(V5);
        break;
        case 4:
            lvidasp1.setIcon(V4);
        break;
        case 3:
            lvidasp1.setIcon(V3);
        break;
        case 2:
            lvidasp1.setIcon(V2);
        break;
        case 1:
            lvidasp1.setIcon(V1);
        break;
        case 0:
            lvidasp1.setIcon(V0);
        break;
    }
    }
    
    public void AgregarVidasP2()
    {
    v8 = new ImageIcon(getClass().getResource("/imagenes/8vidas.png"));
    v7 = new ImageIcon(getClass().getResource("/imagenes/7vidas.png"));
    v6 = new ImageIcon(getClass().getResource("/imagenes/6vidas.png"));
    v5 = new ImageIcon(getClass().getResource("/imagenes/5vidas.png"));
    v4 = new ImageIcon(getClass().getResource("/imagenes/4vidas.png"));
    v3 = new ImageIcon(getClass().getResource("/imagenes/3vidas.png"));
    v2 = new ImageIcon(getClass().getResource("/imagenes/2vidas.png"));
    v1 = new ImageIcon(getClass().getResource("/imagenes/1vidas.png"));
    v0 = new ImageIcon(getClass().getResource("/imagenes/0vidas.png"));
    V8 = new ImageIcon(v8.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V7 = new ImageIcon(v7.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V6 = new ImageIcon(v6.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V5 = new ImageIcon(v5.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V4 = new ImageIcon(v4.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V3 = new ImageIcon(v3.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V2 = new ImageIcon(v2.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V1 = new ImageIcon(v1.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    V0 = new ImageIcon(v0.getImage().getScaledInstance(160, 60, Image.SCALE_DEFAULT));
    
    switch(Vidasp2)
    {
        case 8:
            lvidasp2.setIcon(V8);
        break;
        case 7:
            lvidasp2.setIcon(V7);
        break;
        case 6:
            lvidasp2.setIcon(V6);
        break;
        case 5:
            lvidasp2.setIcon(V5);
        break;
        case 4:
            lvidasp2.setIcon(V4);
        break;
        case 3:
            lvidasp2.setIcon(V3);
        break;
        case 2:
            lvidasp2.setIcon(V2);
        break;
        case 1:
            lvidasp2.setIcon(V1);
        break;
        case 0:
            lvidasp2.setIcon(V0);
        break;
    }
    }
   
    public void GameOver() {

        ltiempo.setText(Integer.toString(tiempo));
        tiempo--;
        if ((tiempo == 0) && (Vidasp1 == Vidasp2)) {
            JOptionPane.showMessageDialog(null, "Juego Empatado", "Empate!!!", INFORMATION_MESSAGE);
            GuardarGanadores();
            this.setVisible(false);
        } else if (((Vidasp1 == 0) && (Vidasp2 > Vidasp1)) || ((tiempo == 0) && (Vidasp2 > Vidasp1))) {
            JOptionPane.showMessageDialog(null, "El Jugador2 " + lp2.getText() + " ha ganado", "Ganaste!!!", INFORMATION_MESSAGE);
            GuardarGanadores();
            this.setVisible(false);
        } else if ((Vidasp2 == 0) && (Vidasp1 > Vidasp2) || ((tiempo == 0) && (Vidasp1 > Vidasp2))) {
            JOptionPane.showMessageDialog(null, "El Jugador1 " + lp1.getText() + " ha ganado", "Ganaste!!!", INFORMATION_MESSAGE);
            GuardarGanadores();
            this.setVisible(false);
        }
    }
    public void GuardarGanadores() {
        File archivo = new File("Ganadores.txt");
        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.write("Top Ganadores"+"\n");
            if((Vidasp1 == 0) && (Vidasp2 > Vidasp1))
            {
            pw.write("Nombre: "+lp2.getText()+" "+"Tiempo: "+Integer.toString(tiempo)+"   \n");
            }
            else if ((Vidasp2 == 0) && (Vidasp1 > Vidasp2))
            {
            pw.write("Nombre: "+lp1.getText()+" "+"Tiempo: "+Integer.toString(tiempo)+"   \n");
            }
            else if (tiempo==0)
            {
            pw.write("Nombre: "+lp1.getText()+" "+"Tiempo: "+Integer.toString(tiempo)+"   \n");
            pw.write("Nombre: "+lp2.getText()+" "+"Tiempo: "+Integer.toString(tiempo)+"   \n");
            }
            pw.close();
            bw.close();

        } catch (IOException e) {
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

        pj = new javax.swing.JPanel();
        btnup = new javax.swing.JButton();
        btnleft = new javax.swing.JButton();
        btndown = new javax.swing.JButton();
        btnright = new javax.swing.JButton();
        lp1 = new javax.swing.JLabel();
        lp2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bntup2 = new javax.swing.JButton();
        btndown2 = new javax.swing.JButton();
        btnleft2 = new javax.swing.JButton();
        btnright2 = new javax.swing.JButton();
        btndado = new javax.swing.JButton();
        lvidasp1 = new javax.swing.JLabel();
        lvidasp2 = new javax.swing.JLabel();
        ltiempo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("MedieEvil");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout pjLayout = new javax.swing.GroupLayout(pj);
        pj.setLayout(pjLayout);
        pjLayout.setHorizontalGroup(
            pjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pjLayout.setVerticalGroup(
            pjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(pj);
        pj.setBounds(30, 20, 500, 500);

        btnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupActionPerformed(evt);
            }
        });
        getContentPane().add(btnup);
        btnup.setBounds(570, 120, 75, 30);

        btnleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleftActionPerformed(evt);
            }
        });
        getContentPane().add(btnleft);
        btnleft.setBounds(570, 170, 75, 30);

        btndown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndownActionPerformed(evt);
            }
        });
        getContentPane().add(btndown);
        btndown.setBounds(660, 120, 75, 30);

        btnright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrightActionPerformed(evt);
            }
        });
        getContentPane().add(btnright);
        btnright.setBounds(660, 170, 75, 30);

        lp1.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lp1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lp1);
        lp1.setBounds(680, 10, 100, 30);

        lp2.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lp2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lp2);
        lp2.setBounds(680, 330, 100, 30);

        jLabel3.setFont(new java.awt.Font("Colonna MT", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno de:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 20, 100, 20);

        jLabel4.setFont(new java.awt.Font("Colonna MT", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Turno de:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 340, 90, 22);

        bntup2.setPreferredSize(new java.awt.Dimension(75, 30));
        bntup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntup2ActionPerformed(evt);
            }
        });
        getContentPane().add(bntup2);
        bntup2.setBounds(570, 440, 75, 30);

        btndown2.setPreferredSize(new java.awt.Dimension(75, 30));
        btndown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndown2ActionPerformed(evt);
            }
        });
        getContentPane().add(btndown2);
        btndown2.setBounds(660, 440, 75, 30);

        btnleft2.setPreferredSize(new java.awt.Dimension(75, 30));
        btnleft2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleft2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnleft2);
        btnleft2.setBounds(570, 490, 75, 30);

        btnright2.setPreferredSize(new java.awt.Dimension(75, 30));
        btnright2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnright2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnright2);
        btnright2.setBounds(660, 490, 75, 30);

        btndado.setPreferredSize(new java.awt.Dimension(100, 100));
        btndado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndadoActionPerformed(evt);
            }
        });
        getContentPane().add(btndado);
        btndado.setBounds(560, 230, 100, 100);
        getContentPane().add(lvidasp1);
        lvidasp1.setBounds(570, 50, 160, 60);
        getContentPane().add(lvidasp2);
        lvidasp2.setBounds(570, 370, 160, 60);

        ltiempo.setFont(new java.awt.Font("Colonna MT", 1, 22)); // NOI18N
        ltiempo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ltiempo);
        ltiempo.setBounds(680, 280, 100, 50);

        jLabel2.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiempo: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 240, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campo_de_batalla_naruto_shippuden_by_lwisf3rxd-d62dfla.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndadoActionPerformed
        int no = (int) (Math.random() * 6) + 1;
        d1 = new ImageIcon(getClass().getResource("/imagenes/d1.png"));
        d2 = new ImageIcon(getClass().getResource("/imagenes/d2.png"));
        d3 = new ImageIcon(getClass().getResource("/imagenes/d3.png"));
        d4 = new ImageIcon(getClass().getResource("/imagenes/d4.png"));
        d5 = new ImageIcon(getClass().getResource("/imagenes/d5.png"));
        d6 = new ImageIcon(getClass().getResource("/imagenes/d6.png"));
        D1 = new ImageIcon(d1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        D2 = new ImageIcon(d2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        D3 = new ImageIcon(d3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        D4 = new ImageIcon(d4.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        D5 = new ImageIcon(d5.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        D6 = new ImageIcon(d6.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        switch (no) {
            case 1:
                btndado.setIcon(D1);
                NoDado = no;
                break;
            case 2:
                btndado.setIcon(D2);
                NoDado = no;
                break;
            case 3:
                btndado.setIcon(D3);
                NoDado = no;
                break;
            case 4:
                btndado.setIcon(D4);
                NoDado = no;
                break;
            case 5:
                btndado.setIcon(D5);
                NoDado = no;
                break;
            case 6:
                btndado.setIcon(D6);
                NoDado = no;
                break;
        }
    this.AgregarVidasP1();
    this.AgregarVidasP2();
    this.GameOver();
    }//GEN-LAST:event_btndadoActionPerformed

    private void btnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupActionPerformed
        if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
        Up1 u1 = new Up1(NoDado, tab,Vidasp1);
        u1.start();
    }//GEN-LAST:event_btnupActionPerformed

    private void btndownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndownActionPerformed
        if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
        Down1 dn1 = new Down1(NoDado, tab,Vidasp1);
        dn1.start();
    }//GEN-LAST:event_btndownActionPerformed

    private void btnleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleftActionPerformed
        if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
         Left1 l1 = new Left1(NoDado, tab,Vidasp1);
         l1.start();
    }//GEN-LAST:event_btnleftActionPerformed

    private void btnrightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrightActionPerformed
        if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
        Right1 r1 = new Right1(NoDado, tab,Vidasp1);
        r1.start();
    }//GEN-LAST:event_btnrightActionPerformed

    private void bntup2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntup2ActionPerformed
         if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
        Up2 u2 = new Up2(NoDado, tab,Vidasp2);
        u2.start();
    }//GEN-LAST:event_bntup2ActionPerformed

    private void btndown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndown2ActionPerformed
         if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
        Down2 dn2 = new Down2(NoDado, tab,Vidasp2);
        dn2.start();
    }//GEN-LAST:event_btndown2ActionPerformed

    private void btnleft2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleft2ActionPerformed
         if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
        Left2 l2 = new Left2(NoDado, tab,Vidasp2);
        l2.start();
    }//GEN-LAST:event_btnleft2ActionPerformed

    private void btnright2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnright2ActionPerformed
         if (Turno == 0) {
            lp1.setEnabled(true);
            lp2.setEnabled(false);
            Turno++;
        } else if (Turno == 1) {
            lp1.setEnabled(false);
            lp2.setEnabled(true);
            Turno = 0;
        }
        Right2 r2 = new Right2(NoDado, tab,Vidasp2);
        r2.start();
    }//GEN-LAST:event_btnright2ActionPerformed

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
            java.util.logging.Logger.getLogger(Game_201602909.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_201602909.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_201602909.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_201602909.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_201602909().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntup2;
    private javax.swing.JButton btndado;
    private javax.swing.JButton btndown;
    private javax.swing.JButton btndown2;
    private javax.swing.JButton btnleft;
    private javax.swing.JButton btnleft2;
    private javax.swing.JButton btnright;
    private javax.swing.JButton btnright2;
    private javax.swing.JButton btnup;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel lp1;
    public static javax.swing.JLabel lp2;
    private javax.swing.JLabel ltiempo;
    private javax.swing.JLabel lvidasp1;
    private javax.swing.JLabel lvidasp2;
    private javax.swing.JPanel pj;
    // End of variables declaration//GEN-END:variables
}
