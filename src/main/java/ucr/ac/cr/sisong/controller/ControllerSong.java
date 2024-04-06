/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sisong.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.sisong.model.Song;
import ucr.ac.cr.sisong.model.SongArray;
import ucr.ac.cr.sisong.view.ButtonPanel;
import ucr.ac.cr.sisong.view.DataPanelSong;
import ucr.ac.cr.sisong.view.GUIMain;
import ucr.ac.cr.sisong.view.GUIReport;
import ucr.ac.cr.sisong.view.GUISong;

/**
 *
 * @author lara3
 */
public class ControllerSong implements ActionListener, MouseListener{
    
    private GUISong guiSong;
    private DataPanelSong dataPanelSong;
    private ButtonPanel buttonPanel;
    private SongArray songArray;
    private Song song;
    private GUIReport guiReport = new GUIReport();
    private GUIMain main =  new GUIMain();
    
    public ControllerSong(SongArray songArray){
        
        this.guiSong=new GUISong();
        this.dataPanelSong=this.guiSong.getDataPanelSong();
        this.buttonPanel=this.guiSong.getButtonsPanel();
        this.buttonPanel.listen(this);
        this.dataPanelSong.listenCombo(this);
        this.songArray= songArray;
        this.dataPanelSong.setLbIdSong(this.songArray.getIdLabel());
        this.guiSong.setVisible(true);
        this.dataPanelSong.addGenre();
        this.main.listen(this);
    }//constructor
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand())
        {
            case "Add":
                this.song=this.dataPanelSong.getSong();
                if (this.song!=null){
                    if(this.validationData(song)==true){
                        guiSong.setMessage(this.songArray.add(song));
                        this.dataPanelSong.setCbSong(this.songArray.getIdCombo());
                        this.dataPanelSong.setEditCbCombo(true);
                        this.dataPanelSong.clean();               
                        this.dataPanelSong.setLbIdSong(this.songArray.getIdLabel());
                    }
                }
               
            break;
                
            case "Delete":
                this.song = this.dataPanelSong.getSong();
                
                if (this.song != null) {
                    guiSong.setMessage(this.songArray.delete(song.getIdSong()));
                    this.dataPanelSong.clean();
                    this.dataPanelSong.setCbSong(this.songArray.getIdCombo());
                    this.dataPanelSong.setEditCbCombo(true);
                    this.dataPanelSong.setLbIdSong(this.songArray.getIdLabel());
                }
            break;
            
            case "Report":
                this.guiReport = new GUIReport();
                guiReport.setDataTable(this.songArray.getMatrizSongs(), Song.TITLE_SONG);
                guiReport.listenMouse(this);
                guiReport.setVisible(true);
            break;
            
            case "Edit":
                
                guiSong.setMessage(this.songArray.edit(this.dataPanelSong.getSong()));
                this.dataPanelSong.clean();
                this.dataPanelSong.setCbSong(this.songArray.getIdCombo());
                this.dataPanelSong.setEditCbCombo(true);
                this.dataPanelSong.setLbIdSong(this.songArray.getIdLabel());
            break;
            case "cbSong":
                String id=this.dataPanelSong.getCbSong();
                if(id.equalsIgnoreCase("Selected option")){ 
                }
                if(!id.equalsIgnoreCase("Selected option")){
                    this.song=this.songArray.searchSong(Integer.parseInt(id.substring(0,id.indexOf("-"))));
                    this.dataPanelSong.setSong(song);
                }
            break; 
            case "Exit":
                this.guiSong.dispose();
        }
    }
    public boolean validationData(Song songValidate){
            if (songValidate.getTitle().isEmpty()){
                GUISong.setMessage("The title field is empty");
                return false;
            }
            else if(songValidate.getTime()==0.1){
                GUISong.setMessage("The duration field is empty");
                return false;
            }else if(songValidate.getMusicGenre().equals("selected otion")){
                GUISong.setMessage("The duration field is empty");   
                return false;
            } 
            else{
                return true;
            }
    }    

    @Override
    public void mouseClicked(MouseEvent e) {
        this.dataPanelSong.setSong(
        new Song(this.guiReport.getDataRow()[1],
                this.guiReport.getDataRow()[3],
                Integer.parseInt(this.guiReport.getDataRow()[0]),
                Integer.parseInt(this.guiReport.getDataRow()[4]), 
                Double.parseDouble(this.guiReport.getDataRow()[2])));
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
    
