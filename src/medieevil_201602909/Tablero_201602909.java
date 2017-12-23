/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medieevil_201602909;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author edgom
 */
public class Tablero_201602909 
{
public int Tamaño=0, posgx1=0, posgy1=0, posgx2=0, posgy2=0,TamCasilla=0;
public ImageIcon guerrero1,guerrero2,mago1,mago2,princesa1,princesa2,corazon,bomba;
public Image G1,G2,M1,M2,P1,P2,C,B;
public ImageIcon Guerrero1,Guerrero2,Mago1,Mago2,Princesa1,Princesa2,Corazon,Bomba;

public JPanel fondo = null;
public int[][] matriz;
public JLabel[][] matrizlabel;
public JLabel Casilla;
public JLabel Player1;
public JLabel Player2;

     public Tablero_201602909(int dimension,JPanel tab)
     {
     this.Tamaño=dimension;
     this.fondo=tab;
     IniciarTablero(dimension);
     }    
     
     public void IniciarTablero(int dimension)
     {
     TamCasilla=500/dimension;  
     matriz = new int[dimension][dimension]; 
     matrizlabel = new JLabel[dimension][dimension];
     
     matriz[0][dimension-1]=1;
     matriz[dimension-1][0]=2;
     VidasAleatorias(dimension);
     BombasAleatorias(dimension);
     
        for (int i = 10; i < dimension; i++) {
            for (int j = 10; j < dimension; j++) {
            matriz[i][j]=0;
            }
        }
        AgregarIconos();
        AgregarIconosTab(dimension);
    }

    public void AgregarIconos() {
        guerrero1 = new ImageIcon(getClass().getResource("/imagenes/guerrero1.png"));
        guerrero2 = new ImageIcon(getClass().getResource("/imagenes/guerrero2.png"));
        mago1 = new ImageIcon(getClass().getResource("/imagenes/mago1.png"));
        mago2 = new ImageIcon(getClass().getResource("/imagenes/mago2.png"));
        princesa1 = new ImageIcon(getClass().getResource("/imagenes/princesa1.png"));
        princesa2 = new ImageIcon(getClass().getResource("/imagenes/princesa2.png"));
        corazon = new ImageIcon(getClass().getResource("/imagenes/corazon.png"));
        bomba = new ImageIcon(getClass().getResource("/imagenes/bomba.png"));
        G1 = guerrero1.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        G2 = guerrero2.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        M1 = mago1.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        M2 = mago2.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        P1 = princesa1.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        P2 = princesa2.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        C = corazon.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        B = bomba.getImage().getScaledInstance(TamCasilla, TamCasilla, Image.SCALE_DEFAULT);
        Guerrero1 = new ImageIcon(G1);
        Guerrero2 = new ImageIcon(G2);
        Mago1 = new ImageIcon(M1);
        Mago2 = new ImageIcon(M2);
        Princesa1 = new ImageIcon(P1);
        Princesa2 = new ImageIcon(P2);
        Corazon = new ImageIcon(C);
        Bomba = new ImageIcon(B); 
    }
    
    public void VidasAleatorias(int dimension) {
        double kokoro = (0.05) *(dimension*dimension);
        int corazones = (int) kokoro;

        for (int i = 0; i <= corazones; i++) {
            int f = (int) (Math.random() * dimension);
            int c = (int) (Math.random() * dimension);
            matriz[f][c] = 3;
        }
    }

    public void BombasAleatorias(int dimension) {
        double bomb = (0.1)*(dimension*dimension);
        int bombas = (int) bomb;

        for (int i = 0; i <= bombas; i++) {
            int f = (int) (Math.random()*dimension);
            int c = (int) (Math.random()*dimension);
            matriz[f][c] = 4;
        }
    }

    public void AgregarIconosTab(int dimension) {
        TamCasilla = 500 / dimension;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                switch (matriz[i][j]) {
                    case 0:
                        Casilla = new JLabel();
                        Casilla.setOpaque(false);
                        Casilla.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                        Casilla.setBounds(i * TamCasilla, j * TamCasilla, TamCasilla, TamCasilla);
                        matrizlabel[i][j] = Casilla;
                        fondo.add(matrizlabel[i][j], BorderLayout.CENTER);
                        fondo.repaint();
                        break;
                    case 1:
                        Player1 = new JLabel(Guerrero1);
                        Player1.setOpaque(false);
                        Player1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                        Player1.setBounds(i * TamCasilla, j * TamCasilla, TamCasilla, TamCasilla);
                        matrizlabel[i][j] = Player1;
                        fondo.add(matrizlabel[i][j], BorderLayout.CENTER);
                        fondo.repaint();
                        break;
                    case 2:
                        Player2 = new JLabel(Guerrero2);
                        Player2.setOpaque(false);
                        Player2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                        Player2.setBounds(i * TamCasilla, j * TamCasilla, TamCasilla, TamCasilla);
                        matrizlabel[i][j] = Player2;
                        fondo.add(matrizlabel[i][j], BorderLayout.CENTER);
                        fondo.repaint();
                        break;
                    case 3:
                         Casilla = new JLabel(Corazon);
                        Casilla.setOpaque(false);
                        Casilla.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                        Casilla.setBounds(i * TamCasilla, j * TamCasilla, TamCasilla, TamCasilla);
                        matrizlabel[i][j] = Casilla;
                        fondo.add(matrizlabel[i][j], BorderLayout.CENTER);
                        fondo.repaint();
                        break;
                    case 4:
                         Casilla = new JLabel(Bomba);
                        Casilla.setOpaque(false);
                        Casilla.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                        Casilla.setBounds(i * TamCasilla, j * TamCasilla, TamCasilla, TamCasilla);
                        matrizlabel[i][j] = Casilla;
                        fondo.add(matrizlabel[i][j], BorderLayout.CENTER);
                        fondo.repaint();
                        break;
                }
            }
        }
    }
}
