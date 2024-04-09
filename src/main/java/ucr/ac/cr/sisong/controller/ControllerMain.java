/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sisong.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.sisong.model.SongArray;
import ucr.ac.cr.sisong.view.GUIAlbums;
import ucr.ac.cr.sisong.view.GUIMain;

/**
 *
 * @author Core i5
 */
public class ControllerMain implements ActionListener{
    
    private GUIMain guiMain;
    private ControllerSong controllerSong;
    private SongArray songArray;
    private GUIAlbums guiAlbums;
    private ControllerAlbum controllerAlbum;
    
    public ControllerMain(){
        this.guiMain = new GUIMain();
        this.guiMain.listen(this);
        this.songArray = new SongArray();
        //referencia de artistas>>
        this.guiMain.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()) {
            case "Exit":
                System.exit(0);
                break;
                
            case "Songs":
                this.controllerSong = new ControllerSong(songArray);
                break;
            case "Artists":
                
                break;
            case "Albums":
                this.controllerAlbum = new ControllerAlbum(songArray);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
