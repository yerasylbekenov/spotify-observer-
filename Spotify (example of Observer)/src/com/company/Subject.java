package com.company;

public interface Subject {
    void attachObserver(Observer o);
    void dettachObserver(Observer o);
    void notifyObserver();
}
