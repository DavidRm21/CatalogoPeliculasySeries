package com.mycompany.proyectopoo.model;

public class Pelicula extends Detalle{

    public Pelicula() {
    }

    public Pelicula(Integer id, String title, String description, int duration, String categoria, String path) {
        super(id, title, description, duration, categoria, path);
    }
}
