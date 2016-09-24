//Here Box allows one object to initializes another.

class Box {

double width;
double height;
double depth;

//Notice this constructor. It takes an object of type Box.
Box(Box b){
this.width=b.width;
this.height=b.height;
this.depth=b.depth;
}

//constructor used when all dimensions  specified.
Box(double w,double h,double d){
width=w;
height=h;
depth=d;
}

//constructor used when no dimesion specified.
Box(){
width=-1;
height=-1;
depth=-1;
}

//constructor used when cube is created.
Box(double len){
width=height=depth=len;
}

//compute and return volume
double volume(){
return width*height*depth;
}

}
