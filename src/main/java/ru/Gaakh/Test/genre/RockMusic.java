package ru.Gaakh.Test.genre;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private static final List<String> songs = new ArrayList<>();

    static {
        songs.add("Deliver us from evil");
        songs.add("Say goodbye");
        songs.add("When All the Seraphim Cry");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
