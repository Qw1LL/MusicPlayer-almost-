package ru.Gaakh.Test.genre;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String  getSong() {
        return "Deliver us from evil";
    }
}
