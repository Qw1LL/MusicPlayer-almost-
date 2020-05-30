package ru.Gaakh.Test.genre;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music{
    private static final List<String> songs = new ArrayList<>();

    static {
        songs.add("Serenade");
        songs.add("Rossini: William Tell - Overture");
        songs.add("Spring - Frühlingserwachen");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
