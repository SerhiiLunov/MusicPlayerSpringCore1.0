package com.lunov.musicplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

        private List<Music> musicList1;

//    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList1 = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList1.get(random.nextInt(musicList1.size())).getSong()
                + " with volume " + this.volume;
    }
}
