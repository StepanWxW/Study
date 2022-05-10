package chapter07;

public class Box {
    double wigft;
    double hight;
    double depth;

    Box (Box ob) {
        wigft = ob.wigft;
        hight = ob.hight;
        depth = ob.depth;
    }
    Box (double w, double h, double d) {
        wigft = w;
        hight = h;
        depth = d;
    }
    Box() {
        wigft =-1;
        hight=-1;
        depth=-1;
    }
    Box (double len) {
        wigft = hight =depth = len;

    }
    double volume () {return wigft * hight * depth;}
}
