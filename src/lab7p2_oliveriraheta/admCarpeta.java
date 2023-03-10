
package lab7p2_oliveriraheta;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admCarpeta {
    
    private ArrayList<Carpeta> listaCarpeta = new ArrayList();
    private File archivo = null;

    public admCarpeta(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Carpeta> getListaCarpeta() {
        return listaCarpeta;
    }

    public void setListaCarpeta(ArrayList<Carpeta> listaCarpeta) {
        this.listaCarpeta = listaCarpeta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void agregarCarpeta(Carpeta carpeta){
        this.listaCarpeta.add(carpeta);
    }
    
    public void cargarArchivo() {
        try {            
            listaCarpeta = new ArrayList();
            Carpeta temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carpeta) objeto.readObject()) != null) {
                        listaCarpeta.add(temp);
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
            for (Carpeta t : listaCarpeta) {
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
