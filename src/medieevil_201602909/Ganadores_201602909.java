/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medieevil_201602909;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static medieevil_201602909.Game_201602909.Vidasp1;
import static medieevil_201602909.Game_201602909.Vidasp2;
import static medieevil_201602909.Game_201602909.lp1;
import static medieevil_201602909.Game_201602909.lp2;
import static medieevil_201602909.Game_201602909.tiempo;

/**
 *
 * @author edgom
 */
public class Ganadores_201602909
{

    public void GuardarGanadores() {
        File archivo = new File("Ganadores.txt");
        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.write("Top Ganadores"+"\n");
            if((Vidasp1 == 0) && (Vidasp2 > Vidasp1))
            {
            pw.write("Nombre: "+lp2.getText()+" "+"Tiempo: "+Integer.toString(tiempo));
            }
            else if ((Vidasp2 == 0) && (Vidasp1 > Vidasp2))
            {
            pw.write("Nombre: "+lp1.getText()+" "+"Tiempo: "+Integer.toString(tiempo));
            }
            pw.close();
            bw.close();

        } catch (IOException e) {
        }
    }
}
