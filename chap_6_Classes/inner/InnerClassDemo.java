//Demonstrate an inner class.
class Outer {
int outer_x = 200;

void test(){
Inner in = new Inner();
in.display();
}

//this is an inner class 
class Inner {
void display(){
System.out.println("display: outer_x = "+outer_x);
}
}
}


class InnerClassDemo {
public static void main(String[] args){
Outer outer = new Outer();
outer.test();
}
}

