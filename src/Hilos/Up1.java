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
public class Up1 extends Thread {

    public int Cant = 0;
    public Tablero_201602909 tab = null;
    public int V;

    public Up1(int cant, Tablero_201602909 tab,int v) {
        this.Cant = cant;
        this.tab = tab;
        this.V=v;
    }

    public void MoverUp(int cantidad) throws InterruptedException {
        if (cantidad <= 0) {
            return;
        }
        if (ComprobarPos()) {
            cantidad = 0;
            tab.matriz[tab.Tamaño - 1][tab.Tamaño - 1] = 0;
            tab.matrizlabel[tab.Tamaño - 1][tab.Tamaño - 1].setIcon(null);
            tab.posgy=(int)((tab.Tamaño)/2);
            tab.posgx =(int)((tab.Tamaño)/2);
            tab.matriz[tab.posgx][tab.posgy] = 1;
            tab.AgregarIconosTab();
        }
        tab.matrizlabel[tab.posgx][tab.posgy].setIcon(null);
        tab.matriz[tab.posgx][tab.posgy] = 0;
        tab.AgregarIconosTab();
        tab.posgy = tab.posgy - 1;
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
        MoverUp(cantidad);
    }

    public boolean ComprobarPos() {
        if (tab.posgy<=0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        try {
            MoverUp(Cant);
        } catch (InterruptedException ex) {
            Logger.getLogger(Up1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
