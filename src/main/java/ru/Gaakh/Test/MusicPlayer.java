package ru.Gaakh.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.Gaakh.Test.genre.Music;

import java.util.List;

@Component
@Scope("prototype")
public class MusicPlayer {
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

    public String playMusic() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Music music : musicList) {
            stringBuilder.append(music.getSong()).append("\n");
        }
        return stringBuilder.toString().trim();
    }

}
