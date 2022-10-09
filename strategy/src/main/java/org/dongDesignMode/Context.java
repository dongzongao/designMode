package org.dongDesignMode;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void go(){
        strategy.goHome();
    }
}