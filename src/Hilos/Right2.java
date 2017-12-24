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
public class Right2  extends Thread {

    public int Cant = 0;
    public Tablero_201602909 tab = null;

    public Right2(int cant, Tablero_201602909 tab) {
        this.Cant = cant;
        this.tab = tab;
    }
    
    public void MoverR2(int cantidad) throws InterruptedException {
        if (cantidad <= 0) {
            return;
        }
        if (ComprobarPos()) {
            cantidad = 0;
            tab.matriz[tab.Tamaño - 1][tab.Tamaño - 1] = 0;
            tab.matrizlabel[tab.Tamaño - 1][tab.Tamaño - 1].setIcon(null);
            tab.posgx2 = 0;
            tab.matriz[tab.posgx2][tab.posgy2] = 2;
            tab.AgregarIconosTab();
        }
        tab.matrizlabel[tab.posgx2][tab.posgy2].setIcon(null);
        tab.matriz[tab.posgx2][tab.posgy2] = 0;
        tab.AgregarIconosTab();
        tab.posgx2 = tab.posgx2 + 1;
        tab.matriz[tab.posgx2][tab.posgy2] = 2;
        tab.AgregarIconosTab();
        cantidad--;
        Thread.sleep(100);
        MoverR2(cantidad);
    }

    public boolean ComprobarPos() {
        if ((tab.posgx2 >= tab.Tamaño - 1) && (tab.posgy2 >= tab.Tamaño - 1)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
    try {
        MoverR2(Cant);
    } catch (InterruptedException ex) {
        Logger.getLogger(Right1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
