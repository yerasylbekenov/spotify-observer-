package com.company;

import java.util.ArrayList;

public class Listeners  implements Observer{
    String username;

    public Listeners(String username){
        this.username = username;
    }

    public void checkSpotify(ArrayList<NewMusic> n){
        for(int i=0; i<n.size();i++){
            if(username.compareTo(n.get(i).listenerName) == 0){
                System.out.println(username+", '"+n.get(i).artistName +" - "+n.get(i).newSongName+"' is out now, go listen!");
            }
        }
    }
    @Override
    public void update(Object obj){
        if(obj instanceof Spotify){
            Spotify spo = (Spotify) obj;
            checkSpotify(spo.getState());
        }
    }
}
