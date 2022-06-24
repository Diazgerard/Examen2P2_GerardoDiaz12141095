/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_gerardodiaz12141095;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class adminLetra {
    
    private ArrayList<Letra> listaLetra = new ArrayList();
    private File archivo = null;
    
    public adminLetra(String path) {
        archivo = new File(path);
    }

    public ArrayList<Letra> getListaLetra() {
        return listaLetra;
    }

    public void setListav(ArrayList<Letra> listaLetra) {
        this.listaLetra = listaLetra;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setLetra(Letra a){
        listaLetra.add(a);
    }
    
    
    public void cargarArchivo()  {
       Scanner sc = null;
        listaLetra = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaLetra.add(new Letra(
                                    sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Letra t : listaLetra) {
                bw.write(t.getLetra()+ ";");   
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
}
