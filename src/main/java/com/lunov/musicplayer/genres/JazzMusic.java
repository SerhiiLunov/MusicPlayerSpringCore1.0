package com.lunov.musicplayer.genres;

import com.lunov.musicplayer.Music;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}
