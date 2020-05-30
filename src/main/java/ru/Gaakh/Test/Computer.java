package ru.Gaakh.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.Gaakh.Test.genre.Ganre;

@Component
@Scope("prototype")
public class Computer {
//    private static int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void openAndStarMusic(Ganre ganre){
        System.out.println("Playing: \n" + musicPlayer.playMusic(ganre));
    }

    public String  getPlayerName(){
        return musicPlayer.getName();
    }

    public int getPlayerVolume(){
       return musicPlayer.getVolume();
    }

    public void setPlayerVolume(int volume) {
        musicPlayer.setVolume(volume);
    }
}
