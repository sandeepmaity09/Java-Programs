class Box {
double width;
double height;
double depth;

double volume(){
return width*height*depth;
}
}

class BoxDemo4 {
public static void main(String[] args) {
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol;

//Assign values to mybox1's instance variables
mybox1.width=10;
mybox1.height=20;
mybox1.depth=30;

//Assign values to mybox2's instance variables
mybox2.width=20;
mybox2.height=30;
mybox2.depth=40;

//get volume of first box
vol=mybox1.volume();
System.out.println("Volume is : "+vol);

//get volume of second box
vol=mybox2.volume();
System.out.println("Volume is : "+vol);

}
}
