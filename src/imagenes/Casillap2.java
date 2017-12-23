/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static medieevil_201602909.Composicion_201602909.altob;
import static medieevil_201602909.Composicion_201602909.anchob;
/**
 *
 * @author edgom
 */
public class Casillap2 extends JButton implements ActionListener {

    ImageIcon Gr, Mg, Pn;
    Icon Guerrero, Mago, Princesa;
    int valor;

    public Casillap2() {
        this.AgregarImagen();
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        valor++;
        valor %= 4;
        switch (valor) {
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(Guerrero);
                break;
            case 2:
                setIcon(Mago);
                break;
            case 3:
                setIcon(Princesa);
                break;
        }
    }

    public void AgregarImagen() {
        Gr = new ImageIcon(this.getClass().getResource("guerrero2.png"));
        Mg = new ImageIcon(this.getClass().getResource("mago2.png"));
        Pn = new ImageIcon(this.getClass().getResource("princesa2.png"));
        Guerrero = new ImageIcon(Gr.getImage().getScaledInstance(anchob,altob, Image.SCALE_DEFAULT));
        Mago = new ImageIcon(Mg.getImage().getScaledInstance(anchob,altob, Image.SCALE_DEFAULT));
        Princesa = new ImageIcon(Pn.getImage().getScaledInstance(anchob,altob, Image.SCALE_DEFAULT));
    }
}
