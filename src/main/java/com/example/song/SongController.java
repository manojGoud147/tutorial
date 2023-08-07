/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import com.example.song.SongService;
import com.example.song.Song;

@RestController
public class SongController{
    SongService songService = new SongService();

    @GetMapping("/")
    public ArrayList<Song> getSongs(){
        return songService.getSongs();
    }
    @GetMapping("/bookd/{bookId}")
    public Song getSongId(int id)


}