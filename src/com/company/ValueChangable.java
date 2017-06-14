package com.company;

/**
 * Created by someone on 6/14/17.
 */
public interface ValueChangable {
    void addValueChangeListener(ValueChangeListener l);
    void removeValueChangeListener(ValueChangeListener l);
    void notifyListeners(int value);
}
