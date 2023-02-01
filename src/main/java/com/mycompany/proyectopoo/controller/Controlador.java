package com.mycompany.proyectopoo.controller;

import com.mycompany.proyectopoo.model.Pelicula;
import com.mycompany.proyectopoo.model.Serie;
import com.mycompany.proyectopoo.repositorio.Registros;
import com.mycompany.proyectopoo.servicio.Servicio;
import com.mycompany.proyectopoo.visual.InterfazDos;
import com.mycompany.proyectopoo.visual.InterfazPrincipal;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Controlador implements ActionListener, ListSelectionListener{
    
    private InterfazPrincipal principalV = new InterfazPrincipal();
    private InterfazDos segundaV = new InterfazDos();
    private Servicio servicio = new Servicio();
    private Registros repositorio = servicio.getRepositorio();
    private ArrayList<Pelicula> listaPeliculas;
    private ArrayList<Serie> listaSeries;
    
    public Controlador(){
        listaSeries = repositorio.getSeries();
        listaPeliculas = repositorio.getPeliculas();
        
        principalV.getBtnPeliculas().addActionListener(this);
        principalV.getBtnSeries().addActionListener(this);
        principalV.getBtnNuevo().addActionListener(this);
        principalV.getBtnEliminar().addActionListener(this);
        segundaV.getBtnAtras().addActionListener(this);
        segundaV.getRadBtnPeli().addActionListener(this);
        segundaV.getRadBtnSerie().addActionListener(this);
        segundaV.getBtnAgregar().addActionListener(this);
        principalV.getTablaVista().getSelectionModel().addListSelectionListener(this);
        
        inicioPorDefecto();
    }
    
    public void inicioPorDefecto(){
        int pos= 0;
        principalV.setLabelTitulo(listaSeries.get(pos).getTitle());
        principalV.setLabelDescripcion(listaSeries.get(pos).getDescription());
        principalV.setLabelDuracion(listaSeries.get(pos).getDuration());
        principalV.setLabelCategoria(listaSeries.get(pos).getCategoria());
        principalV.setLabelEpisodios(listaSeries.get(pos).getEpisode());
        principalV.setLabelTemporadas(listaSeries.get(pos).getSeason());
        imagenLabel(principalV.getLabelIcon(), listaSeries.get(pos).getPath());

        mostrar();
    }
    
    public void mostrar(){
        principalV.setModel(new DefaultTableModel());
        int i = 1;
        if(!principalV.getBtnPeliculas().isEnabled()){
            
            String[] nombreColumnas = new String[] { "id",
                                                     "titulo", 
                                                     "duracion", 
                                                     "categoria" 
                                                   };

            principalV.getModel().setColumnIdentifiers(nombreColumnas);

            for(Pelicula pelis : this.listaPeliculas){
                principalV.getModel().addRow(new Object[] {String.valueOf(pelis.getId()+ i),
                                                              pelis.getTitle(),
                                                              pelis.getDuration(),
                                                              pelis.getCategoria()});
                i++;
            }
        
        principalV.getTablaVista().setModel(principalV.getModel());
        principalV.getModel().fireTableDataChanged();
        principalV.getTablaVista().repaint();
        
        }else if(!principalV.getBtnSeries().isEnabled()){
            
            String[] nombreColumnas = new String[] { "id",
                                                     "titulo", 
                                                     "duracion", 
                                                     "categoria",
                                                   };

            principalV.getModel().setColumnIdentifiers(nombreColumnas);
            
            for(Serie tvShow : listaSeries){
            principalV.getModel().addRow(new Object[] {String.valueOf(tvShow.getId() + i),
                                                          tvShow.getTitle(), 
                                                          tvShow.getDuration(), 
                                                          tvShow.getCategoria(),
                                                          });
                i++;
            }
            
            principalV.getTablaVista().setModel(principalV.getModel());
            principalV.getModel().fireTableDataChanged();
            principalV.getTablaVista().repaint();
        }
        
    }
    
    public void vaciar(){
        segundaV.getTxtBoxCover().setText("");
        segundaV.getTxtBoxDuracion().setText("0");
        segundaV.getTxtBoxEpisodio().setText("0");
        segundaV.getTxtBoxGenero().setText("");
        segundaV.getTxtBoxSynopsis().setText("");
        segundaV.getTxtBoxTemporada().setText("0");
        segundaV.getTxtBoxTitulo1().setText("");
    }
    
    public void imagenLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH ));
        
        labelName.setIcon(icon);
        principalV.repaint();
    }
    
    public void validacionCamposObli(){
        if (segundaV.getTxtBoxSynopsis().getText().isBlank() || segundaV.getTxtBoxTitulo1().getText().isBlank() || segundaV.getTxtBoxGenero().getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Llene los espacios obligatorios (*)");
        }
        else{
            if(segundaV.getRadBtnPeli().isSelected()){
                
                String titulo = segundaV.getTxtBoxTitulo1().getText();
                String descripcion = segundaV.getTxtBoxSynopsis().getText();
                int duracion = Integer.parseInt(segundaV.getTxtBoxDuracion().getText());
                String genero = segundaV.getTxtBoxGenero().getText();
                String cover = segundaV.getTxtBoxCover().getText();
                
                servicio.insertar(new Pelicula(listaPeliculas.size(), titulo, descripcion, duracion, genero, cover));
                
                JOptionPane.showMessageDialog(null, "Se agregó " + titulo + ", satisfactoriamente");
                vaciar();
            }
            if(segundaV.getRadBtnSerie().isSelected()){
                
                String titulo = segundaV.getTxtBoxTitulo1().getText();
                String descripcion = segundaV.getTxtBoxSynopsis().getText();
                int duracion = Integer.parseInt(segundaV.getTxtBoxDuracion().getText());
                String genero = segundaV.getTxtBoxGenero().getText();
                String cover = segundaV.getTxtBoxCover().getText();
                int episodio = Integer.parseInt(segundaV.getTxtBoxEpisodio().getText());
                int temporada = Integer.parseInt(segundaV.getTxtBoxTemporada().getText());
                
                servicio.insertar(new Serie(listaPeliculas.size(), titulo, descripcion, duracion, genero, cover, temporada, episodio));
                
                JOptionPane.showMessageDialog(null, "Se agregó " + titulo + ", satisfactoriamente");
                vaciar();
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == principalV.getBtnPeliculas()){
            principalV.getBtnPeliculas().setEnabled(false);
            principalV.getBtnSeries().setEnabled(true);
            mostrar();
        }
        if(e.getSource() == principalV.getBtnSeries()){
            principalV.getBtnPeliculas().setEnabled(true);
            principalV.getBtnSeries().setEnabled(false);
            mostrar();
        }
        if(e.getSource() == principalV.getBtnNuevo()){
            principalV.setVisible(false);
            segundaV.setVisible(true);
            segundaV.setLocationRelativeTo(null);
            segundaV.getRadBtnSerie().setSelected(true);
            vaciar();
        }
        if(e.getSource() == segundaV.getBtnAtras()){
            principalV.setVisible(true);
            segundaV.dispose();
            mostrar();
        }
        if(e.getSource() == segundaV.getRadBtnPeli()){
            segundaV.getTxtBoxTemporada().setEditable(false);
            segundaV.getTxtBoxEpisodio().setEditable(false);
            vaciar();
        }
        if(e.getSource() == segundaV.getRadBtnSerie()){
            segundaV.getTxtBoxTemporada().setEditable(true);
            segundaV.getTxtBoxEpisodio().setEditable(true);
            vaciar();
        }
        if(e.getSource() == segundaV.getBtnAgregar()){
            this.validacionCamposObli();
        }
        if(e.getSource() == principalV.getBtnEliminar()){
            if(!principalV.getBtnPeliculas().isEnabled()){
                servicio.eliminarPelis(principalV.getTablaVista().getSelectedRow());
                mostrar(); 
            }else{
                servicio.eliminarSerie(principalV.getTablaVista().getSelectedRow());
                mostrar();
            }
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int currentRow = principalV.getTablaVista().getSelectedRow();
        
        if (currentRow >= 0){
            if (!principalV.getBtnPeliculas().isEnabled()){
                principalV.setLabelTitulo(listaPeliculas.get(currentRow).getTitle());
                principalV.setLabelDescripcion(listaPeliculas.get(currentRow).getDescription());
                principalV.setLabelDuracion(listaPeliculas.get(currentRow).getDuration());
                principalV.setLabelCategoria(listaPeliculas.get(currentRow).getCategoria());
                principalV.setLabelEpisodios("");
                principalV.setLabelTemporadas("");
                imagenLabel(principalV.getLabelIcon(), listaPeliculas.get(currentRow).getPath());
            }else{
                principalV.setLabelTitulo(listaSeries.get(currentRow).getTitle());
                principalV.setLabelDescripcion(listaSeries.get(currentRow).getDescription());
                principalV.setLabelDuracion(listaSeries.get(currentRow).getDuration());
                principalV.setLabelCategoria(listaSeries.get(currentRow).getCategoria());
                principalV.setLabelEpisodios(listaSeries.get(currentRow).getEpisode());
                principalV.setLabelTemporadas(listaSeries.get(currentRow).getSeason());
                principalV.setLabelDescripcion(listaSeries.get(currentRow).getDescription());
                imagenLabel(principalV.getLabelIcon(), listaSeries.get(currentRow).getPath());

            }
       }
        
    }

}

 
