/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo.model;

/**
 *
 * @author davidrmo
 */
public abstract class Detalle {
    
    private Integer id;
    private String title;
    private String description;
    private int duration;
    private String categoria;
    private String path;

    public Detalle() {
    }

    public Detalle(Integer id, String title, String description, int duration, String categoria, String path) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.categoria = categoria;
        this.path = path;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration + " min";
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPath() {
        return path;
    }
    
}
