
package lab7p2_oliveriraheta;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class admArchivo {
    private ArrayList<Archivo> listaArchivos = new ArrayList();
    private File archivo = null;

    public admArchivo(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Archivo> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void agregarArchivo(Archivo archivo){
        this.listaArchivos.add(archivo);
    }
    
     public void cargarArchivo() {
        try {            
            listaArchivos = new ArrayList();
            Archivo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Archivo) objeto.readObject()) != null) {
                        listaArchivos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Archivo t : listaArchivos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (IOException ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
    }
}
