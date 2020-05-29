package ru.Gaakh.Test.genre;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String  getSong() {
        return "Попсовая хрень";
    }
}
