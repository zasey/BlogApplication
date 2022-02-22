package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music{

    private List<String> songs = new ArrayList<>();

    public RockMusic(){
        songs.add("rock song #1");
        songs.add("rock song #2");
        songs.add("rock song #3");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

}
