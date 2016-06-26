package com.example;

import co.paralleluniverse.fibers.Fiber;

public class fiber<V> extends Fiber<V> {

    public fiber(FiberCallable<V> callable) {
        super(callable);
    }
}
