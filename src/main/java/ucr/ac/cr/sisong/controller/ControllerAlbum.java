/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sisong.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;
import ucr.ac.cr.sisong.model.Song;
import ucr.ac.cr.sisong.model.SongArray;
import ucr.ac.cr.sisong.view.DataPanelSong;
import ucr.ac.cr.sisong.view.GUIAlbums;

/**
 *
 * @author Core i5
 */
public class ControllerAlbum implements ActionListener, MouseListener{

    private GUIAlbums guiAlbums;
    private SongArray songArray;
    private Song song;
    
    
    
    public ControllerAlbum(SongArray songArray){
        this.guiAlbums = new GUIAlbums();
        this.songArray = songArray;
        this.guiAlbums.setVisible(true);
        guiAlbums.setDataTableRegistered(this.songArray.getMatrizSongs(), Song.TITLE_SONG);
        this.guiAlbums.listen(this);
        
    }
    
    @Override
public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
        case "Close":
            this.guiAlbums.dispose();
            break;
            
        case "Add":
            // Obtener la canción seleccionada de tblRegisteredSongs
            String[] selectedSong = guiAlbums.getDataRow();
            
            // Añadir la canción seleccionada a la tabla tblAlbumSongs
//            DefaultTableModel model = (DefaultTableModel) guiAlbums.getTblAlbumSongs().getModel();
//            model.addRow(selectedSong);
            guiAlbums.setDataTableAlbums(new String[][]{selectedSong}, Song.TITLE_SONG);
            break;
            
        default:
            throw new AssertionError();
    }
}



    @Override
    public void mouseClicked(MouseEvent e) {
         Song song = new Song(this.guiAlbums.getDataRow()[1], this.guiAlbums.getDataRow()[3],Integer.parseInt(this.guiAlbums.getDataRow()[0]),Integer.parseInt(this.guiAlbums.getDataRow()[4]), Double.parseDouble(this.guiAlbums.getDataRow()[2]));
         
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
