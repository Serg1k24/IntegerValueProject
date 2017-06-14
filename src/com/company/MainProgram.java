package com.company;

public class MainProgram {

    public static void main(String[] args) {
	    IntegerValue iv = new IntegerValue(1);
	    Printer vcl = new Printer();
	    iv.addValueChangeListener(vcl);

	    iv.setValue(10);
    }
}
