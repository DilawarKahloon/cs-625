/* In a class hierarchy, private members remain private to their class.
This program contains an error and will not compile.
*/
// Create a superclass. class A { int i; // public by default private int j; // private to A
void setij(int x, int y) { i = x; j = y; }
}
// A's j is not accessible here. class B extends A { int total; void sum() { total = i + j; // ERROR, j is not accessible here } }
class Access { public static void main(String args[]) { B subOb = new B();
subOb.setij(10, 12);
subOb.sum(); System.out.println("Total is " + subOb.total);
}
}
// constructor for BoxWeight BoxWeight(double w, double h, double d, double m) { width = w; height = h; depth = d; weight = m; }
}
class DemoBoxWeight { public static void main(String args[]) { BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3); BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076); double vol;
vol = mybox1.volume(); System.out.println("Volume of mybox1 is " + vol); System.out.println("Weight of mybox1 is " + mybox1.weight); System.out.println();
vol = mybox2.volume(); System.out.println("Volume of mybox2 is " + vol); System.out.println("Weight of mybox2 is " + mybox2.weight);
}
}
