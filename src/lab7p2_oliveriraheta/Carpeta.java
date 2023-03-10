package lab7p2_oliveriraheta;

import java.io.Serializable;
import java.util.ArrayList;

public class Carpeta implements Serializable {

    private String name, link;
    private ArrayList<Archivo> listaArchivos = new ArrayList();
    private ArrayList<Carpeta> listaCarpetas = new ArrayList();

    public Carpeta() {
    }

    public Carpeta(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getListaArchivos() {
        return listaArchivos;
    }

    public void setListaArchivos(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    public ArrayList<Carpeta> getListaCarpetas() {
        return listaCarpetas;
    }

    public void setListaCarpetas(ArrayList<Carpeta> listaCarpetas) {
        this.listaCarpetas = listaCarpetas;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
