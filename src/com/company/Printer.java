package com.company;

/**
 * Created by someone on 6/14/17.
 */
public class Printer implements ValueChangeListener {
    @Override
    public void update(int newValue) {
        System.out.println(newValue + " is now the new Value");
    }
}
