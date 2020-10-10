package com.company;

// Every class implicitly inherits from the Object class
// Can override all Object class methods except the wait and notify methods

public class LangDemo {
    @Override
    public String toString() {
        return "My Object";
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}

