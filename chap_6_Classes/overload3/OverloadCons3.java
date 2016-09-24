class OverloadCons3 {
public static void main(String[] args) {

//creates boxes using various constructors.
Box mybox1 = new Box(10,20,15);
Box mybox2 = new Box();
Box mybox3 = new Box(5);

Box myclone = new Box(mybox1);  //creates copy of mybox1
//Box myclone = mybox1;

double vol;

//get volume of first box
vol = mybox1.volume();
System.out.println("Volume of mybox1 is "+vol);

//get volume of second box
vol = mybox2.volume();
System.out.println("Volume of mybox2 is "+vol);

//get volume of third box
vol = mybox3.volume();
System.out.println("Volume of mybox3 is "+vol);

/*
mybox1.width=22;
mybox1.height=23;
mybox1.depth=52;
*/

//get volume of fourth box
vol = myclone.volume();
System.out.println("Volume of myclone is "+vol);

}
}
