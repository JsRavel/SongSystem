/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sisong.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import ucr.ac.cr.sisong.model.Song;
import ucr.ac.cr.sisong.model.SongArray;
import ucr.ac.cr.sisong.view.DataPanelSong;
import ucr.ac.cr.sisong.view.GUIAlbums;

/**
 *
 * @author Core i5
 */
public class ControllerAlbum implements ActionListener{

    private GUIAlbums guiAlbums;
    private SongArray songArray;
    private Song song;
    
    
    
    public ControllerAlbum(SongArray songArray){
        this.guiAlbums = new GUIAlbums();
        this.songArray = songArray;
        
        this.guiAlbums.setVisible(true);
        guiAlbums.setDataTable(this.songArray.getMatrizSongs(), Song.TITLE_SONG);
        this.guiAlbums.listen(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Close":
                this.guiAlbums.dispose();
                break;
                
            case "Add":
                String []info = this.guiAlbums.getDataRow();
                System.err.println(info);
                break;
                
            case "":
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void mouseClicked(MouseEvent e){
        
        new Song(this.guiAlbums.getDataRow()[1],
                this.guiAlbums.getDataRow()[3],
                Integer.parseInt(this.guiAlbums.getDataRow()[0]),
                Integer.parseInt(this.guiAlbums.getDataRow()[4]), 
                Double.parseDouble(this.guiAlbums.getDataRow()[2])));
        
        
    }
    
    
    
}
