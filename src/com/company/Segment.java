package com.company;
import java.lang.Math;

public class Segment {
    Point ext1;
    Point ext2;

    Segment(Point ext1, Point ext2){
        this.ext1 = ext1;
        this.ext2 = ext2;
    }

    public void Afficher(){
        this.ext1.Afficher();
        this.ext2.Afficher();
    }
}
