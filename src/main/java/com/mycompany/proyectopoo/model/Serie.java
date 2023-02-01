package com.mycompany.proyectopoo.model;

public class Serie extends Detalle{
    
    private int season;
    private int episode;

    public Serie() {
    }

    public Serie(Integer id, String title, String description, int duration, String categoria, String path, int season, int episode) {
        super(id, title, description, duration, categoria, path);
        this.season = season;
        this.episode = episode;
    }

    public String getSeason() {
        return "Temporadas: " + season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getEpisode() {
        return "Episodios: " + episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
    
}
