package com.study.demo.designpattern.observer.observer1;

import java.util.ArrayList;
import java.util.List;

public class QianTai implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update();
        }
    }

}
