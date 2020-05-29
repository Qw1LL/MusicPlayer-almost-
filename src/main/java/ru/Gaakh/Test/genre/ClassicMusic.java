package ru.Gaakh.Test.genre;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    @Override
    public String getSong() {
       return "7th Symphony";
    }
}
