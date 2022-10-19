package com.study.demo.designpattern.observer.observer1;

/**
 * 主题接口，供观察者订阅监听
 */
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
