//Demonstrate boolean values.
class BoolTest {
public static void main(String[] args) {
boolean b;
b=false;
System.out.println("b is "+b);
b=true;
System.out.println("b is "+b);
if(b)
System.out.println("This is exectued");
b=false;
if(b)
System.out.println("This is not exectuted");

//Outcome of a relational operator is a boolean value
System.out.println("10 > 9 is "+(10<9));
}
}
