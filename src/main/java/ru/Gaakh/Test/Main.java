package ru.Gaakh.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.Gaakh.Test.genre.Ganre;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        computer.openAndStarMusic(Ganre.ROCKMUSIC);


    }
}
