/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import medieevil_201602909.Tablero_201602909;

/**
 *
 * @author edgom
 */
public class Right1 extends Thread {

    public int Cant = 0;
    public Tablero_201602909 tab = null;
    public int V;

    public Right1(int cant, Tablero_201602909 tab,int v) {
        this.Cant = cant;
        this.tab = tab;
        this.V=v;
    }
    
    public void MoverR(int cantidad) throws InterruptedException {
        if (cantidad <= 0) {
            return;
        }
        if (ComprobarPos()) {
            cantidad = 0;
            tab.matriz[tab.Tamaño - 1][(int)((tab.Tamaño)/2)] = 0;
            tab.matrizlabel[tab.Tamaño - 1][(int)((tab.Tamaño)/2)].setIcon(null);
            tab.posgy=(int)((tab.Tamaño+1)/2);
            tab.posgx =(int)((tab.Tamaño+1)/2);
            tab.matriz[tab.posgx][tab.posgy] = 1;
            tab.AgregarIconosTab();
        }
        tab.matrizlabel[tab.posgx][tab.posgy].setIcon(null);
        tab.matriz[tab.posgx][tab.posgy] = 0;
        tab.AgregarIconosTab();
        tab.posgx = tab.posgx + 1;
        tab.matriz[tab.posgx][tab.posgy] = 1;
        if ((tab.matriz[tab.posgx][tab.posgy] == 1) || (tab.matriz[tab.posgx][tab.posgy] == 3)) {
            tab.matrizlabel[tab.posgx][tab.posgy].setIcon(null);
            tab.matriz[tab.posgx][tab.posgy] = 1;
            V = V + 1;
        } else if ((tab.matriz[tab.posgx][tab.posgy] == 1) || (tab.matriz[tab.posgx][tab.posgy] == 4)) {
            tab.matrizlabel[tab.posgx][tab.posgy].setIcon(null);
            tab.matriz[tab.posgx][tab.posgy] = 1;
            V = V - 1;
        }
        tab.AgregarIconosTab();
        cantidad--;
        Thread.sleep(250);
        MoverR(cantidad);
    }

    public boolean ComprobarPos() {
        if (tab.posgx >= tab.Tamaño - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
    try {
        MoverR(Cant);
    } catch (InterruptedException ex) {
        Logger.getLogger(Right1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
