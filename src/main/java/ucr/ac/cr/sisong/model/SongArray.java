/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sisong.model;
import java.util.ArrayList;

/**
 *
 * @author lara3
 */
public class SongArray {
    private ArrayList<Song> listSongs;
    private ArrayList<Song> listSongsSelected;
    
    public SongArray(){
        this.listSongs=new ArrayList<>();
    }
    
    public Song searchSong(int idSong)
    {
        for (Song song : this.listSongs) {
            if (song.getIdSong()==idSong){
                return song;
            }
        }
        return null;
    }
    public String add(Song song)
    {
        if (song!=null){
            if(searchSong(song.getIdSong())==null)
            {
                listSongs.add(song);
                return "Song added successfully.";
            }else{
                return "the song is registred.";
            }
        }
        return "Error adding song";
    }
    public String delete(int idSong){
        if (this.listSongs.remove(this.searchSong(idSong)))
        {
            return "delete successfully";
        }
        return "Error when deletinh song.";
    }
    public String edit(Song songEdit){
        for (int i = 0; i < this.listSongs.size(); i++) {
            if(this.listSongs.get(i).getIdSong()==songEdit.getIdSong()){
            this.listSongs.set(i, songEdit);
            return"Song successfully modified";
            }
        }
        return "Error when modified song";
    }
    @Override
    public String toString (){
        String out="List songs:";
        for (Song song : listSongs) {
            out+="\n"+song;            
        }
      return out;
    }

    public int getIdLabel(){
        if (this.listSongs.size()>0){
           return this.listSongs.get(this.listSongs.size()-1).getIdSong()+1;
        }
        return 1;        
    }
    public String[] getIdCombo(){
        String [] idsList=new String[this.listSongs.size()];
            for (int i = 0; i < this.listSongs.size(); i++) {
                idsList[i]=this.listSongs.get(i).getIdSong()+"-"+this.listSongs.get(i).getTitle();
            }
        return idsList;
    }     
    public String[][] getMatrizSongs(){
        String[][] matrizSongs =new String[this.listSongs.size()][Song.TITLE_SONG.length];
        for (int i = 0; i < matrizSongs.length; i++) {
            for (int j = 0; j < matrizSongs[0].length; j++) {
              matrizSongs[i][j] = this.listSongs.get(i).getDataSong(j);
              
            }
        }
        return matrizSongs;
    } 
    
    public void addSongSelected(Song song){
        listSongsSelected.add(song);
    }
    
    public String[][] getSelectedSongSelected(){
        String[][] matrixSongs = new String[this.listSongsSelected.size()][Song.TITLE_SONG.length];
        
            for (int i = 0; i < matrixSongs.length; i++) {
                for (int j = 0; j < matrixSongs[0].length; j++) {
                    matrixSongs[i][j] = this.listSongsSelected.get(i).getDataSong(j);
                }
            }
        return matrixSongs;
    }
            
}
