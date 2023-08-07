// Write your code here
package com.example.song;

public class Song{
    int songId;
    String songName;
    String lyricist;
    String singer;
    String musicDirector;

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector){
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }
}