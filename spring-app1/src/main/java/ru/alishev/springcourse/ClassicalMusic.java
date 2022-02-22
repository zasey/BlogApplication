package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music{

    List<String> songs = new ArrayList<>();

    private ClassicalMusic(){
        songs.add("classical song #1");
        songs.add("classical song #2");
        songs.add("classical song #3");
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization!");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction!");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
