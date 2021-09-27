package com.company;

public class Main {

    public static void main(String[] args) {
	    Spotify spotify = new Spotify();
	    Listeners listener1 = new Listeners("elien");
	    NewMusic newSong = new NewMusic("elien", "Mayot", "Music Business");

	    spotify.attachObserver(listener1);

	    spotify.addNewMusic(newSong);
    }
}
