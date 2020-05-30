package ru.Gaakh.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.Gaakh.Test.genre.Ganre;
import ru.Gaakh.Test.genre.Music;

import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    private final static Random random = new Random();
    private List<Music> musicList;

    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(Ganre ganre) {
        String result = "";
        int randomNumber = random.nextInt(musicList.size());

        switch (ganre) {
            case ROCKMUSIC:
                result = musicList.get(2).getSong().get(randomNumber);
                break;
            case POPMUSIC:
                result = musicList.get(1).getSong().get(randomNumber);
                break;
            case CLASSICMUSIC:
                result = musicList.get(0).getSong().get(randomNumber);
                break;
        }

        return result;
    }

}
