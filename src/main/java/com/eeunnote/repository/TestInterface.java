package com.eeunnote.repository;

public interface TestInterface {
    String test();
    default boolean test2() {
        return true;
    }
}
