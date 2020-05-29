package ru.Gaakh.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Computer {
    private static int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void openAndStarMusic(){
        System.out.println("Computer " + ++id + " playing: \n" + musicPlayer.playMusic());
    }
}
