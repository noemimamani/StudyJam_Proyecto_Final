package com.miramicodigo.prueba_proyecto;

/**
 * Created by EQUIPO on 25/05/2017.
 */

public class Item {
    private String nro;
    private String fraternidad;
    private String hora;

    public Item(String nro, String fraternidad, String hora) {
        this.nro = nro;
        this.fraternidad = fraternidad;
        this.hora = hora;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getFraternidad() {
        return fraternidad;
    }

    public void setFraternidad(String fraternidad) {
        this.fraternidad = fraternidad;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
