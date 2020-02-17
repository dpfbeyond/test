package com.shape;

public interface Shape {
    String getName();

    // the following two methods could also be abstract,
// in which case we could have defined Shape to be an interface
    double getArea();

    // shape volume, default 0
    double getVolume();
}
