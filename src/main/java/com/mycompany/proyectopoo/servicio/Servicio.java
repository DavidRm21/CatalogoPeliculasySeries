package com.mycompany.proyectopoo.servicio;

import com.mycompany.proyectopoo.model.Pelicula;
import com.mycompany.proyectopoo.model.Serie;
import com.mycompany.proyectopoo.repositorio.Registros;


public class Servicio {
    
    private Registros repositorio = new Registros();

    public Servicio() {
    }
    

    public Registros getRepositorio() {
        return repositorio;
    }
    
    public void insertar( Pelicula inPelicula ){
        repositorio.setPeliculas(inPelicula);
    }
    
    public void insertar( Serie inSerie ){
        repositorio.setSeries(inSerie);
    }
    
    public void eliminarPelis( int pos ){
        repositorio.getPeliculas().remove(pos);
    }
    
    public void eliminarSerie( int pos ){
        repositorio.getSeries().remove(pos);
    }
    
    
    
}
