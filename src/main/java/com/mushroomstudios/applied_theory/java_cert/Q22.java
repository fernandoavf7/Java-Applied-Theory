package com.mushroomstudios.applied_theory.java_cert;

interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
    //public void setMargin() {}
    //Line 9
}

abstract class Q22 extends Paper { //Line 12
    public void setMargin() {}
    //Line 14

	//public void setOrientation() {}
}

