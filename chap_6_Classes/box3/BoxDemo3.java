//This program includes a method inside the box class.

class Box {
double width;
double height;
double depth;

//display volume of a box

void volume(){
System.out.print("Volume is ");
System.out.println(width*height*depth);
}
}

class BoxDemo3 {
public static void main(String[] args) {
Box mybox1 = new Box();
Box mybox2 = new Box();

//assign values to mybox's instance variables
mybox1.width=10;
mybox1.height=20;
mybox1.depth=30;

mybox2.width=20;
mybox2.height=30;
mybox2.depth=40;

mybox1.volume();
mybox2.volume();
}
}

