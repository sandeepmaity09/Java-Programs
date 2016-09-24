class OverloadCons{
public static void main(String ...k){

//create boxes using the various constructors
Box mybox1 = new Box(10,20,15);
Box mybox2 = new Box();
Box mybox3 = new Box(7);

double vol;

//get the volume of first box
vol = mybox1.volume();
System.out.println("Volume of mybox1 is "+vol);

//get the volume of second box
vol = mybox2.volume();
System.out.println("Volume of mybox2 is "+vol);

//get volume of cube
vol = mybox3.volume();
System.out.println("Volume of mybox3 (cube) is "+vol);

}
}

