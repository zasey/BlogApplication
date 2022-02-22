package ru.alishev.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.alishev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return ClassicalMusic.getClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public TrapMusic trapMusic(){
        return new TrapMusic();
    }
    @Bean
    public ArrayList<Music> musicList(){
        ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(trapMusic());
        musicList.add(classicalMusic());
        return musicList;
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
