package com.company;

import java.util.ArrayList;

/**
 * Created by someone on 6/14/17.
 */
public class IntegerValue implements IntegerValueInterface,
                                     ValueChangable {
    private int x;
    private ArrayList<ValueChangeListener> valueChangeListeners = new ArrayList<>();

    public IntegerValue(int x) {
        this.x = x;
    }

    @Override
    public int getValue() {
        return x;
    }

    @Override
    public void setValue(int value) {
        x = value;
        notifyListeners(value);
    }

    @Override
    public void addValueChangeListener(ValueChangeListener l) {
        valueChangeListeners.add(l);
    }

    @Override
    public void removeValueChangeListener(ValueChangeListener l) {
        valueChangeListeners.remove(l);
    }

    @Override
    public void notifyListeners(int value) {
        for (ValueChangeListener vcl : valueChangeListeners)
            vcl.update(value);
    }
}
