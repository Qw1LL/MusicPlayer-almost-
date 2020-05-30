package ru.Gaakh.Test.genre;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music{
    private static final List<String> songs = new ArrayList<>();

    static {
        songs.add("Pop's sheet 1");
        songs.add("Pop's sheet 2");
        songs.add("Pop's sheet 3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
