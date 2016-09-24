//This program uses a parameterized method.

class Box {
double width;
double height;
double depth;

//compute and return volume
double volume(){
return width*height*depth;
}

void setDim(double a,double b,double c){
width=a;
height=b;
depth=c;
}
}

class BoxDemo5 {
public static void main(String[] args) {
Box mybox1 = new Box();
Box mybox2 = new Box();

mybox1.setDim(10,20,30);
mybox2.setDim(20,30,40);

System.out.println("Volume is "+mybox1.volume());
System.out.println("Volume is "+mybox2.volume());

}
}
