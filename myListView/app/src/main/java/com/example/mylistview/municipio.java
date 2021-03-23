package com.example.mylistview;

public class municipio {
    //Atributos
    private int nummpio;
    private String nombre;
    private String extension;
    private String poblacion;

    public municipio() {

    }

    public municipio(int nummpio, String nombre, String extension, String poblacion) {
        this.nummpio = nummpio;
        this.nombre = nombre;
        this.extension = extension;
        this.poblacion = poblacion;
    }

    public int getNummpio() {
        return nummpio;
    }

    public void setNummpio(int nummpio) {
        this.nummpio = nummpio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
}
