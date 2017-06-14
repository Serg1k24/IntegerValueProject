package com.company;

import java.util.ArrayList;

/**
 * Created by someone on 6/14/17.
 */
public class Trigger {
    private boolean enabled = false;
    private ArrayList<Lamp> lamps = new ArrayList<>();

    void setOn () {
        enabled = true;
    }

    void setOff () {
        enabled = false;
    }

    void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }
}
