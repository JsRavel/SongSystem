/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sisong.model;

/**
 *
 * @author NomiH
 */
public class Song {
    String title,musicGenre;
    int idSong,realseYear;
    double time;
    public static final String[]TITLE_SONG = {"ID","Title","Duration","Genre","Release year"};

    public Song(String title, String musicGenre, int idSong, int realseYear, double time) {
        this.title = title;
        this.musicGenre = musicGenre;
        this.idSong = idSong;
        this.realseYear = realseYear;
        this.time = time;
    }
    
    public String getDataSong(int colum){
        switch (colum) {
            case 0: return String.valueOf(this.getIdSong());
            case 1: return this.getTitle();
            case 2: return String.valueOf(this.getTime());
            case 3: return this.getMusicGenre();
            case 4: return String.valueOf(this.getRealseYear());
            
        }
        return "";
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public int getRealseYear() {
        return realseYear;
    }

    public void setRealseYear(int realseYear) {
        this.realseYear = realseYear;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", musicGenre=" + musicGenre + ", idSong=" + idSong + ", realseYear=" + realseYear + ", time=" + time + '}';
    }
    
}
