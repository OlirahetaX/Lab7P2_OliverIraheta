package lab7p2_oliveriraheta;

import java.io.Serializable;

public class Archivo implements Serializable{

    private String name, link,extension,lugar;
    private int tamanio;

    public Archivo(String name, String link, String extension, int tamanio,String lugar) {
        this.name = name;
        this.link = link;
        this.extension = extension;
        this.tamanio = tamanio;
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public Archivo() {
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
