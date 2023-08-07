// Write your code here
package com.example.song;

import java.util.ArrayList;
import com.example.song.Song;

public interface SongRepository{
    ArrayList<Song> getSongs();
    Song getSongId(int songId);

}

