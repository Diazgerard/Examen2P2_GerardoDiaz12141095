/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_gerardodiaz12141095;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class adminCancion {
    
    private ArrayList<Cancion> listaCancion = new ArrayList();
    private File archivo = null;
    
    public adminCancion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cancion> getListaCancion() {
        return listaCancion;
    }

    public void setListaCancion(ArrayList<Cancion> listaCancion) {
        this.listaCancion = listaCancion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAlumno(Cancion a){
        listaCancion.add(a);
    }
    
    
    public void cargarArchivo()  {
       Scanner sc = null;
        listaCancion = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaCancion.add(new Cancion(
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
            for (Cancion t : listaCancion) {
                bw.write(t.getCancion() + ";");   
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    
    
}
