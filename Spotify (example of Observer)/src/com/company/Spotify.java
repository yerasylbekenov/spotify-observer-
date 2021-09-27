package com.company;

import java.util.ArrayList;

public class Spotify implements Subject{
    private ArrayList<NewMusic> newMusics;
    private ArrayList<Observer> observers;

    public Spotify (){
        newMusics = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addNewMusic(NewMusic newMusic){
        newMusics.add(newMusic);
        notifyObserver();
    }

    public ArrayList<NewMusic> getState(){
        return newMusics;
    }

    @Override
    public void attachObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void dettachObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update(this);
        }
    }
}
